package com.softsquared.template.kotlin.src.main.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.kakao.sdk.auth.model.OAuthToken
import com.kakao.sdk.common.KakaoSdk
import com.softsquared.template.kotlin.config.BaseActivity
import com.softsquared.template.kotlin.databinding.ActivityLoginBinding
import com.kakao.sdk.common.util.Utility
import com.kakao.sdk.user.UserApiClient
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.src.main.MainActivity
import com.softsquared.template.kotlin.src.main.test.TestActivity
import retrofit2.http.Tag

class LoginActivity: BaseActivity<ActivityLoginBinding>(ActivityLoginBinding:: inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        var keyHash = Utility.getKeyHash(this)
//        Log.d("hash", keyHash)

        KakaoSdk.init(this, getString(R.string.kakao_app_key))

        // 로그인 공통 callback 구성
        val callback: (OAuthToken?, Throwable?) -> Unit = { token, error ->
            if (error != null) {
                //Login Fail
                Log.e("Login-Fail:", error.toString())
            }
            else if (token != null) {
                //Login Success
                    Log.d("Token: ", token.accessToken)
                intent = Intent(this, TestActivity::class.java)
                startActivity(intent)
                finish()

            }
        }

        binding.kakaoLogin.setOnClickListener{
            // 카카오톡이 설치되어 있으면 카카오톡으로 로그인, 아니면 카카오계정으로 로그인

            UserApiClient.instance.run {
                if (isKakaoTalkLoginAvailable(this@LoginActivity)) {
                    loginWithKakaoTalk(this@LoginActivity, callback = callback)
                } else {
                    loginWithKakaoAccount(this@LoginActivity, callback = callback)
                }
            }
        }

    }


}
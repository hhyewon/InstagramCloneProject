package com.softsquared.template.kotlin.src.main.home

import android.os.Bundle
import android.util.Log
import android.view.View
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.config.BaseFragment
import com.softsquared.template.kotlin.databinding.FragmentHomeBinding
import com.softsquared.template.kotlin.src.main.home.models.PostSignUpRequest
import com.softsquared.template.kotlin.src.main.home.models.SignUpResponse
import com.softsquared.template.kotlin.src.main.home.models.UserResponse
import com.softsquared.template.kotlin.src.main.home.models.UserSearchResponse

class HomeFragment :
    BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::bind, R.layout.fragment_home),
    HomeFragmentView {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.homeButtonTryGetJwt.setOnClickListener {
            showLoadingDialog(context!!)
            HomeService(this).tryGetUsers()
        }

        binding.homeBtnTryPostHttpMethod.setOnClickListener {
            val email = binding.homeEtId.text.toString()
            val password = binding.homeEtPw.text.toString()
            val postRequest = PostSignUpRequest(email = email, password = password,
                confirmPassword = password, nickname = "test", phoneNumber = "010-0000-0000")
            showLoadingDialog(context!!)
            HomeService(this).tryPostSignUp(postRequest) //서비스를 만들 때 뷰를 넘겨준다
            // 호출을 하면 서비스에 가서 서비스가 이걸 수행을 하고 이걸 다시 뷰에게 요청에대한 결과를 준다
            // 그게 엑티비티에 있는 tryPostSignUp이 함수
        }
        binding.homeBtnTest.setOnClickListener {
            showCustomToast("test클릭")
        }
        binding.homeBtnSearch.setOnClickListener {
            var word = binding.homeEtWord.text.toString()
            showLoadingDialog(context!!)
            HomeService(this).tryGetUserSearch(word) //서비스를 만들 때 뷰를 넘겨준다

        }

    }


    override fun onGetUserSuccess(response: UserResponse) {
        dismissLoadingDialog()
        for (User in response.result) {
            Log.d("HomeFragment", User.toString())
        }
        binding.homeButtonTryGetJwt.text = response.message
        showCustomToast("Get JWT 성공")
    }

    override fun onGetUserFailure(message: String) {
        dismissLoadingDialog()
        showCustomToast("오류 : $message")
    }

    override fun onPostSignUpSuccess(response: SignUpResponse) {
        dismissLoadingDialog()
        binding.homeBtnTryPostHttpMethod.text = response.message
        response.message?.let { showCustomToast(it) }
    }

    override fun onPostSignUpFailure(message: String) {
        dismissLoadingDialog()
        showCustomToast("오류 : $message")
    }

    override fun onGetUserSearchSuccess(response: UserSearchResponse) {
        dismissLoadingDialog()
        for (user in response.result){ //하나씩 뺴오기
            showCustomToast(user.email) //이메일 값 출력
        }

    }

    override fun onGetUserSearchFailure(message: String) {
        dismissLoadingDialog()

    }
}
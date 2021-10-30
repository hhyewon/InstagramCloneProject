package com.softsquared.template.kotlin.src.main

import android.content.Intent
import android.os.Bundle
import com.softsquared.template.kotlin.config.BaseActivity
import com.softsquared.template.kotlin.databinding.ActivityLoginMainBinding

class LoginMainActivity: BaseActivity<ActivityLoginMainBinding>(ActivityLoginMainBinding::inflate) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding.loginMainLlSignUp.setOnClickListener {
            intent = Intent(this, SignUpMainActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.loginMainCv.setOnClickListener {


        }

    }

}
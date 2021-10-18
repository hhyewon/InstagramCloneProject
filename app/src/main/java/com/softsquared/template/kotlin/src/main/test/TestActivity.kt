package com.softsquared.template.kotlin.src.main.test

import android.os.Bundle
import com.softsquared.template.kotlin.config.BaseActivity
import com.softsquared.template.kotlin.databinding.ActivityTestBinding

class TestActivity : BaseActivity<ActivityTestBinding>(ActivityTestBinding:: inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showCustomToast("환영합니다.")
    }
}
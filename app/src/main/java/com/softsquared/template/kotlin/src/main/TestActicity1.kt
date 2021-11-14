package com.softsquared.template.kotlin.src.main

import android.os.Bundle
import com.softsquared.template.kotlin.config.BaseActivity
import com.softsquared.template.kotlin.databinding.ActivityTest1Binding

class TestActicity1:BaseActivity<ActivityTest1Binding>(ActivityTest1Binding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}
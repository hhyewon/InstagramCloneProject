package com.softsquared.template.kotlin.src.main.myPage

import android.os.Bundle
import android.view.View
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.config.BaseFragment
import com.softsquared.template.kotlin.databinding.FragmantTagfeedBinding

class TagFeedFragment:BaseFragment<FragmantTagfeedBinding>(FragmantTagfeedBinding::bind, R.layout.fragmant_tagfeed) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
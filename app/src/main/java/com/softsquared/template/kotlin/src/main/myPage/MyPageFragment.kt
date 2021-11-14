package com.softsquared.template.kotlin.src.main.myPage

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.config.BaseFragment
import com.softsquared.template.kotlin.databinding.FragmentMyPageBinding

class MyPageFragment :
    BaseFragment<FragmentMyPageBinding>(FragmentMyPageBinding::bind, R.layout.fragment_my_page) {


    lateinit var tab1: FeedFragment
    lateinit var tab2: TagFeedFragment


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.mypageIvProfile.background = resources.getDrawable(R.drawable.profile_oval)
        binding.mypageIvProfile.clipToOutline = true

        tab1 = FeedFragment()
        tab2 = TagFeedFragment()



        //중첩 프레그먼트트
       childFragmentManager.beginTransaction().replace(R.id.mypage_fl, tab1)
            .commit()

        binding.mypageTl.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> {
                        replaceView(tab1)
                    }
                    1 -> {
                        replaceView(tab2)
                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

        })


    }

    private fun replaceView(tab: Fragment) {
        var selectedFragment: Fragment? = null
        selectedFragment = tab
        selectedFragment?.let {
            childFragmentManager.beginTransaction().replace(R.id.mypage_tl, it).commit()
        }
    }
}
package com.softsquared.template.kotlin.src.main.myPage

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.config.BaseFragment
import com.softsquared.template.kotlin.databinding.FragmentFeedBinding
import com.softsquared.template.kotlin.src.main.myPage.models.FeedData

class FeedFragment:BaseFragment<FragmentFeedBinding>(FragmentFeedBinding::bind, R.layout.fragment_feed) {


    var feedArrayList = ArrayList<FeedData>()
    private lateinit var feedAdapter: FeedAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        feedAdapter = FeedAdapter(requireActivity(), feedArrayList)
        binding.feedRv.adapter = feedAdapter

        binding.feedRv.layoutManager = GridLayoutManager(requireActivity(),3)


        feedArrayList.add(
            FeedData(
                R.drawable.profile_img
            )
        )

        feedArrayList.add(
            FeedData(
                R.drawable.profile_img
            )
        )
        feedArrayList.add(
            FeedData(
                R.drawable.profile_img
            )
        )
        feedArrayList.add(
            FeedData(
                R.drawable.profile_img
            )
        )
        feedArrayList.add(
            FeedData(
                R.drawable.profile_img
            )
        )
        feedArrayList.add(
            FeedData(
                R.drawable.profile_img
            )
        )


    }
}
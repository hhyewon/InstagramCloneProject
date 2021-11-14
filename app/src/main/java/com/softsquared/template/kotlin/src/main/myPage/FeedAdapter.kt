package com.softsquared.template.kotlin.src.main.myPage

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.softsquared.template.kotlin.databinding.FeedItemBinding
import com.softsquared.template.kotlin.src.main.myPage.models.FeedData

class FeedAdapter (
    private val context: Context, private var feedArrayList: ArrayList<FeedData>):
        RecyclerView.Adapter<FeedAdapter.ViewHolder>(){
    class ViewHolder(val binding: FeedItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: FeedData) {
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedAdapter.ViewHolder {
        val binding = FeedItemBinding.inflate(
            LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(holder: FeedAdapter.ViewHolder, position: Int) {

        Glide.with(context)
            .load(feedArrayList[position].feed)
            .into(holder.binding.feedItems)

    }

    override fun getItemCount(): Int {
        return feedArrayList.size
    }

}




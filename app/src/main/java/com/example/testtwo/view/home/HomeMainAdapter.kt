package com.example.testtwo.view.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testtwo.databinding.ItemNewsBinding
import com.example.testtwo.model.NewsModel

class HomeMainAdapter(
    private val dataNews: List<NewsModel>,
    private val onClickNews: (NewsModel) -> Unit
) :
    RecyclerView.Adapter<HomeMainAdapter.HomeMainViewHolder>() {

    inner class HomeMainViewHolder(val binding: ItemNewsBinding) : RecyclerView.ViewHolder(
        binding.root
    ) {
        fun bindView(data: NewsModel, onClickNews: (NewsModel) -> Unit) {
            binding.ivItemNews.setImageResource(data.image ?: 0)
            binding.tvTitleNews.text = data.title
            binding.tvSubtitleNews.text = data.subTitle

            binding.llNews.setOnClickListener {
                onClickNews(data)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeMainViewHolder =
        HomeMainViewHolder(
            ItemNewsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: HomeMainViewHolder, position: Int) {
        holder.bindView(dataNews[position], onClickNews)
    }

    override fun getItemCount(): Int = dataNews.size
}
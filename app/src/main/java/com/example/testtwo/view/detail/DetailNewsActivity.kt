package com.example.testtwo.view.detail

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testtwo.databinding.ActivityDetailNewsBinding
import com.example.testtwo.model.NewsModel

class DetailNewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setDataToViewDetail()
    }

    private fun setDataToViewDetail() {
        val data = intent.getParcelableExtra<NewsModel>(DATA_NEWS)
        binding.tvDetailTitleNews.text = data?.title
        binding.tvSubtitleNews.text = data?.subTitle
    }

    companion object {
        private const val DATA_NEWS = "dataNews"
        fun navigateToActivityDetail(
            activity: Activity, dataNews: NewsModel) {
            val intent = Intent(activity, DetailNewsActivity::class.java)
            intent.putExtra(DATA_NEWS, dataNews)
            activity.startActivity(intent)
        }
    }
}
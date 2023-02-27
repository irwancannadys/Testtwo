package com.example.testtwo.view.home

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.testtwo.R
import com.example.testtwo.databinding.ActivityHomeMainBinding
import com.example.testtwo.model.CategoryModel
import com.example.testtwo.model.NewsModel
import com.example.testtwo.view.detail.DetailNewsActivity

class HomeMainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mainAdapter = HomeMainAdapter(
            dataNews = populateData(),
            onClickNews = { dataNews ->
                DetailNewsActivity.navigateToActivityDetail(
                    this, dataNews)
            })
        binding.rvNews.adapter = mainAdapter

        val categoryAdapter = CategoryAdapter(populateDataForCategory())
        binding.rvListHorizontal.adapter = categoryAdapter
    }

    private fun populateData(): List<NewsModel> {
        val listData = listOf(
            NewsModel(
                image = R.drawable.ic_launcher_background,
                title = "Hujan Terus nih",
                subTitle = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
            ),
            NewsModel(
                image = R.drawable.ic_launcher_background,
                title = "Aspal Bolong",
                subTitle = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
            ),
            NewsModel(
                image = R.drawable.ic_launcher_background,
                title = "Lato - lato",
                subTitle = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
            ),
        )
        return listData
    }

    private fun populateDataForCategory(): List<CategoryModel> {
        val listData = listOf(
            CategoryModel(
                title = "News",
            ),
            CategoryModel(
                title = "Sport",
            ),
            CategoryModel(
                title = "Religi",
            ),
            CategoryModel(
                title = "Fashion",
            ),
            CategoryModel(
                title = "Healthy",
            ),
            CategoryModel(
                title = "Teens",
            ),
            CategoryModel(
                title = "Watch",
            ),

            CategoryModel(
                title = "Electronic",
            ),
            CategoryModel(
                title = "T-Shirt",
            ),
        )
        return listData
    }
}
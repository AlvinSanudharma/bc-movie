package com.example.bcmovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bcmovie.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var dataList = ArrayList<FilmModel>()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        binding.rvMovie.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        dataList.add(
            FilmModel(
                "1",
               "Ad Astra",
                "The near future, a time when both hope and hardships drive humanity to look to the stars and beyond.",
                 "Drama",
                 R.drawable.ic_ad_astra,
                 0,
                 61.0F
            )
        )

        dataList.add(
            FilmModel(
                "2",
                "Avengers",
                "The further adventures of the Marvel Universe's mightiest general membership superhero team.",
                "Action & Adventure",
                R.drawable.ic_avengers,
                0,
                61.0F
            )
        )

        binding.rvMovie.adapter = MovieAdapter(dataList) {

        }
    }
}
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
               "Naruto",
                "Ini adalah film naruto",
                 "Action",
                 R.color.colorAccent,
                 0,
                 0.0F
            )
        )

        binding.rvMovie.adapter = MovieAdapter(dataList) {

        }
    }
}
package com.example.moviecatalogue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detaill_movie.*
import kotlinx.android.synthetic.main.activity_detaill_movie.*

class DetailMovieActivity : AppCompatActivity() {
    companion object{
        const val  EXTRA_DATA = "extra_data"
    }

    var movies : Movie? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detaill_movie)

        movies = intent.getParcelableExtra(EXTRA_DATA)
        tv_title.text = movies?.title
        tv_overview.text = movies?.overview


        Glide.with(img_poster).load(IMAGE_BASE + movies!!.poster).into(img_poster)
    }
}
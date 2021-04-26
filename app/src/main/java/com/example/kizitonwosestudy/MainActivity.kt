package com.example.kizitonwosestudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kizitonwosestudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    internal lateinit var binding: ActivityMainBinding

    var fragment = Example5Fragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.homeToolbar)

        supportFragmentManager.beginTransaction()
                .add(R.id.homeContainer, fragment).commit()
    }
}
package com.example.todo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageTemp.setOnClickListener{
            val intent = Intent(this, TemperatureActivity::class.java)
            startActivity(intent);
        }
        imageTime.setOnClickListener{}
        imageSpeed.setOnClickListener{}
        imageLength.setOnClickListener{}
        imageWeight.setOnClickListener{}
    }

}
package com.example.latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btnShow: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main )

        btnShow=findViewById(R.id.btnShow)
        btnShow.setOnClickListener{
            Toast.makeText(this,"Button was click",Toast.LENGTH_SHORT).show()
        }
    }
}
package com.example.onebuttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvout: TextView
    lateinit var inp: EditText
    lateinit var but:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvout = findViewById(R.id.tvout)
        inp = findViewById(R.id.inin)
        but = findViewById(R.id.button)
        but.setOnClickListener {
            if(!inp.text.isNullOrBlank()){
                tvout.text=inp.text.toString()
            }
        }
    }
}
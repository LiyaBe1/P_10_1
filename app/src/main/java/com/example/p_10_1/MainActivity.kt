package com.example.p_10_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var button1: Button
    lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.linerlayout)
        setTitle("LinearLayout")
        setContentView(R.layout.tablelayout)
        setTitle("TableLayout")

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)

        button1.setOnClickListener {
            button1.visibility = View.INVISIBLE
            button2.visibility = View.VISIBLE
        }

        button2.setOnClickListener {
            button1.visibility = View.VISIBLE
            button2.visibility = View.INVISIBLE
        }
    }
}
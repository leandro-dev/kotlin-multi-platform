package com.example.salario

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

import a.b.c.hi

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        val text = findViewById<TextView>(R.id.text)
        text.text = hi()
    }
}

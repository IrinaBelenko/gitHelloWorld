package com.example.githelloworld

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val button: Button = findViewById(R.id.myButton)
        button.setOnClickListener {
            val toast = Toast.makeText(this, "button pressed", Toast.LENGTH_LONG)
            toast.show()
        }
    }
}
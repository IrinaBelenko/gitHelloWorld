package com.example.githelloworld

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.Toast

class MainActivity:Activity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.main_activity)
        val button:Button = findViewById(R.id.myButton)
        button.setOnClickListener {
            val toast = Toast.makeText(this, "button pressed", Toast.LENGTH_LONG)
            toast.show()
        }
    }
}
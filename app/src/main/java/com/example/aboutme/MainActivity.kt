package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val doneButton:Button = findViewById(R.id.done_button)

        doneButton.setOnClickListener{
            val editText:EditText = findViewById(R.id.nickname_edit)
            val tvResult: TextView = findViewById(R.id.tvResult)

            tvResult.text = editText.text
            editText.visibility = View.GONE
            tvResult.visibility = View.VISIBLE

        }
    }


}

package com.example.belajarandroid

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var nameedittext : EditText
    private lateinit var button: Button
    private lateinit var buttontextview : TextView

    private fun initComponents(){
        nameedittext = findViewById(R.id.nameedittext)
        button = findViewById(R.id.button)
        buttontextview = findViewById(R.id.buttontextview)
    }
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_word)

        initComponents()

        buttontextview.text = resources.getString(R.string.app_name)

        button.setOnClickListener{
            val name = nameedittext.text.toString()
            buttontextview.text = resources.getString(R.string.buttontextview, name)

            resources.getString(R.array.names).forEach {
                Log.i ("PZN", it.toString())
            }
        }
    }
}
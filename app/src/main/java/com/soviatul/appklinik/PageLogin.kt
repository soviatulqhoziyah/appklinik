package com.soviatul.appklinik

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageLogin : AppCompatActivity() {
    private lateinit var textView8 : TextView
    private lateinit var button1 :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_login)
        textView8 = findViewById(R.id.textView8)
        button1 = findViewById(R.id.button1)

        button1.setOnClickListener {
            intent=Intent(this,DoctorPageActivity::class.java)
            startActivity(intent)
        }

        textView8.setOnClickListener(){
            val intent = Intent(this,PageRegistrasi::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
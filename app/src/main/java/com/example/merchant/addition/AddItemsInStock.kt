package com.example.merchant.addition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.merchant.Dashboard
import com.example.merchant.R

class AddItemsInStock : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_items_in_stock)

        val main = findViewById(R.id.back) as ImageView

        main.setOnClickListener{
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }
    }
}
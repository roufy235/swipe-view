package com.example.roufy235.swipeview.Controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.widget.Toast
import com.example.roufy235.swipeview.R

class CustomToolBar : AppCompatActivity() {

    lateinit var toolbar : Toolbar

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_tool_bar)


        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar!!.title = "Custom toolbar"
        toolbar.subtitle = "new world"
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back)
        supportActionBar!!.setIcon(R.drawable.ic_profile)

        toolbar.setNavigationOnClickListener {
            Toast.makeText(this, "Back clicked", Toast.LENGTH_SHORT).show()
        }

        toolbar.setOnClickListener {
            Toast.makeText(this, "ToolBar clicked", Toast.LENGTH_SHORT).show()
        }

    }
}

package com.grldt.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val str = intent.getStringExtra("extras")
        Toast.makeText(applicationContext, str, Toast.LENGTH_SHORT).show()


        lookUpButton.setOnClickListener {
            openLookup()
        }

    }

    private fun openLookup() {
        val intent = Intent(this, LookupActivity::class.java).apply {
            putExtra("Extras", "Valueeeee")
        }
        startActivity(intent)
    }
}
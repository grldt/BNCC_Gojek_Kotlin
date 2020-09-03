package com.grldt.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class LookupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lookup)

        val str = intent.getStringExtra("Extras")
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
    }
}
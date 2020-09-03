package com.grldt.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHome.setOnClickListener{
            openSecondActivity()
        }
    }

    private fun openSecondActivity() {
        val intent = Intent(this, HomeActivity::class.java).apply {
            putExtra(Companion.EXTRA, "from main to home")
        }
        startActivity(intent)
    }

    companion object {
        const val EXTRA = "extras"
    }
}
package com.thedeveloperworldisyours.touchlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.thedeveloperworldisyours.touchlin.touch.TouchActivity
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        main_button.setOnClickListener {
            goToRepositon()
            // your code to perform when the user clicks on the button
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }
    }

    fun goToRepositon() {
        val intent = Intent(this, TouchActivity::class.java)
        startActivity(intent)
    }
}

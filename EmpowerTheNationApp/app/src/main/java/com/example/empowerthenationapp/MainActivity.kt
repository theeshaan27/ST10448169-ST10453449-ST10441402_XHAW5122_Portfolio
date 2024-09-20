package com.example.empowerthenationapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Navigate to Courses Page
    fun openCoursesPage(view: View) {
        val intent = Intent(this, CoursesActivity::class.java)
        startActivity(intent)
    }

    // Navigate to Fee Calculator Page
    fun openFeeCalculatorPage(view: View) {
        val intent = Intent(this, FeeCalculatorActivity::class.java)
        startActivity(intent)
    }

    // Navigate to Contact Page
    fun openContactPage(view: View) {
        val intent = Intent(this, ContactActivity::class.java)
        startActivity(intent)
    }
}

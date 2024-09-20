package com.example.empowerthenationapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FeeCalculatorActivity : AppCompatActivity() {

    lateinit var course1: CheckBox
    lateinit var course2: CheckBox
    lateinit var course3: CheckBox
    lateinit var course4: CheckBox
    lateinit var course5: CheckBox
    lateinit var course6: CheckBox
    lateinit var course7: CheckBox
    lateinit var totalCost: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fee_calculator)

        // Initialize checkboxes and TextView
        course1 = findViewById(R.id.course1)
        course2 = findViewById(R.id.course2)
        course3 = findViewById(R.id.course3)
        course4 = findViewById(R.id.course4)
        course5 = findViewById(R.id.course5)
        course6 = findViewById(R.id.course6)
        course7 = findViewById(R.id.course7)
        totalCost = findViewById(R.id.totalCost)
    }

    // Calculate total fees based on selected courses
    fun calculateFees(view: View) {
        var total = 0
        if (course1.isChecked) total += 1500
        if (course2.isChecked) total += 1500
        if (course3.isChecked) total += 1500
        if (course4.isChecked) total += 1500
        if (course5.isChecked) total += 750
        if (course6.isChecked) total += 750
        if (course7.isChecked) total += 750

        totalCost.text = "Total Cost: R$total"
    }

    // Navigate back to Home Page
    fun goBackToHome(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}

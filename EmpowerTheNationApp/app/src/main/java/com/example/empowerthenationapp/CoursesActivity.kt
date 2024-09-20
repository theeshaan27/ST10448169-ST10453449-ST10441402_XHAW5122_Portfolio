package com.example.empowerthenationapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View

class CoursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)
    }

    // Navigate to Course Detail Page
    fun openCourseDetailPage(view: View) {
        val intent = Intent(this, CourseDetailActivity::class.java)

        // Pass the course name to the next activity based on the button clicked
        when (view.id) {
            // Six-Month Courses
            R.id.firstAidButton -> intent.putExtra("courseName", "First Aid")
            R.id.sewingButton -> intent.putExtra("courseName", "Sewing")
            R.id.landscapingButton -> intent.putExtra("courseName", "Landscaping")
            R.id.lifeSkillsButton -> intent.putExtra("courseName", "Life Skills")

            // Six-Week Courses
            R.id.childMindingButton -> intent.putExtra("courseName", "Child Minding")
            R.id.cookingButton -> intent.putExtra("courseName", "Cooking")
            R.id.gardenMaintenanceButton -> intent.putExtra("courseName", "Garden Maintenance")
        }
        startActivity(intent)
    }

    // Navigate back to Home Page
    fun goBackToHome(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}

package com.example.empowerthenationapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CourseDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_detail)

        val courseNameText: TextView = findViewById(R.id.courseNameText)
        val courseDetailText: TextView = findViewById(R.id.courseDetailText)

        // Get the course name passed from the previous activity
        val courseName = intent.getStringExtra("courseName")
        courseNameText.text = courseName

        // Display detailed information for each course
        when (courseName) {
            // Six-Month Courses
            "First Aid" -> {
                courseDetailText.text = """
                    Fees: R1500
                    Purpose: To provide first aid awareness and basic life support

                    Course Content:
                    - Wounds and bleeding
                    - Burns and fractures
                    - Emergency scene management
                    - Cardiopulmonary Resuscitation (CPR)
                    - Respiratory distress (e.g., Choking, blocked airway)
                """.trimIndent()
            }
            "Sewing" -> {
                courseDetailText.text = """
                    Fees: R1500
                    Purpose: To provide alterations and new garment tailoring services

                    Course Content:
                    - Types of stitches
                    - Threading a sewing machine
                    - Sewing buttons, zips, hems, and seams
                    - Alterations
                    - Designing and sewing new garments
                """.trimIndent()
            }
            "Landscaping" -> {
                courseDetailText.text = """
                    Fees: R1500
                    Purpose: To provide landscaping services for new and established gardens

                    Course Content:
                    - Indigenous and exotic plants and trees
                    - Fixed structures (fountains, statues, benches, tables, built-in braai)
                    - Balancing of plants and trees in a garden
                    - Aesthetics of plant shapes and colors
                    - Garden layout
                """.trimIndent()
            }
            "Life Skills" -> {
                courseDetailText.text = """
                    Fees: R1500
                    Purpose: To provide skills to navigate basic life necessities

                    Course Content:
                    - Opening a bank account
                    - Basic labor law (Know your rights)
                    - Basic reading and writing literacy
                    - Basic numeric literacy
                """.trimIndent()
            }

            // Six-Week Courses
            "Child Minding" -> {
                courseDetailText.text = """
                    Fees: R750
                    Purpose: To provide basic child and baby care

                    Course Content:
                    - Birth to six-month-old baby needs
                    - Seven-month to one-year-old baby needs
                    - Toddler needs
                    - Educational toys
                """.trimIndent()
            }
            "Cooking" -> {
                courseDetailText.text = """
                    Fees: R750
                    Purpose: To prepare and cook nutritious family meals

                    Course Content:
                    - Nutritional requirements for a healthy body
                    - Types of protein, carbohydrates, and vegetables
                    - Planning meals
                    - Preparation and cooking of meals
                """.trimIndent()
            }
            "Garden Maintenance" -> {
                courseDetailText.text = """
                    Fees: R750
                    Purpose: To provide basic knowledge of watering, pruning, and planting in a domestic garden

                    Course Content:
                    - Water restrictions and the watering requirements of indigenous and exotic plants
                    - Pruning and propagation of plants
                    - Planting techniques for different plant types
                """.trimIndent()
            }
        }
    }

    // Navigate back to Home Page
    fun goBackToCourses(view: View) {
        val intent = Intent(this, CoursesActivity::class.java)
        startActivity(intent)
    }
}

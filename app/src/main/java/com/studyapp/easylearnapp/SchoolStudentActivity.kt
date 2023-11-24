package com.studyapp.easylearnapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class SchoolStudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_school_student)

        val portugueseCardView = findViewById<CardView>(R.id.portuguese_cardview)
        val mathCardView = findViewById<CardView>(R.id.math_cardview)
        val scienceCardview = findViewById<CardView>(R.id.science_cardview)
        val geographyCardView = findViewById<CardView>(R.id.geography_cardview)

        portugueseCardView.setOnClickListener {
            val intent = Intent(this, PortugueseSchoolActivity::class.java)

            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }

        mathCardView.setOnClickListener {
            val intent = Intent(this, MathSchoolActivity::class.java)

            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }

        scienceCardview.setOnClickListener {
            val intent = Intent(this, ScienceSchoolActivity::class.java)

            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }

        geographyCardView.setOnClickListener {
            val intent = Intent(this, GeographySchoolActivity::class.java)

            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }
    }
}
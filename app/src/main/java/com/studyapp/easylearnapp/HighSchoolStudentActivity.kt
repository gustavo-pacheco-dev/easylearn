package com.studyapp.easylearnapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class HighSchoolStudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_high_school_student)

        val portugueseCardView = findViewById<CardView>(R.id.portuguese_cardview)
        val mathCardView = findViewById<CardView>(R.id.math_cardview)
        val biologyCardView = findViewById<CardView>(R.id.biology_cardview)
        val physicsCardView = findViewById<CardView>(R.id.physics_cardview)

        portugueseCardView.setOnClickListener {
            val intent = Intent(this, PortugueseHighSchoolActivity::class.java)

            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }

        mathCardView.setOnClickListener {
            val intent = Intent(this, MathHighSchoolActivity::class.java)

            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }

        biologyCardView.setOnClickListener {
            val intent = Intent(this, BiologyHighSchoolActivity::class.java)

            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }

        physicsCardView.setOnClickListener {
            val intent = Intent(this, PhysicsHighSchoolActivity::class.java)

            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }
    }
}
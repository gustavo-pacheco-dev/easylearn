package com.studyapp.easylearnapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registerButton = findViewById<Button>(R.id.register_button)
        val educationLevelRadioGroup = findViewById<RadioGroup>(R.id.education_level_radio_group)
        val studentOrTeacherRadioGroup = findViewById<RadioGroup>(R.id.student_or_teacher_radio_group)

        val studentRadioButton = findViewById<RadioButton>(R.id.radio_button_student)
        val teacherRadioButton = findViewById<RadioButton>(R.id.radio_button_teacher)
        val education1RadioButton = findViewById<RadioButton>(R.id.radio_button_education1)
        val education2RadioButton = findViewById<RadioButton>(R.id.radio_button_education2)
        val layoutParamsRadioButton1 = education1RadioButton.layoutParams
        val layoutParamsRadioButton2 = education2RadioButton.layoutParams

        studentRadioButton.setOnClickListener {
            layoutParamsRadioButton1.height = LinearLayout.LayoutParams.WRAP_CONTENT
            layoutParamsRadioButton2.height = LinearLayout.LayoutParams.WRAP_CONTENT

            education1RadioButton.layoutParams = layoutParamsRadioButton1
            education2RadioButton.layoutParams = layoutParamsRadioButton2

            education1RadioButton.requestLayout()
            education2RadioButton.requestLayout()
        }

        teacherRadioButton.setOnClickListener {
            layoutParamsRadioButton1.height = 0
            layoutParamsRadioButton2.height = 0

            education1RadioButton.layoutParams = layoutParamsRadioButton1
            education2RadioButton.layoutParams = layoutParamsRadioButton2

            education1RadioButton.requestLayout()
            education2RadioButton.requestLayout()
        }

        registerButton.setOnClickListener {
            val selectedStudentOrTeacher = studentOrTeacherRadioGroup.checkedRadioButtonId

            val selectedEducationLevel = educationLevelRadioGroup.checkedRadioButtonId
            val schoolStudentIntent = Intent(this, SchoolStudentActivity::class.java)
            val childhoodEducationIntent = Intent(this, ChildhoodEducationActivity::class.java)
            val highSchoolStudentIntent = Intent(this, HighSchoolStudentActivity::class.java)
            val highSchoolTeacherIntent = Intent(this, HighSchoolTeacherActivity::class.java)

            if (selectedEducationLevel != -1 && selectedStudentOrTeacher != -1) {
                val selectedStudentOrTeacherOption = findViewById<RadioButton>(selectedStudentOrTeacher)
                val selectedEducationLevelOption = findViewById<RadioButton>(selectedEducationLevel)

                if (selectedStudentOrTeacherOption.id == R.id.radio_button_student) {
                    // Mostrar todos os niveis educacionais
                    // Checar o nível educacional escolhido
                    if (selectedEducationLevelOption.id == R.id.radio_button_education1) {
                        startActivity(childhoodEducationIntent)
                    } else if (selectedEducationLevelOption.id == R.id.radio_button_education2) {
                        startActivity(schoolStudentIntent)
                    } else if (selectedEducationLevelOption.id == R.id.radio_button_education3) {
                        startActivity(highSchoolStudentIntent)
                    }
                } else if (selectedStudentOrTeacherOption.id == R.id.radio_button_teacher) {
                    // Mostrar somente os nível educacional Ensino Médio
                    // Checar o nível educacional escolhido
                    if (selectedEducationLevelOption.id == R.id.radio_button_education3) {
                        startActivity(highSchoolTeacherIntent)
                    }
                }
            }
        }

    }
}
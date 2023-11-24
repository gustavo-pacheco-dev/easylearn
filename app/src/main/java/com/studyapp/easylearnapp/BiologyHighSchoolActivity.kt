package com.studyapp.easylearnapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class BiologyHighSchoolActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biology_high_school)

        val subjectToggleLinearlayout = findViewById<ImageView>(R.id.subject_toggle)
        val subject1Linearlayout = findViewById<LinearLayout>(R.id.assunto1_linearlayout)
        val content1Linearlayout = findViewById<LinearLayout>(R.id.conteudo1_linearlayout)
        var content1IsActive = false

        subject1Linearlayout.setOnClickListener {
            val layoutParams = content1Linearlayout.layoutParams
            if (!content1IsActive) {
                // Mostrando o conteúdo
                layoutParams.height = LinearLayout.LayoutParams.WRAP_CONTENT
                // Mudando a imagem do toggle
                subjectToggleLinearlayout.setImageResource(R.drawable.arrow_down)
            } else {
                // Ocultando o conteúdo
                layoutParams.height = 0
                // Mudando a imagem do toggle
                subjectToggleLinearlayout.setImageResource(R.drawable.arrow_right)
            }
            content1Linearlayout.layoutParams = layoutParams
            content1Linearlayout.requestLayout()
            content1IsActive = !content1IsActive
        }
    }
}
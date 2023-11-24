package com.studyapp.easylearnapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class ChildhoodEducationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_childhood_education)

        val memoryGameCardView = findViewById<CardView>(R.id.memory_game_cardview)

        memoryGameCardView.setOnClickListener {
            val memoryGameUri = Uri.parse("https://memory-game-easylearn.tiiny.site/")
            val intent = Intent(Intent.ACTION_VIEW, memoryGameUri)

            startActivity(intent)
        }
    }
}
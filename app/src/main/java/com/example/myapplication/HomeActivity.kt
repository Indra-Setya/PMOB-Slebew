package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.widget.EditText
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class HomeActivity () : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Initialize header components
        val profilePicture = findViewById<android.widget.ImageView>(R.id.photoProfile)

        // Initialize search bar components
        val searchBar = findViewById<EditText>(R.id.search_bar)

        // Initialize category buttons
        val categoryMotivation = findViewById<android.widget.Button>(R.id.c_motivasi)
        val categoryScience = findViewById<android.widget.Button>(R.id.c_sains)
        val categoryFantasy = findViewById<android.widget.Button>(R.id.c_fantasi)
        val categoryComics = findViewById<android.widget.Button>(R.id.c_kesehatan)
        val categoryKomikGrafis = findViewById<android.widget.Button>(R.id.c_komikGrafis)
        val categoryHorror = findViewById<android.widget.Button>(R.id.c_horor)
        val categoryPsychology = findViewById<android.widget.Button>(R.id.c_psikologi)
        val categoryEdukasi = findViewById<android.widget.Button>(R.id.c_edukasi)
        val categoryUangInvest = findViewById<android.widget.Button>(R.id.c_uangInvest)

        // Initialize bottom navigation buttons
        val homeButton = findViewById<LinearLayout>(R.id.home_icon)
        val booksButton = findViewById<LinearLayout>(R.id.book_icon)
        val historyButton = findViewById<LinearLayout>(R.id.history_icon)
        val accountButton= findViewById<LinearLayout>(R.id.account_icon)

        // Set up click listeners
        searchBar.setOnClickListener { v: android.view.View? ->
            Toast.makeText(/*~~zypljz~~*/this,
                "Searching...",
                Toast.LENGTH_SHORT
            ).show()
        }

        categoryMotivation.setOnClickListener { v: android.view.View? ->
            Toast.makeText(/*~~ryzvqf~~*/this,
                "Category: Motivation Inspiration",
                Toast.LENGTH_SHORT
            ).show()
        }
        categoryScience.setOnClickListener { v: android.view.View? ->
            Toast.makeText(/*~~fpwleh~~*/this,
                "Category: Science",
                Toast.LENGTH_SHORT
            ).show()
        }
        categoryFantasy.setOnClickListener { v: android.view.View? ->
            Toast.makeText(/*~~irtxyq~~*/this,
                "Category: Fantasy",
                Toast.LENGTH_SHORT
            ).show()
        }
        categoryComics.setOnClickListener { v: android.view.View? ->
            Toast.makeText(/*~~tuobgb~~*/this,
                "Category: Comics",
                Toast.LENGTH_SHORT
            ).show()
        }
        categoryHorror.setOnClickListener { v: android.view.View? ->
            Toast.makeText(/*~~qkoyco~~*/this,
                "Category: Horror",
                Toast.LENGTH_SHORT
            ).show()
        }
        categoryPsychology.setOnClickListener { v: android.view.View? ->
            Toast.makeText(/*~~iyjkng~~*/this,
                "Category: Psychology",
                Toast.LENGTH_SHORT
            ).show()
        }

        // Bottom Navigation Button Click Listeners with Intents for navigation
        homeButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        booksButton.setOnClickListener {
            val intent = Intent(this, BooksActivity::class.java) // Ganti dengan nama Activity yang sesuai
            startActivity(intent)
            Toast.makeText(this, "Books Selected", Toast.LENGTH_SHORT).show()
        }
//        historyButton.setOnClickListener {
//            val intent = Intent(this, HistoryActivity::class.java) // Ganti dengan nama Activity yang sesuai
//            startActivity(intent)
//            Toast.makeText(this, "History Selected", Toast.LENGTH_SHORT).show()
//        }
//        accountButton.setOnClickListener {
//            val intent = Intent(this, AccountActivity::class.java) // Ganti dengan nama Activity yang sesuai
//            startActivity(intent)
//            Toast.makeText(this, "Account Selected", Toast.LENGTH_SHORT).show()
//        }
    }
}

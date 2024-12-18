package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class BooksActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_books)

        // Set up click listeners or other interactions if needed
        val searchBar = findViewById<EditText>(R.id.search_bar)

        // Add functionality for search bar click if necessary
        searchBar.setOnClickListener {
            Toast.makeText(this, "Searching...", Toast.LENGTH_SHORT).show()
        }

        // Misalnya, Anda memiliki buku yang sudah disiapkan dalam layout
        val book1Layout = findViewById<LinearLayout>(R.id.book_1_layout)

        book1Layout.setOnClickListener {
            // Ketika item buku diklik, tampilkan dialog
            showBookInfoDialog(
                R.drawable.book_1,  // Gambar Buku
                "Harry Potter and the Goblet of Fire",  // Nama Buku
                "A book about the wizard Harry Potter and his adventures...",  // Deskripsi Buku
                "J.K. Rowling",  // Penulis
                "2000"  // Tahun Terbit
            )
        }

        // Initialize bottom navigation buttons
        val homeButton = findViewById<LinearLayout>(R.id.home_icon)
        val booksButton = findViewById<LinearLayout>(R.id.book_icon)
        val historyButton = findViewById<LinearLayout>(R.id.history_icon)
        val accountButton= findViewById<LinearLayout>(R.id.account_icon)

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

    private fun showBookInfoDialog(imageRes: Int, bookName: String, description: String, author: String, year: String) {
        // Inflating the custom layout for the dialog
        val dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_book_info, null)

        // Setting up the content for the dialog
        val bookImage = dialogView.findViewById<ImageView>(R.id.book_image)
        val bookTitle = dialogView.findViewById<TextView>(R.id.book_name)
        val bookDescription = dialogView.findViewById<TextView>(R.id.book_description)
        val bookAuthor = dialogView.findViewById<TextView>(R.id.book_author)
        val bookYear = dialogView.findViewById<TextView>(R.id.book_year)

        bookImage.setImageResource(imageRes)
        bookTitle.text = bookName
        bookDescription.text = description
        bookAuthor.text = author
        bookYear.text = year

        // Create and show the dialog
        val alertDialog = AlertDialog.Builder(this)
            .setView(dialogView)
            .setPositiveButton("OK") { dialog, _ -> dialog.dismiss() }
            .create()

        alertDialog.show()
    }
}
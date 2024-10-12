package com.example.booklensapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.booklensapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var bookList: ArrayList<BookLens>



    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val book= BookLens("Book1", "Writer1", R.drawable.bookpicture)
        val book2= BookLens("Book2", "Writer2", R.drawable.bookpicture2)
        val book3= BookLens("Book3", "Writer3", R.drawable.bookpicture3)
        val book4= BookLens("Book4", "Writer4", R.drawable.bookpicture4)

        bookList=BookLens()


    }
}
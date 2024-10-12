package com.example.booklensapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.booklensapp.databinding.ActivityMainBinding
import com.example.booklensapp.databinding.ActivityPromotionalBinding

class PromotionalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPromotionalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPromotionalBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val adapterdenGelenIntent= intent
        val secilenKahraman=  adapterdenGelenIntent.getSerializableExtra("secilenKitap") as BookLens

        binding.imageView.setImageResource(secilenKahraman.picture)
        binding.nameTextView.text= secilenKahraman.name
        binding.WriterTextView.text= secilenKahraman.writer
    }
}
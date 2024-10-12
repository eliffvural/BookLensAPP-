package com.example.booklensapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.booklensapp.databinding.RecyclerRowBinding

 class BookLensAdapter(val bookList: ArrayList<BookLens>) : RecyclerView.Adapter<BookLensAdapter.BookLensViewHolder>(){


    class BookLensViewHolder(val binding: RecyclerRowBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookLensViewHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return BookLensViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return 4
    }

    override fun onBindViewHolder(holder: BookLensViewHolder, position: Int) {
        holder.binding.textViewRecyclerView.text= bookList[position].name

        holder.itemView.setOnClickListener{

            val intent= Intent(holder.itemView.context, PromotionalActivity::class.java)
            holder.itemView.context.startActivity(intent)
            intent.putExtra("secilenKitap", bookList[position])
            holder.itemView.context.startActivity(intent)

        }
    }

}



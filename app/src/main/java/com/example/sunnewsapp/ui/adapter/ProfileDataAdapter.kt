package com.example.sunnewsapp.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sunnewsapp.R
import com.example.sunnewsapp.database.model.MyData
import kotlinx.android.synthetic.main.next_list_recycler.view.imgData


class ProfileDataAdapter( private val chaptersList: List<MyData>) :
    RecyclerView.Adapter<ProfileDataAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_recycler1, parent, false)
        return ViewHolder(v)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = chaptersList[position]
        Glide.with(holder.itemView.context).load(data.image).into(holder.itemView.imgData)

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, data.name.toString(), Toast.LENGTH_SHORT).show()
        }
    }
    override fun getItemCount(): Int {
        return chaptersList.size
    }
}
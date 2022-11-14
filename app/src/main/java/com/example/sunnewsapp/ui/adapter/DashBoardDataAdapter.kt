package com.example.sunnewsapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sunnewsapp.R
import com.example.sunnewsapp.database.model.MyData
import com.example.sunnewsapp.ui.listener.DataClickListener
import kotlinx.android.synthetic.main.list_recycler.view.*

class DashBoardDataAdapter(private val context: Context, private var chaptersList: List<MyData>,
                           private var mListener: DataClickListener
) : RecyclerView.Adapter<DashBoardDataAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_recycler, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = chaptersList[position]

        holder.itemView.nameTxt.text = data.name
        Glide.with(context).load(data.image).into(holder.itemView.imgData)

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, data.name.toString(), Toast.LENGTH_SHORT).show()
            mListener.onItemClickListener(position, data.inputQuantity.toString(), "null",
              data.id.toString())
        }
    }


    override fun getItemCount(): Int {
        return chaptersList.size
    }
}
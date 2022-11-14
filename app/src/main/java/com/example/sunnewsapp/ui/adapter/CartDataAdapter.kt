package com.example.sunnewsapp.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sunnewsapp.R
import com.example.sunnewsapp.database.model.MyData
import com.example.sunnewsapp.ui.listener.DataClickListener
import kotlinx.android.synthetic.main.next_list_recycler.view.*


class HomeDataAdapter(private val context: Context, private val chaptersList: List<MyData>,
                      private var mListener: DataClickListener
) : RecyclerView.Adapter<HomeDataAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.next_list_recycler, parent, false)
        return ViewHolder(v)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = chaptersList[position]
        Glide.with(context).load(data.image).into(holder.itemView.imgData)
        holder.itemView.nameTxt.text = data.name
        holder.itemView.DescriptionTxt.text = data.description.toString()

        holder.itemView.imgData.setOnClickListener {
            callNext(0, position,data)
        }
        holder.itemView.nameTxt.setOnClickListener {
            callNext(0, position,data)
        }
        holder.itemView.DescriptionTxt.setOnClickListener {
            callNext(0, position,data)
        }

        holder.itemView.yesBtn.setOnClickListener {
            callNext(1,position,data)
        }
        holder.itemView.shortlistTxt.setOnClickListener {
            callNext(1,position,data)
        }
        holder.itemView.noBtn.setOnClickListener {
            callNext(2,position,data)
        }
    }

    private fun callNext(i: Int, position: Int, data: MyData) {
        when (i) {
            0 -> {
                mListener.onItemClickListener(position, data.inputQuantity.toString(), "null",
                    data.id.toString())
            }
            1 -> {
                mListener.onItemClickListener(position, data.inputQuantity.toString(), "Plus",
                    data.id.toString())
            }
            2 -> {
                mListener.onItemClickListener(position, data.inputQuantity.toString(), "Minus",
                    data.id.toString())
            }
            else -> {
                mListener.onItemClickListener(position,data.inputQuantity.toString(), "null",
                    data.id.toString())
            }
        }

    }

    override fun getItemCount(): Int {
        return chaptersList.size
    }
}
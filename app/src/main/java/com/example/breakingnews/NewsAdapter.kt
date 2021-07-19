package com.example.breakingnews

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_news.view.*

class NewsAdapter (val context: Context, val news : ArrayList<News>) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_news, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.photo.setImageBitmap(news[position].photo)
        holder.heading.text = news [position].heading
        holder.text.text = news [position].text
    }

    override fun getItemCount(): Int {
       return news.size
    }
}


class ViewHolder (itemView:View) : RecyclerView.ViewHolder(itemView){
    val photo = itemView.ivPhoto
    val heading = itemView.tvHeading
    val text = itemView.tvText
}
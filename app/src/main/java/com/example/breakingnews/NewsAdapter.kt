package com.example.breakingnews

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_news.view.*



class NewsAdapter (val context: Context, var news : ArrayList<News>,  val callback: NewsCallback) : RecyclerView.Adapter<ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_news, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.root.visibility = View.VISIBLE
        holder.news2.visibility = View.INVISIBLE
        holder.photo.setImageBitmap(news[position].photo)
        holder.heading.text = news[position].heading
        holder.text.text = news[position].text
        holder.counter.text = news [position].toString()
        holder.photo2.setImageBitmap(news[position].photo)
        holder.heading2.text = news[position].heading
        holder.text2.text = news[position].text
        holder.counter2.text = news [position].toString()
        holder.comment1Photo.setImageBitmap(news[position].comment1.photoComment)
        holder.comment2Photo.setImageBitmap(news[position].comment2.photoComment)
        holder.comment1text.text = news[position].comment1.textComment
        holder.comment2text.text = news[position].comment2.textComment
        holder.comment1Couter.text = news[position].comment1.counterComment.toString()
        holder.comment2Counter.text = news[position].comment2.counterComment.toString()

        holder.heart.setOnClickListener {
            holder.redHeart.visibility = View.VISIBLE
            holder.redHeart2.visibility = View.VISIBLE
            holder.heart.visibility = View.INVISIBLE
            holder.heart2.visibility = View.INVISIBLE
            // callback.onItemSelected(position)
            news[position].counter = (news[position].counter + 1)
            holder.counter.text =  (news[position].counter).toString()
            holder.counter2.text = (news[position].counter).toString()
        }
        holder.redHeart.setOnClickListener {
            holder.redHeart.visibility = View.INVISIBLE
            holder.redHeart2.visibility = View.INVISIBLE
            holder.heart.visibility = View.VISIBLE
            holder.heart2.visibility = View.VISIBLE
            // callback.onItemSelected(position)
            news[position].counter = (news[position].counter - 1)
            holder.counter.text =  (news[position].counter).toString()
            holder.counter2.text = (news[position].counter).toString()
        }

        holder.root.setOnClickListener {
            holder.root.visibility = View.INVISIBLE
            holder.news2.visibility = View.VISIBLE
            // callback.onItemSelected(position)


            holder.heart2.setOnClickListener {
                holder.redHeart2.visibility = View.VISIBLE
                holder.heart2.visibility = View.INVISIBLE
                // callback.onItemSelected(position)
                news[position].counter = (news[position].counter + 1)
                holder.counter2.text = (news[position].counter).toString()
            }
            holder.redHeart2.setOnClickListener {
                holder.redHeart2.visibility = View.INVISIBLE
                holder.heart2.visibility = View.VISIBLE
                //callback.onItemSelected(position)
                news[position].counter = (news[position].counter - 1)
                holder.counter2.text = (news[position].counter).toString()
            }
            holder.comment1heart.setOnClickListener {
                holder.comment1heart.visibility = View.INVISIBLE
                holder.comment1redHeart.visibility = View.VISIBLE
                (news[position].comment1).counterComment = ((news[position].comment1).counterComment + 1)
                holder.comment1Couter.text =  ((news[position].comment1).counterComment).toString()
            }
            holder.comment2heart.setOnClickListener {
                holder.comment2heart.visibility = View.INVISIBLE
                holder.comment2redHeart.visibility = View.VISIBLE
                (news[position].comment2).counterComment = ((news[position].comment2).counterComment + 1)
                holder.comment2Counter.text =  ((news[position].comment2).counterComment).toString()
            }
            holder.comment1redHeart.setOnClickListener {
                holder.comment1redHeart.visibility = View.INVISIBLE
                holder.comment1heart.visibility = View.VISIBLE
                (news[position].comment1).counterComment = (news[position].comment1.counterComment - 1)
                holder.comment1Couter.text =  ((news[position].comment1).counterComment).toString()
            }
            holder.comment2redHeart.setOnClickListener {
                holder.comment2redHeart.visibility = View.INVISIBLE
                holder.comment2heart.visibility = View.VISIBLE
                (news[position].comment2).counterComment = (news[position].comment2.counterComment - 1)
                holder.comment2Counter.text =  ((news[position].comment2).counterComment).toString()
            }
        }
    }
    override fun getItemCount(): Int {
        return news.size
    }
}

class ViewHolder (itemView:View) : RecyclerView.ViewHolder(itemView){
    var photo = itemView.ivPhoto
    var heading = itemView.tvHeading
    var text = itemView.tvText
    var heart = itemView.ivHeart
    var redHeart = itemView.ivRedHeart
    var root = itemView.clRoot
    var counter = itemView.tvCounter
    var news2 = itemView.clNews2
    var photo2 = itemView.ivPhoto2
    var heading2 = itemView.tvHeading2
    var text2 = itemView.tvText2
    var heart2 = itemView.ivHeart2
    var redHeart2 = itemView.ivRedHeart2
    var counter2 = itemView.tvCounter2
    var comment1heart = itemView.ivComment1Heart
    var comment2heart = itemView.ivComment2Heart
    var comment1redHeart = itemView.ivComment1RedHeart
    var comment2redHeart = itemView.ivComment2RedHeart
    var comment1Couter = itemView.tvComment1Counter
    var comment2Counter = itemView.tvComment2Counter
    var comment1Photo = itemView.ivComment1
    var comment2Photo = itemView.ivComment2
    var comment1text = itemView.tvComment1
    var comment2text = itemView.tvComment2
}

interface NewsCallback {
    fun onItemSelected( index : Int)

    }

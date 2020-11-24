package com.example.kotlintodoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import kotlinx.android.synthetic.main.adapter_activity.view.*

class ActivityAdapter(private val itemList : List<ActivityItem>) : RecyclerView.Adapter<ActivityAdapter.ActivityViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivityViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.adapter_activity,
        parent, false)

        return ActivityViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ActivityViewHolder, position: Int) {
        val currentItem = itemList[position]

        holder.imageIV.setImageResource(currentItem.imageResource)
        holder.titleTXT.text = currentItem.title
        holder.subtitleTXT.text = currentItem.subtitle
    }

    override fun getItemCount() = itemList.size


    class ActivityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageIV : ImageView = itemView.imageIV
        val titleTXT : TextView = itemView.titleTXT
        val  subtitleTXT : TextView = itemView.subtitleTXT
    }
}
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

class TodoAdapter(private val itemList : List<TodoItem>) : RecyclerView.Adapter<TodoAdapter.ActivityViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivityViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.adapter_todo,
        parent, false)

        return ActivityViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ActivityViewHolder, position: Int) {
        val currentItem = itemList[position]

        holder.titleTXT.text = currentItem.title
    }

    override fun getItemCount() = itemList.size


    class ActivityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTXT : TextView = itemView.titleTXT
    }
}
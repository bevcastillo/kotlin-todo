package com.example.kotlintodoapp

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import kotlinx.android.synthetic.main.adapter_todo.view.*

class TodoAdapter(private val itemList : List<TodoItem>) : RecyclerView.Adapter<TodoAdapter.ActivityViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivityViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.adapter_todo,
        parent, false)

        return ActivityViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ActivityViewHolder, position: Int) {
        val currentItem = itemList[position]

        holder.titleTXT.text = currentItem.title

        if (currentItem.color == "red") {
        }else if (currentItem.color == "yellow") {
        }else if (currentItem.color == "green") {
        }else if (currentItem.color == "orange") {
        }else if (currentItem.color == "pink") {
        }else if (currentItem.color == "sky_blue") {
        }else {
        }
    }

    override fun getItemCount() = itemList.size


    class ActivityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTXT : TextView = itemView.titleTXT
        val colorLAYOUT : LinearLayout = itemView.colorLAYOUT
    }
}
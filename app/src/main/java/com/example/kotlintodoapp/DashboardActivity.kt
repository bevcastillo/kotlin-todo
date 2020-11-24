package com.example.kotlintodoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.dialog_new_task.*
import kotlinx.android.synthetic.main.dialog_new_task.view.*

class DashboardActivity : AppCompatActivity() {

//    private val itemList =
    private val data = ArrayList<TodoItem>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        createTaskBTN.setOnClickListener{
            showNewGoalDialog()
        }

        todoRV.layoutManager = LinearLayoutManager(this)
        todoRV.adapter = TodoAdapter(data)


//        data.add(TodoItem("Drink coffee", false))
//        data.add(TodoItem("Water the plants", false))
//        data.add(TodoItem("Yoga", false))
//        data.add(TodoItem("Clean the house", false))


//        val itemList = generateList(10)

//        activityRV.adapter = ActivityAdapter(itemList)
//        activityRV.layoutManager = LinearLayoutManager(this)
//        activityRV.setHasFixedSize(true)
    }

//    private fun generateList(size: Int): List<ActivityItem> {
//        val list = ArrayList<ActivityItem>()
//
//        for (i in 0 until size ) {
//            val item = ActivityItem(R.drawable.ic_marketing_idea, "Idea", "This is your idea")
//            list += item
//        }
//        return list
//    }

    private fun showNewGoalDialog() {
        val dialogBox = LayoutInflater.from(this).inflate(R.layout.dialog_new_task, null)
        val dialogBoxBuilder = AlertDialog.Builder(this).setView(dialogBox)

        //show dialog
        val dialogBoxInstance = dialogBoxBuilder.show()


        //listeners
        dialogBox.closeBTN.setOnClickListener() {
            dialogBoxInstance.dismiss()
        }

        dialogBox.saveBTN.setOnClickListener() {
            data.add(TodoItem(dialogBox.goalET.text.toString(), false))
            todoRV.adapter!!.notifyDataSetChanged()
            Toast.makeText(this, "New goal has been added.", Toast.LENGTH_SHORT).show()
            dialogBoxInstance.dismiss()
        }
    }

}

package com.mastercoding.recyclervaoo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Myadapter(private val emplist:ArrayList<contacts>):RecyclerView.Adapter<Myadapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
      //        // Inflate the layout for each item and return a new ViewHolder object
        val ItemView = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return MyViewHolder(ItemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentEmp = emplist[position]
        holder.name.text = currentEmp.name
        holder.email.text = currentEmp.email
    }

    override fun getItemCount(): Int {
        return emplist.size
    }



// This class defines the ViewHolder object for each item in the RecyclerView
class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val name: TextView = itemView.findViewById(R.id.tvName)
    val email: TextView = itemView.findViewById(R.id.tvEmail)
}
}
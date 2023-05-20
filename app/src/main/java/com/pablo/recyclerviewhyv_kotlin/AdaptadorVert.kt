package com.pablo.recyclerviewhyv_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorVert(modeloRecVert:MutableList<ModeloRecVert>, private val listener: OnItemClickListener): RecyclerView.Adapter<AdaptadorVert.ViewHolder>() {
    var modeloRecVert:MutableList<ModeloRecVert>

    init {
        this.modeloRecVert = modeloRecVert
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.cardviewvert,parent,false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nombre.text = modeloRecVert[position].nombre
        holder.desc.text = modeloRecVert[position].desc
        holder.logo.setImageResource(modeloRecVert[position].logo)

        holder.itemView.setOnClickListener {
            listener.onItemClick(position)
        }
    }
    override fun getItemCount(): Int {
        return modeloRecVert.size
    }
    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nombre: TextView
        var desc:TextView
        var logo: ImageView

        init {
            nombre = itemView.findViewById(R.id.textViewItem1)
            logo = itemView.findViewById(R.id.imageView)
            desc = itemView.findViewById(R.id.textViewItem2)
        }
    }
}
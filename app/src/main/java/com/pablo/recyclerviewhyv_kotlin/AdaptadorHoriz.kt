package com.pablo.recyclerviewhyv_kotlin


import android.view.Display.Mode
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorHoriz(discos:MutableList<ModeloRecHoriz>):RecyclerView.Adapter<AdaptadorHoriz.ViewHolder>() {
    var modeloRecHorizs:MutableList<ModeloRecHoriz>
    init {
        modeloRecHorizs = discos
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.cardview,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nombre.text = modeloRecHorizs[position].nombre
        holder.logo.setImageResource(modeloRecHorizs[position].logo)
    }

    override fun getItemCount(): Int {
        return modeloRecHorizs.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nombre: TextView
        var logo: ImageView

        init {
            nombre = itemView.findViewById(R.id.textView)
            logo = itemView.findViewById(R.id.imageView)
        }
    }
}
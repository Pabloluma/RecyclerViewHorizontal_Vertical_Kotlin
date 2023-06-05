package com.pablo.recyclerviewhyv_kotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), AdaptadorVert.OnItemClickListener {
    lateinit var listaDiscosProx:MutableList<ModeloRecVert>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val listaDiscos:MutableList<ModeloRecHoriz> = mutableListOf()
        listaDiscos.add(ModeloRecHoriz("Editors", R.drawable.editors_))
        listaDiscos.add(ModeloRecHoriz("The crure", R.drawable.thecure_))
        listaDiscos.add(ModeloRecHoriz("Arcade", R.drawable.arcade))
        listaDiscos.add(ModeloRecHoriz("depeche", R.drawable.depeche_))
        listaDiscos.add(ModeloRecHoriz("Guns", R.drawable.guns_))
        listaDiscos.add(ModeloRecHoriz("Jake", R.drawable.jake_))
        listaDiscos.add(ModeloRecHoriz("Lana", R.drawable.lana))
        listaDiscos.add(ModeloRecHoriz("Motley", R.drawable.motley))
        listaDiscos.add(ModeloRecHoriz("Placebo", R.drawable.placebo_))
        listaDiscos.add(ModeloRecHoriz("Sheeran", R.drawable.sheeran_))
        listaDiscos.add(ModeloRecHoriz("Strokes", R.drawable.strokes_))

        listaDiscosProx = mutableListOf()
        listaDiscosProx.add(ModeloRecVert("Dua Lipa", "Madrid-20 sept 2023", R.drawable.lipa))
        listaDiscosProx.add(ModeloRecVert("Lukas Graham","Bilbao-9 ene 2023", R.drawable.lukas_))
        listaDiscosProx.add(ModeloRecVert("Foo Fighter", "Barcelona- 14 marzo 2023", R.drawable.foo_))
        listaDiscosProx.add(ModeloRecVert("Taylor Swift","Sevilla- 20 jun 2023", R.drawable.taylor))
        listaDiscosProx.add(ModeloRecVert("Harry styles","Murcia- 7 julio 2023", R.drawable.harry))
        listaDiscosProx.add(ModeloRecVert("Adele","Vigo- 10 agosto 2023", R.drawable.adele))
        listaDiscosProx.add(ModeloRecVert("Aerosmith","Girona- 25 sept 2023", R.drawable.aerosmith))
        listaDiscosProx.add(ModeloRecVert("Artic","Salamanca- 2 Octubre 2023", R.drawable.artic))
        listaDiscosProx.add(ModeloRecVert("Billie", "Valencia- 3 Noviembre 2023", R.drawable.billie ))
        listaDiscosProx.add(ModeloRecVert("Markie","Santander- 4 diciembre 2023", R.drawable.marky))
        listaDiscosProx.add(ModeloRecVert("pet","Cordoba- 27 diciembre 2023", R.drawable.pet))


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        var adapter = AdaptadorHoriz(listaDiscos)
        recyclerView.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        recyclerView.adapter = adapter


        val recyclerView2 = findViewById<RecyclerView>(R.id.recyclerview2)
        val adapter2 = AdaptadorVert(listaDiscosProx, this)
        recyclerView2.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        recyclerView2.adapter = adapter2

    }
    //RecyclerView Vertical
    override fun onItemClick(position: Int) {
        var intents: Intent = Intent(this, segunda::class.java)
        when(position){
           in 0..position -> {
               intents.putExtra("foto", listaDiscosProx[position].logo)
               intents.putExtra("nombre", listaDiscosProx[position].nombre)
               intents.putExtra("descripcion", listaDiscosProx[position].desc)
               startActivity(intents)
            }
        }
    }
}
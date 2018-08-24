package com.example.f.recyclerviewkotlin.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.f.recyclerviewkotlin.Model.Kategori
import com.example.f.recyclerviewkotlin.R

class KategoriAdapter(val ctx:Context,val kat:List<Kategori>, val click:(Kategori)->Unit): RecyclerView.Adapter<KategoriAdapter.KatVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KatVH {
        return KatVH(LayoutInflater.from(ctx).inflate(R.layout.list_kategori,parent,false),click)
    }

    override fun getItemCount(): Int = kat.count()

    override fun onBindViewHolder(holder: KatVH, position: Int) {
        holder?.bind(ctx,kat[position])
    }

    inner class KatVH(itemView: View?,val clk: (Kategori) -> Unit) : RecyclerView.ViewHolder(itemView){
        var namaKategori = itemView?.findViewById<TextView>(R.id.kategoriTv)
        var bgKategori = itemView?.findViewById<ImageView>(R.id.bgIv)

        fun bind(c:Context,k:Kategori){
            namaKategori?.text = k.kategori

            val id = c.resources.getIdentifier(k.bgKategori,"drawable",c.packageName)
            bgKategori?.setImageResource(id)

            itemView.setOnClickListener{clk(k)}
        }

    }
}
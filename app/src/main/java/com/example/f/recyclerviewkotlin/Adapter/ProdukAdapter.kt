package com.example.f.recyclerviewkotlin.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.f.recyclerviewkotlin.Model.Produk
import com.example.f.recyclerviewkotlin.R

class ProdukAdapter(val ctx:Context,val prdk:List<Produk>,val klik:(Produk)->Unit): RecyclerView.Adapter<ProdukAdapter.produkVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): produkVH {
        val v = LayoutInflater.from(ctx).inflate(R.layout.list_produk,parent,false)
        return produkVH(v,klik)
    }

    override fun getItemCount(): Int = prdk.count()

    override fun onBindViewHolder(holder: produkVH, position: Int) {
        holder?.bind(ctx,prdk[position])
    }

    inner class produkVH(itemView: View?, val klik: (Produk) -> Unit) : RecyclerView.ViewHolder(itemView){
        val gbrProduk = itemView?.findViewById<ImageView>(R.id.produkIV)
        val namaProduk = itemView?.findViewById<TextView>(R.id.produkNama)
        val hargaProduk = itemView?.findViewById<TextView>(R.id.produkHarga)

        fun bind(c:Context,p:Produk){
            val id = c.resources.getIdentifier(p.gbrProduk,"drawable",c.packageName)
            gbrProduk?.setImageResource(id)
            namaProduk?.text = p.judul
            hargaProduk?.text = p.harga

            itemView?.setOnClickListener { klik(p) }
        }
    }
}
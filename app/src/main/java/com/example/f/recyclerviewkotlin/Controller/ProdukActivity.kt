package com.example.f.recyclerviewkotlin.Controller

import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.widget.GridLayout
import android.widget.Toast
import com.example.f.recyclerviewkotlin.Adapter.ProdukAdapter
import com.example.f.recyclerviewkotlin.Data.DataSource
import com.example.f.recyclerviewkotlin.Model.Kategori
import com.example.f.recyclerviewkotlin.Model.Produk
import com.example.f.recyclerviewkotlin.R
import com.example.f.recyclerviewkotlin.Util.EXTRA_KATEGORI
import kotlinx.android.synthetic.main.activity_main.*

class ProdukActivity: AppCompatActivity() {

    lateinit var produkAdapter : ProdukAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kat = intent.getParcelableExtra<Kategori>(EXTRA_KATEGORI)
        val bgId = this.resources.getIdentifier(kat.bgKategori,"drawable",this.packageName)
        imageView.setImageResource(bgId)

        val judul = kat.kategori
        JudulTV.text = judul

        produkAdapter = ProdukAdapter(this,DataSource.ambilProduk(judul)){produk ->
            val nama = produk.judul
            Toast.makeText(this,"Ke Detail $nama",Toast.LENGTH_SHORT).show()

        }

        var kolom = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            kolom = 3
        }
        val ukuranLayar = resources.configuration.screenWidthDp
        if (ukuranLayar > 720){
            kolom = 3
        }
        rv_kategori.layoutManager = GridLayoutManager(this,kolom)
        rv_kategori.adapter = produkAdapter

    }
}
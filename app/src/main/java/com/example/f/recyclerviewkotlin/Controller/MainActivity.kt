package com.example.f.recyclerviewkotlin.Controller

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.example.f.recyclerviewkotlin.Adapter.KategoriAdapter
import com.example.f.recyclerviewkotlin.Data.DataSource
import com.example.f.recyclerviewkotlin.Model.Kategori
import com.example.f.recyclerviewkotlin.R
import com.example.f.recyclerviewkotlin.Util.EXTRA_KATEGORI
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var kategoriAdapter: KategoriAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kategoriAdapter = KategoriAdapter(this,DataSource.kategori){kategori ->
            val nama = kategori.kategori

            var produkIntent = Intent(this,ProdukActivity::class.java)
            produkIntent.putExtra(EXTRA_KATEGORI, kategori)
            startActivity(produkIntent)

            Toast.makeText(this,nama,Toast.LENGTH_SHORT).show()
        }

        rv_kategori.adapter = kategoriAdapter
        rv_kategori.setHasFixedSize(true)
        rv_kategori.layoutManager = LinearLayoutManager(this)

    }

}

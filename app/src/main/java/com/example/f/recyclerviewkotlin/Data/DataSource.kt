package com.example.f.recyclerviewkotlin.Data

import com.example.f.recyclerviewkotlin.Model.Kategori
import com.example.f.recyclerviewkotlin.Model.Produk

object DataSource {
    val kategori = listOf(
            Kategori("Topi","hatimage"),
            Kategori("Jaket","hoodieimage"),
            Kategori("Baju","shirtimage"),
            Kategori("Elektronik","digitalgoodsimage")
    )

    val topi = listOf(
            Produk("Topi 1","Rp.50.000,-","hat1"),
            Produk("Topi 2","Rp.50.000,-","hat2"),
            Produk("Topi 3","Rp.50.000,-","hat3"),
            Produk("Topi 4","Rp.50.000,-","hat4"),
            Produk("Topi 1","Rp.50.000,-","hat1"),
            Produk("Topi 2","Rp.50.000,-","hat2"),
            Produk("Topi 3","Rp.50.000,-","hat3"),
            Produk("Topi 4","Rp.50.000,-","hat4"),
            Produk("Topi 1","Rp.50.000,-","hat1"),
            Produk("Topi 2","Rp.50.000,-","hat2"),
            Produk("Topi 3","Rp.50.000,-","hat3"),
            Produk("Topi 4","Rp.50.000,-","hat4")
    )

    val jaket = listOf(
            Produk("jaket1","Rp.100.000,-","hoodie1"),
            Produk("jaket2","Rp.100.000,-","hoodie2"),
            Produk("jaket3","Rp.100.000,-","hoodie3"),
            Produk("jaket4","Rp.100.000,-","hoodie4"),
            Produk("jaket1","Rp.100.000,-","hoodie1"),
            Produk("jaket2","Rp.100.000,-","hoodie2"),
            Produk("jaket3","Rp.100.000,-","hoodie3"),
            Produk("jaket4","Rp.100.000,-","hoodie4"),
            Produk("jaket1","Rp.100.000,-","hoodie1"),
            Produk("jaket2","Rp.100.000,-","hoodie2"),
            Produk("jaket3","Rp.100.000,-","hoodie3"),
            Produk("jaket4","Rp.100.000,-","hoodie4")
    )

    val baju = listOf(
            Produk("Baju 1","Rp.30.000,-","shirt1"),
            Produk("Baju 2","Rp.30.000,-","shirt2"),
            Produk("Baju 3","Rp.30.000,-","shirt3"),
            Produk("Baju 4","Rp.30.000,-","shirt4"),
            Produk("Baju 1","Rp.30.000,-","shirt1"),
            Produk("Baju 2","Rp.30.000,-","shirt2"),
            Produk("Baju 3","Rp.30.000,-","shirt3"),
            Produk("Baju 4","Rp.30.000,-","shirt4"),
            Produk("Baju 1","Rp.30.000,-","shirt1"),
            Produk("Baju 2","Rp.30.000,-","shirt2"),
            Produk("Baju 3","Rp.30.000,-","shirt3"),
            Produk("Baju 4","Rp.30.000,-","shirt4"),
            Produk("Baju 1","Rp.30.000,-","shirt1"),
            Produk("Baju 2","Rp.30.000,-","shirt2"),
            Produk("Baju 3","Rp.30.000,-","shirt3"),
            Produk("Baju 4","Rp.30.000,-","shirt4")

    )

    val elektronik = listOf<Produk>()

    fun ambilProduk(k: String) : List<Produk>{
        return when(k){
            "Topi"  -> topi
            "Jaket" -> jaket
            "Baju"  -> baju
            else    -> elektronik
        }
    }

}
package com.example.f.recyclerviewkotlin.Model

import android.os.Parcel
import android.os.Parcelable

class Kategori(val kategori:String,val bgKategori: String) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(kategori)
        parcel.writeString(bgKategori)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Kategori> {
        override fun createFromParcel(parcel: Parcel): Kategori {
            return Kategori(parcel)
        }

        override fun newArray(size: Int): Array<Kategori?> {
            return arrayOfNulls(size)
        }
    }
}
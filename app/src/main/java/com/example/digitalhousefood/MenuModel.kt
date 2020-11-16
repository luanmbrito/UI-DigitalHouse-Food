package com.example.digitalhousefood
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MenuModel (
    var imagemUrl: String,
    var descricao: String,
    var detalhe: String
): Parcelable

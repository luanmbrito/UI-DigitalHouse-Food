package com.example.digitalhousefood

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import android.view.Menu

@Parcelize
data class RestaurantModel(
    var imageUrl:String,
    var nomeRestaurant: String,
    var endereco: String,
    var fechamento:String,
    var menu: List<MenuModel>
) : Parcelable

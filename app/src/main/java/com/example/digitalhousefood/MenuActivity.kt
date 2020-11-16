package com.example.digitalhousefood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.digitalhousefood.RestaurantActivity.Companion.KEY_INTENT_RESTAURANT
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MenuActivity : AppCompatActivity() {

    private var restaurant: RestaurantModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        back()

        restaurant = intent.getParcelableExtra(KEY_INTENT_RESTAURANT)
        var listMenu : List<MenuModel>? = restaurant?.menu

        findViewById<RecyclerView>(R.id.rvMenu).apply{
            layoutManager = GridLayoutManager(this@MenuActivity,2,
                LinearLayoutManager.VERTICAL,false)
            adapter = listMenu?.let { MenuAdapter(it){
                val intent = Intent(this@MenuActivity,DetailActivity::class.java)
                intent.putExtra(KEY_INTENT_MENU,listMenu[it])
                startActivity(intent)

                }
            }
        }

        setup()
    }

    fun setup(){
       Glide.with(this).load(restaurant?.imageUrl).into(findViewById<ImageView>(R.id.ivMenu))
    }

    fun back(){
        findViewById<ImageView>(R.id.ivBackArrowMenu).setOnClickListener{
            finish()
        }
    }

    companion object{
        const val KEY_INTENT_MENU = "menu"
    }

}
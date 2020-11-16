package com.example.digitalhousefood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RestaurantActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant)

        val restaurant =
            listOf(
                    RestaurantModel("https://cdn.pixabay.com/photo/2016/03/05/19/02/hamburger-1238246_960_720.jpg",
                        "Dinho","Rua das canaletas n 78","Fecha as 22:00",
                        listOf(MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste"),
                        MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste"),
                        MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste"),
                        MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste"), MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste"), MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste")),
                    ),RestaurantModel("https://cdn.pixabay.com/photo/2016/03/05/19/02/hamburger-1238246_960_720.jpg",
                    "Dinho","Rua das canaletas n 78","Fecha as 22:00",
                    listOf(MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste"),
                            MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste"),
                            MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste"),
                            MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste"), MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste"), MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste")),
            ),
                    RestaurantModel("https://cdn.pixabay.com/photo/2016/03/05/19/02/hamburger-1238246_960_720.jpg",
                            "Dinho","Rua das canaletas n 78","Fecha as 22:00",
                            listOf(MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste"),
                                    MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste"),
                                    MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste"),
                                    MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste"), MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste"), MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste")),
                    ),
                    RestaurantModel("https://cdn.pixabay.com/photo/2016/03/05/19/02/hamburger-1238246_960_720.jpg",
                            "Dinho","Rua das canaletas n 78","Fecha as 22:00",
                            listOf(MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste"),
                                    MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste"),
                                    MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste"),
                                    MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste"), MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste"), MenuModel("https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_960_720.jpg","Pizza Top","teste")),
                    )
            )


        findViewById<RecyclerView>(R.id.rvRestaurant).apply {
            layoutManager = LinearLayoutManager(this@RestaurantActivity)
            adapter = RestaurantAdapter(restaurant){
                val intent = Intent(this@RestaurantActivity,MenuActivity::class.java)
                intent.putExtra(KEY_INTENT_RESTAURANT,restaurant[it])
                startActivity(intent)
            }
        }
    }

    companion object{
        const val KEY_INTENT_RESTAURANT = "restaurant"
    }
}
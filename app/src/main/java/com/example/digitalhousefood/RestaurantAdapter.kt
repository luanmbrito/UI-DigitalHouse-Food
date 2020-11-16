package com.example.digitalhousefood

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RestaurantAdapter(private val restaurantList: List<RestaurantModel>,private val onItemClicked: (Int) -> Unit)
    : RecyclerView.Adapter<RestaurantAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RestaurantAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.restaurant_list_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantAdapter.ViewHolder, position: Int) {
        holder.bind(restaurantList[position],onItemClicked)
    }

    override fun getItemCount(): Int {
        return restaurantList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(restaurant:RestaurantModel,onItemClicked: (Int) -> Unit) = with(itemView){
            var nome = findViewById<TextView>(R.id.tvNome)
            Glide.with(itemView.context).load(restaurant.imageUrl).into(findViewById<ImageView>(R.id.ivRestaurant))
            nome.text = restaurant.nomeRestaurant
            findViewById<TextView>(R.id.tvEndereco).text = restaurant.endereco
            findViewById<TextView>(R.id.tvFechamento).text = restaurant.fechamento

            findViewById<ConstraintLayout>(R.id.vgRestaurantContainer).setOnClickListener{
                onItemClicked(this@ViewHolder.adapterPosition)
            }

        }
    }

}
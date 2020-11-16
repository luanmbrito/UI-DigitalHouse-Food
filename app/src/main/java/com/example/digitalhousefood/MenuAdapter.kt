package com.example.digitalhousefood

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MenuAdapter(val listMenu: List<MenuModel>,val onItemClicked:(Int) -> Unit):RecyclerView.Adapter<MenuAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.menu_list_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listMenu[position],onItemClicked)
    }

    override fun getItemCount(): Int {
        return listMenu.size
    }


    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        fun bind(menu:MenuModel,onItemClicked:(Int) -> Unit) = with(itemView){
            Glide.with(this).load(menu.imagemUrl).into(findViewById<ImageView>(R.id.ivMenu))
            findViewById<TextView>(R.id.tvComida).text = menu.descricao

            findViewById<ConstraintLayout>(R.id.vgMenuContainer).setOnClickListener{
                onItemClicked(this@ViewHolder.adapterPosition)
            }
        }

    }
}
package com.example.digitalhousefood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.digitalhousefood.MenuActivity.Companion.KEY_INTENT_MENU

class DetailActivity : AppCompatActivity() {

    private var menu : MenuModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        back()
        setup()


    }

    fun setup(){
        val menu = intent.getParcelableExtra<MenuModel>(KEY_INTENT_MENU)
        findViewById<TextView>(R.id.tvDetail).text = menu.detalhe
        findViewById<TextView>(R.id.tvTitle).text = menu.descricao
        Glide.with(this).load(menu?.imagemUrl).into(findViewById<ImageView>(R.id.ivDetail))

    }

    fun back(){
        findViewById<ImageView>(R.id.ivBackArrowDetail).setOnClickListener{
            finish()
        }
    }
}
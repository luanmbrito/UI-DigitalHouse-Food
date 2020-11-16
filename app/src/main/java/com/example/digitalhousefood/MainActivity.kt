package com.example.digitalhousefood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login()
        register()

    }



    fun login() {

        findViewById<MaterialButton>(R.id.btLogin).setOnClickListener{
            val email = findViewById<TextInputEditText>(R.id.tieEmail).editableText.toString()
            val senha = findViewById<TextInputEditText>(R.id.tieSenha).editableText.toString()
            var count: Int = 0

            if(email.isNullOrBlank()){
                findViewById<TextInputLayout>(R.id.tilEmail).error = "Campo em branco"
            }
            else{
                findViewById<TextInputLayout>(R.id.tilEmail).isErrorEnabled = false
                count++
            }

            if(senha.isNullOrBlank()){

                findViewById<TextInputLayout>(R.id.tilSenha).error = "Campo em branco"
            }
            else{
                findViewById<TextInputLayout>(R.id.tilSenha).isErrorEnabled = false
                count++
            }

            if(count == 2) {
                var intent = Intent(this@MainActivity, RestaurantActivity::class.java)
                startActivity(intent)
            }

        }

    }

    fun register(){
        findViewById<MaterialButton>(R.id.btRegistrar).setOnClickListener{
            var intent = Intent(this@MainActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

}
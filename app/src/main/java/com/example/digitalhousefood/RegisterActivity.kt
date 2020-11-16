package com.example.digitalhousefood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        back()
        register()
    }

    fun register() {


        findViewById<MaterialButton>(R.id.btRegister).setOnClickListener{
            val name = findViewById<TextInputEditText>(R.id.tieNameRegister).editableText.toString()
            val email = findViewById<TextInputEditText>(R.id.tieEmailRegister).editableText.toString()
            val senha = findViewById<TextInputEditText>(R.id.tiePasswordRegister).editableText.toString()
            val confirmarSenha = findViewById<TextInputEditText>(R.id.tieRepeatPasswordRegister).editableText.toString()
            var count: Int = 0

            if(name.isNullOrBlank()){
                findViewById<TextInputLayout>(R.id.tilNameRegister).error = "Campo em branco"
            }
            else{
                findViewById<TextInputLayout>(R.id.tilNameRegister).isErrorEnabled = false
                count++
            }

            if(email.isNullOrBlank()){
                findViewById<TextInputLayout>(R.id.tilEmailRegister).error = "Campo em branco"
            }
            else{
                findViewById<TextInputLayout>(R.id.tilEmailRegister).isErrorEnabled = false
                count++
            }

            if(senha.isNullOrBlank()){

                findViewById<TextInputLayout>(R.id.tilPasswordRegister).error = "Campo em branco"
            }
            else{
                findViewById<TextInputLayout>(R.id.tilPasswordRegister).isErrorEnabled = false
                count++
            }

            if(confirmarSenha.isNullOrBlank()){

                findViewById<TextInputLayout>(R.id.tilRepeatPasswordRegister).error = "Campo em branco"
            }
            else{
                findViewById<TextInputLayout>(R.id.tilRepeatPasswordRegister).isErrorEnabled = false
                count++
            }

            if (senha != confirmarSenha){

                findViewById<TextInputLayout>(R.id.tilRepeatPasswordRegister).error = "Senhas não conferem"
            }
            else{
                findViewById<TextInputLayout>(R.id.tilRepeatPasswordRegister).isErrorEnabled = false
                count++
            }

            if(count == 5) {
                var intent = Intent(this@RegisterActivity, RestaurantActivity::class.java)
                startActivity(intent)
            }

        }


    }

    fun back(){
        findViewById<ImageView>(R.id.ivBackArrowRegister).setOnClickListener{
            finish()
        }
    }
}
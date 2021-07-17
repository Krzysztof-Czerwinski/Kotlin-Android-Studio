package com.example.androidkotlintraining

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.RadioButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        editpasswordService(password, password_validate)
        editemailService(email, email_validate)

        sexChoice.setOnCheckedChangeListener { group, checkedId ->
            run {
            val activationIntent: Intent = Intent(applicationContext, MainActivity::class.java)
                var rb: RadioButton = findViewById(checkedId)
                activationIntent.putExtra("s", rb.text)
                startActivity(activationIntent)
        } }


    }

    /*override fun onUserInteraction(){
        if(password.isFocused) {
            if(password.length() <7 ){
                password_validate.setText("Password is too short")
                password_validate.visibility=TextView.VISIBLE
            }
            else {
                password_validate.setText("Almost Enigma")
                password_validate.visibility=TextView.VISIBLE
            }


        }
        else{
            password_validate.visibility = TextView.INVISIBLE
        }

        if(email.isFocused) {
            email_validate.setText("Wrong email")
            for(i in email.text) {
                if(i=='@') {
                    email_validate.setText("Correct email")
                    email_validate.visibility = TextView.VISIBLE
                }
                else {
                    email_validate.visibility = TextView.VISIBLE
                }
            }
        }
        else {
            email_validate.visibility = TextView.INVISIBLE
        }
    }*/

}
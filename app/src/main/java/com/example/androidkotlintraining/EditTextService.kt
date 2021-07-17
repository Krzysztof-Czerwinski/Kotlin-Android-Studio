package com.example.androidkotlintraining

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*

class EditTextService {
}

fun editpasswordService(password: EditText, password_validate: TextView)
{
    password.addTextChangedListener(object: TextWatcher {

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            if(password.length()<=8){
                password_validate.setText("Password is too short")
                password_validate.visibility = TextView.VISIBLE
            }
            else{
                password_validate.setText("Password is correct")
                password_validate.visibility = TextView.VISIBLE
            }
        }

        override fun afterTextChanged(s: Editable?) {
            if(password.length()==0)password_validate.visibility = TextView.INVISIBLE
        }
    })
}

fun editemailService(email: EditText, email_validate: TextView) {
    email.addTextChangedListener(object: TextWatcher{

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            email_validate.setText("Email is wrong")
            for(i:Char in email.text){
                if(i=='@'){
                    email_validate.setText("Email is correct")
                    email_validate.visibility = TextView.VISIBLE
                }
            }
            email_validate.visibility = TextView.VISIBLE
        }

        override fun afterTextChanged(s: Editable?) {
            if(email.length()==0)email_validate.visibility = TextView.INVISIBLE
        }
    })

}
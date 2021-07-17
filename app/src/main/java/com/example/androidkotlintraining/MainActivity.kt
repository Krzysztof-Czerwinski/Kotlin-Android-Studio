package com.example.androidkotlintraining

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG: String = "TAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //R.id.text1 //class R

        button1.setOnClickListener {
            //zdarzenie
            button1.setText("It works");
            //intencja jawna:
            var activityName: Intent  = Intent(applicationContext, SecondActivity::class.java)
            startActivity(activityName)
        }

        button2.setOnClickListener {
            //zdarzenie:
            var message = Toast.makeText(applicationContext, "Thanks", Toast.LENGTH_LONG)
            message.show()
            //intencja niejawna:
            var addrress = "https://pl.linkedin.com/in/krzysztof-czerwiński-49a4a9184/en?trk=people-guest_people_search-card"
            var site = Intent(ACTION_VIEW, Uri.parse(addrress))
            startActivity(site)
        }
        //Log.d(TAG, "Method onCreate: MainActivity")
    }

    /*override fun onStart(){
        super.onStart()
        Log.d(TAG, "Method onStart: MainActivity")
    }*/
    override fun onResume(){
        super.onResume()
        //Log.d(TAG, "Method onResume: MainActivity")
        if(intent.hasExtra("s"))sexTextView.setText(intent.getCharSequenceExtra("s"))
    }
    /*override fun onPause(){
        super.onPause()
        Log.d(TAG, "Method onPause: MainActivity")
    }
    override fun onStop(){
        super.onStop()
        Log.d(TAG, "Method onStop: MainActivity")
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.d(TAG, "Method onDestroy: MainActivity")
    }
    override fun onRestart(){
        super.onRestart()
        Log.d(TAG, "Method onRestart: MainActivity")
    }*/
}
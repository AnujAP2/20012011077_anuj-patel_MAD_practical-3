package com.example.a20012011077_anujpatel_mad_practical_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.content.Intent
import android.widget.Button
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    lateinit var textView2: TextView
    lateinit var button:Button
    lateinit var editTextTextEmailAddress:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView2=findViewById(R.id.textView2)
        button=findViewById(R.id.button)
        editTextTextEmailAddress=findViewById(R.id.editTextTextEmailAddress)

        textView2.setOnClickListener{
            val intent= Intent(this, secondactivity::class.java)
            startActivity(intent)
        }
        button.setOnClickListener {
            val intent= Intent(this, thirdactivity::class.java)
            intent.putExtra("email",editTextTextEmailAddress.text.toString())
            intent.putExtra("message", "Welcome You are login successfully!!")
            startActivity(intent)

        }
    }
// fun GoToNext(view: View) {
// Log.d("Mainactivity","Clicked.")
// val message=mMessage_edittext.text.toString()
// intent=Intent(this,secondactivity::class.java)
// intent.putExtra("MainActivity",message)
// startActivity(intent);
// }
}

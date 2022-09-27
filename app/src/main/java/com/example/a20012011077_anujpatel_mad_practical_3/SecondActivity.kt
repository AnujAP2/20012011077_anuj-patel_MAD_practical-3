package com.example.a20012011077_anujpatel_mad_practical_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.view.View
class secondactivity : AppCompatActivity() {
    //lateinit var button3: Button
    lateinit var editText: EditText
    lateinit var editTextTextEmailAddress2:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        editText = findViewById(R.id.editTextTextPersonName)
        editTextTextEmailAddress2=findViewById(R.id.editTextTextEmailAddress2)
    }
    fun GoToNext(view: View) {
        Log.d("secondactivity", "Clicked.")
        val message = editText.text.toString()
        val intent = Intent(this, thirdactivity::class.java)
        intent.putExtra("email",editTextTextEmailAddress2.text.toString())
        intent.putExtra("message", "Welcome You are register successfully!!")
        startActivity(intent)
    }
}

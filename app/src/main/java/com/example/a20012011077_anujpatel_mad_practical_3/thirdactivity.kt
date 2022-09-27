package com.example.a20012011077_anujpatel_mad_practical_3

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.a20012011077_anujpatel_mad_practical_3.databinding.ActivityThirdactivityBinding

class thirdactivity : AppCompatActivity() {

lateinit var textViewTitle:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thirdactivity)
        textViewTitle=findViewById(R.id.textViewTitle)

      var title=  intent.getStringExtra("email")+ "\n\n" +intent.getStringExtra("message")
        textViewTitle.setText(title)
    }
}
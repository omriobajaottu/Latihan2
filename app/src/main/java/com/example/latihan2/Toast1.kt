package com.example.latihan2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Toast1 : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var editMessage : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast1)

        button=findViewById(R.id.btnPesan)
        editMessage=findViewById(R.id.editMessage)

        button.setOnClickListener{
            Toast.makeText(this,editMessage.text.toString() ,Toast.LENGTH_SHORT).show()
        }
    }
}
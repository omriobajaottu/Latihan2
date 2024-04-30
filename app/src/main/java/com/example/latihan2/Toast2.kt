package com.example.latihan2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Toast2 : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var editNama : EditText
    private lateinit var editNpm : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast2)

        button=findViewById(R.id.btnMessage)
        editNama=findViewById(R.id.editNama)
        editNpm=findViewById(R.id.editNpm)


        button.setOnClickListener{
           val c = editNama.text.toString() + "" + editNpm.text.toString()
            Toast.makeText(this,c,Toast.LENGTH_SHORT).show()
        }
    }
}
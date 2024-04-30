package com.example.latihan2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Tugas1 : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var editName : EditText
    private lateinit var editNomor : EditText
    private lateinit var editProdi : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas1)

        button=findViewById(R.id.btnToast)
        editName=findViewById(R.id.editName)
        editNomor=findViewById(R.id.editNomor)
        editProdi=findViewById(R.id.editProdi)


        button.setOnClickListener{
            val c = editName.text.toString() + "" + editNomor.text.toString()+ "" + editProdi.text.toString()
            Toast.makeText(this,c,Toast.LENGTH_SHORT).show()
        }
    }
}
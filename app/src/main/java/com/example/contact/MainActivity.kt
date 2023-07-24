package com.example.contact

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var editTextNumber: EditText
    private lateinit var buttonAdd: Button
    private val contacts = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById(R.id.editTextName)
        editTextNumber = findViewById(R.id.editTextNumber)
        buttonAdd = findViewById(R.id.buttonAdd)

        buttonAdd.setOnClickListener {
            val name = editTextName.text.toString().trim()
            val number = editTextNumber.text.toString().trim()

            if (name.isEmpty() || number.isEmpty()) {
                Toast.makeText(this, "Please enter name and number", Toast.LENGTH_SHORT).show()
            } else {
                val contact = "$name - $number"
                contacts.add(contact)
                editTextName.setText("")
                editTextNumber.setText("")
                Toast.makeText(this, "Contact added", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

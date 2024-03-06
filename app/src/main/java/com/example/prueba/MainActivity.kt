package com.example.prueba

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.example.prueba.Operaciones

class MainActivity : ComponentActivity() {
    private var num1 : EditText ?= null
    private var num2 : EditText ?= null
    private var resultado : TextView ?= null
    private var btn : Button ?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        findId()

        val items = resources.getStringArray(R.array.operaciones)
        val cmbBox = findViewById<Spinner>(R.id.spinner)
        if (cmbBox   != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, items
            )
            cmbBox.adapter = adapter
        }
        btn!!.setOnClickListener {
            val selected = cmbBox.selectedItemPosition
            val op = Operaciones(num1!!.text.toString().toDouble(),num2!!.text.toString().toDouble())
            when (selected) {
                0 -> resultado!!.text = op.suma().toString()
                1 -> resultado!!.text = op.resta().toString()
                2 -> resultado!!.text = op.multiplicacion().toString()
                3 -> resultado!!.text = op.division()
            }
        }
    }
    private fun findId(){
        num1 = findViewById(R.id.editNum1)
        num2 = findViewById(R.id.editNum2)
        btn = findViewById(R.id.button)
        resultado = findViewById(R.id.editResult)
    }

}


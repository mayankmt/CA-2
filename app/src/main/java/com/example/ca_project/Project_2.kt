package com.example.ca_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Project_2 : AppCompatActivity() {
    lateinit var radioButton: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project2)

        val out = findViewById<EditText>(R.id.Gender)
        val RGrp = findViewById<RadioGroup>(R.id.radioSex)
        val RBtn1 = findViewById<RadioButton>(R.id.radioMale)
        val RBtn2 = findViewById<RadioButton>(R.id.radioFemale)
        val CBox1 = findViewById<CheckBox>(R.id.Cbox1)
        val CBox2 = findViewById<CheckBox>(R.id.Cbox2)
        val CBox3 = findViewById<CheckBox>(R.id.Cbox3)


        RBtn1.setOnClickListener {
            val setId: Int = RGrp.checkedRadioButtonId
            radioButton = findViewById(setId)
            var z: String = radioButton.text.toString()
            out.setText(z)
            Toast.makeText(this, "Male", Toast.LENGTH_SHORT).show()
        }
        RBtn2.setOnClickListener {
            val setId: Int = RGrp.checkedRadioButtonId
            radioButton = findViewById(setId)
            var z: String = radioButton.text.toString()
            out.setText(z)
            Toast.makeText(this, "Female", Toast.LENGTH_SHORT).show()
        }

        CBox1.setOnClickListener {
            Toast.makeText(this, "Readed all the terms and conditions", Toast.LENGTH_SHORT).show()
        }

        CBox2.setOnClickListener {
            Toast.makeText(this, "Accept all terms and conditions", Toast.LENGTH_SHORT).show()
        }

        CBox3.setOnClickListener {
            Toast.makeText(this, "Accept Newsletters and promotions", Toast.LENGTH_SHORT).show()
        }


    }

}
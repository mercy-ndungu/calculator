package com.kirigo.assesment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilNum1: TextInputLayout
    lateinit var tilNum2: TextInputLayout
    lateinit var  etEnternum1: EditText
    lateinit var  etEnternum2: EditText
    lateinit var  btnPlus: Button
    lateinit var  btnMinus: Button
    lateinit var  btnDivide: Button
    lateinit var  btnModulus: Button
    lateinit var tvAnswer: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilNum1 = findViewById(R.id.tilNum1)
        tilNum2 = findViewById(R.id.tilNum2)
        etEnternum1= findViewById(R.id.etEnternum1)
        etEnternum2 = findViewById(R.id.etEnternum2)
        btnPlus = findViewById(R.id.btnPlus)
        btnMinus = findViewById(R.id.btnMinus)
        btnDivide = findViewById(R.id.btnDivide)
        btnModulus = findViewById(R.id.btnModulus)
        tvAnswer = findViewById(R.id.tvAnswer)

        btnPlus.setOnClickListener {
            var number1 = etEnternum1.text.toString().toDouble()
            var number2 = etEnternum2.text.toString().toDouble()
            add(number1,number2)
            validateCalculation()
        }

        btnMinus.setOnClickListener {
            var number1 = etEnternum1.text.toString().toDouble()
            var number2 = etEnternum2.text.toString().toDouble()
            minus(number1,number2)
            validateCalculation()
        }

        btnDivide.setOnClickListener {
            var number1 = etEnternum1.text.toString().toDouble()
            var number2 = etEnternum2.text.toString().toDouble()
            division(number1,number2)
            validateCalculation()
        }

        btnModulus.setOnClickListener {
            var number1 = etEnternum1.text.toString().toDouble()
            var number2 = etEnternum2.text.toString().toDouble()
            modulus(number1,number2)
            validateCalculation()
        }

    }
    fun add(number1: Double, number2: Double){
        var total = number1+number2
        tvAnswer.text= total.toString()
    }
    fun minus (number1: Double, number2: Double){
        var total = number1-number2
        tvAnswer.text= total.toString()
    }
    fun division(number1: Double, number2: Double){
        var total = number1/number2
        tvAnswer.text= total.toString()
    }
    fun modulus(number1: Double, number2: Double){
        var total = number1%number2
        tvAnswer.text= total.toString()
    }

    fun validateCalculation() {
        var firstNumber = etEnternum1.text.toString()
        var secondNumber = etEnternum2.text.toString()
        if (firstNumber.isBlank()){
            tilNum1.error = getString(R.string.number_required)
        }
//        else{
//            tvAnswer.text= total.toString()
//        }
        if (secondNumber.isBlank()){
            tilNum2.error = getString(R.string.numbers_is_required)

        }

    }
}



//Create a calculator app that is capable of performing the following operations on any
//2 numbers: Addition, Subtraction, Modulus, Division.
//Use TextInputLayouts with TextInputEditTexts and be sure to validate your inputs
//appropriately. There also should only be one textview to display the result of all the
//operations.
//Do not repeat yourself.
//Submit both a link to your github repository and an appetize.io link
























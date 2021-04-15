package com.example.micalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var firstNumber =0.0
    private var secondNumber = 0.0
    private var operation: String? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Aplicacion de calculadora en kotlin

        operation =null

        bt0.setOnClickListener(this)
        bt1.setOnClickListener(this)
        bt2.setOnClickListener(this)
        bt3.setOnClickListener(this)
        bt4.setOnClickListener(this)
        bt5.setOnClickListener(this)
        bt6.setOnClickListener(this)
        bt7.setOnClickListener(this)
        bt8.setOnClickListener(this)
        bt9.setOnClickListener(this)
        btComma.setOnClickListener(this)
        btPlus.setOnClickListener(this)
        btMinus.setOnClickListener(this)
        btMul.setOnClickListener(this)
        btDiv.setOnClickListener(this)
        btClear.setOnClickListener(this)





    }

    override fun onClick(view: View?) {
        when(view){
            bt0 -> onNumberPressed("0")
            bt1 -> onNumberPressed("1")
            bt2 -> onNumberPressed("2")
            bt3 -> onNumberPressed("3")
            bt4 -> onNumberPressed("4")
            bt5 -> onNumberPressed("5")
            bt6 -> onNumberPressed("6")
            bt7 -> onNumberPressed("7")
            bt8 -> onNumberPressed("8")
            bt9 -> onNumberPressed("9")
            btComma -> onNumberPressed(",")
            btPlus -> onNumberPressed("")
            btMinus -> onNumberPressed("-")
            btMul -> onNumberPressed("x")
            btDiv -> onNumberPressed("/")
            btEqual -> onNumberPressed("=")
            btClear -> onNumberPressed("Clear")
        }
    }

    private fun onNumberPressed(number: String){
        renderScreen(number)
        checkOperation()
    }

    private fun renderScreen(number: String){
        val result:String = if(screen.text == "0" && number != ",")
            number
        else
            "${screen.text}$number"

        screen.text = result


    }

    private fun checkOperation(){
        if(operation == null)
            firstNumber = screen.text.toString().toDouble()
        else
            secondNumber = screen.text.toString().toDouble()
    }
}

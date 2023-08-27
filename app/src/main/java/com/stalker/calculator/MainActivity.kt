package com.stalker.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.stalker.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var viewBinding : ActivityMainBinding
    private var input = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        allowuUserToGiveInput()

    }

    private fun allowuUserToGiveInput() {
        viewBinding.btnC.setOnClickListener {
            viewBinding.input.text = "0"
            input = ""
        }

        viewBinding.btnOpenBracket.setOnClickListener{
            input = "$input("
            viewBinding.input.text = input
        }

        viewBinding.btnCloseBracket.setOnClickListener{
            input = "$input)"
            viewBinding.input.text = input
        }

        viewBinding.btnMul.setOnClickListener{
            input = "$input*"
            viewBinding.input.text = input
        }

        viewBinding.btnAc.setOnClickListener{
            viewBinding.input.text = "0"
            viewBinding.tvResult.text = "0"
            input = ""

        }

        viewBinding.btnRoot.setOnClickListener{
            input = "$input√"
            viewBinding.input.text = input
        }

        viewBinding.btnPercentage.setOnClickListener{
            input = "$input%"
            viewBinding.input.text = input
        }

        viewBinding.btnDivide.setOnClickListener{
            input = "$input/"
            viewBinding.input.text = input
        }

        viewBinding.btn7.setOnClickListener{
            input += "7"
            viewBinding.input.text = input
        }

        viewBinding.btn8.setOnClickListener{
            input += "8"
            viewBinding.input.text = input
        }

        viewBinding.btn9.setOnClickListener{
            input += "9"
            viewBinding.input.text = input
        }

        viewBinding.btn6.setOnClickListener{
            input += "6"
            viewBinding.input.text = input
        }

        viewBinding.btn5.setOnClickListener{
            input += "5"
            viewBinding.input.text = input
        }

        viewBinding.btn4.setOnClickListener{
            input += "4"
            viewBinding.input.text = input
        }

        viewBinding.btn3.setOnClickListener{
            input += "3"
            viewBinding.input.text = input
        }

        viewBinding.btn2.setOnClickListener{
            input += "2"
            viewBinding.input.text = input
        }


        viewBinding.btn1.setOnClickListener{
            input += "1"
            viewBinding.input.text = input
        }


        viewBinding.btn0.setOnClickListener{
            input += "0"
            viewBinding.input.text = input
        }

        viewBinding.btnDot.setOnClickListener{
            input += "."
            viewBinding.input.text = input
        }

        viewBinding.btnBackspace.setOnClickListener{
            var currentInput : String = viewBinding.input.text.toString()
            if (currentInput.isNotEmpty()) {
                viewBinding.input.text = currentInput.substring(0, currentInput.length - 1)
                input = currentInput.substring(0, currentInput.length - 1)
            }
        }


        viewBinding.btnMinus.setOnClickListener{
            input += "-"
            viewBinding.input.text = input
        }

        viewBinding.btnPlus.setOnClickListener{
            input += "+"
            viewBinding.input.text = input
        }

        viewBinding.btnEqual.setOnClickListener{
            TODO()
        }

        viewBinding.btnDev.setOnClickListener{
            TODO()
        }

    }
}
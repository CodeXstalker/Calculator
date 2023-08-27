package com.stalker.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.stalker.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var viewBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        allowuUserToGiveInput()

    }

    private fun allowuUserToGiveInput() {
        viewBinding.btnC.setOnClickListener {
            viewBinding.input.text = "0"
        }

        viewBinding.btnOpenBracket.setOnClickListener{
            viewBinding.input.text = "("
        }

        viewBinding.btnCloseBracket.setOnClickListener{
            viewBinding.input.text = ")"
        }

        viewBinding.btnMul.setOnClickListener{
            viewBinding.input.text = "*"
        }

        viewBinding.btnAc.setOnClickListener{
            viewBinding.input.text = "0"
            viewBinding.tvResult.text = "0"

        }

        viewBinding.btnRoot.setOnClickListener{
            viewBinding.input.text = "√"
        }

        viewBinding.btnPercentage.setOnClickListener{
            viewBinding.input.text = "%"
        }

        viewBinding.btnDivide.setOnClickListener{
            viewBinding.input.text = "/"
        }

        viewBinding.btn7.setOnClickListener{
            viewBinding.input.text = "7"
        }

        viewBinding.btn8.setOnClickListener{
            viewBinding.input.text = "8"
        }

        viewBinding.btn9.setOnClickListener{
            viewBinding.input.text = "9"
        }

        viewBinding.btn6.setOnClickListener{
            viewBinding.input.text = "6"
        }

        viewBinding.btn5.setOnClickListener{
            viewBinding.input.text = "5"
        }

        viewBinding.btn4.setOnClickListener{
            viewBinding.input.text = "4"
        }

        viewBinding.btn3.setOnClickListener{
            viewBinding.input.text = "3"
        }

        viewBinding.btn2.setOnClickListener{
            viewBinding.input.text = "2"
        }


        viewBinding.btn1.setOnClickListener{
            viewBinding.input.text = "1"
        }


        viewBinding.btn0.setOnClickListener{
            viewBinding.input.text = "0"
        }

        viewBinding.btnDot.setOnClickListener{
            viewBinding.input.text = "."
        }

        viewBinding.btnBackspace.setOnClickListener{
            TODO()
        }


        viewBinding.btnMinus.setOnClickListener{
            viewBinding.input.text = "-"
        }

        viewBinding.btnPlus.setOnClickListener{
            viewBinding.input.text = "+"
        }

        viewBinding.btnEqual.setOnClickListener{
            TODO()
        }

        viewBinding.btnDev.setOnClickListener{
            TODO()
        }

    }
}
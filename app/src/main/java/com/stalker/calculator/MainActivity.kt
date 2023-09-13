package com.stalker.calculator

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.stalker.calculator.databinding.ActivityMainBinding
import org.mozilla.javascript.Context
import org.mozilla.javascript.Scriptable


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

        /**
         * Used concept of substring and updated the new value of "input"
         */


        viewBinding.btnBackspace.setOnClickListener{
            val currentInput : String = viewBinding.input.text.toString()
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
//            val stringInput : String =  viewBinding.input.text.toString()
//            getResult(stringInput)
            getResult(input)
        }

        viewBinding.btnDev.setOnClickListener{
            val url = "https://github.com/CodeXstalker"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

    }

    private fun getResult(data : String) {
        try {
            val context: Context = Context.enter()
            context.optimizationLevel = -1
            val scriptable: Scriptable = context.initStandardObjects()
            var finalResult = context.evaluateString(scriptable, data, "Javascript", 1, null).toString()
            if (finalResult.endsWith(".0")) {
                finalResult = finalResult.replace(".0", "")
            }
            viewBinding.tvResult.text = finalResult
        } catch (e: Exception) {
            viewBinding.tvResult.text = "Err"
        }
    }



}
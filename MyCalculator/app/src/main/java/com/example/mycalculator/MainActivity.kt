package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mycalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.plus.setOnClickListener {
            calculate("+")
        }
        binding.minus.setOnClickListener {
            calculate("-")
        }
        binding.multi.setOnClickListener {
            calculate("*")
        }
        binding.divide.setOnClickListener {
            calculate("/")
        }
        binding.mod.setOnClickListener {
            calculate("%")
        }
        binding.power.setOnClickListener {
            calculate("^")
        }


    }

    fun calculate(oper:String) {

        val a_str=binding.num1.text.toString()
        val b_str=binding.num2.text.toString()
        val A=a_str.toDoubleOrNull()
        val B=b_str.toDoubleOrNull()
        var answer=0.0
        if(A==null )
        {
            binding.ans.text="00"
            binding.num1.setError("Enter First Number")
            return
        }
        if(B==null){
            binding.ans.text="00"
            binding.num2.setError("Enter Second Number")
            return
        }

            val result1 = when (oper) {
                "+" -> A + B
                "-" -> A - B
                "*" -> A * B
                "/" -> A / B
                "%" -> A % B
                "^" -> Math.pow(A,B)
                else -> "0"
            }
            binding.ans.text=result1.toString()



    }
    }

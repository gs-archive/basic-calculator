package com.gulsah.basiccalculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.util.Log
import androidx.annotation.ColorRes
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var tempList: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tempList = ArrayList()
        var result = 0

        buttonOne.setOnClickListener {
            addToList("1")
        }
        buttonTwo.setOnClickListener {
            addToList("2")
        }
        buttonThree.setOnClickListener {
            addToList("3")
        }
        buttonFour.setOnClickListener {
            addToList("4")
        }
        buttonFive.setOnClickListener {
            addToList("5")
        }
        buttonSix.setOnClickListener {
            addToList("6")
        }
        buttonSeven.setOnClickListener {
            addToList("7")
        }
        buttonEight.setOnClickListener {
            addToList("8")
        }
        buttonNine.setOnClickListener {
            addToList("9")
        }
        buttonZero.setOnClickListener {
            addToList("0")
        }
        buttonAddition.setOnClickListener {
            addToList("+")
        }

        buttonEqual.setOnClickListener {
            var splitList = tempList.joinToString("").split("+")
            for (i in splitList) {
                result += i.toInt()
            }
            textView.text = result.toString()
            tempList.clear()
            tempList.add("$result")
            result = 0
        }

        ac.setOnClickListener {
            tempList.clear()
            result = 0
            textView.text = "0"


        }

    }

    fun addToList(s: String) {
        tempList.add(s)
        textView.text = tempList.joinToString("")
    }
}
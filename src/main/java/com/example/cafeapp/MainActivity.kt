package com.example.cafeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btnOrderClicked(view: View){
        tvorder.visibility=View.VISIBLE
        var temp=""
        var milk=""
        var sugar=""
        var teaType=""
        var Order=""
        if (HotColdbtn.isChecked)
            temp="Hot"
        else
            temp="Cold"
        if (checkMilk.isChecked)
            milk = "with milk"
        if (checkSugar.isChecked)
            sugar = "and with sugar"
        if (BlackBtn.isChecked)
            teaType="Black tea"
        else if(GreenBtn.isChecked)
            teaType= "Green tea"
        Order = temp+ " " + teaType + " " + milk + " " + sugar
        tvorder.setText(Order)



    }
}

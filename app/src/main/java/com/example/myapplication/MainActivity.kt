package com.example.myapplication

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView=findViewById<TextView>(R.id.textView)
        val buttonN =findViewById<Button>(R.id.negative)
        val buttonP =findViewById<Button>(R.id.positive)
        var count=textView.text.toString().toInt()
        fun setColor(count :Int){
            if(count<0) textView.setTextColor(resources.getColor(R.color.red))
            else if(count>0)textView.setTextColor(resources.getColor(R.color.green))
            else textView.setTextColor(resources.getColor(R.color.black))
        }
        textView.setText(count.toString())
        buttonN.setOnClickListener {
            count--
        textView.setText("$count")
            setColor(count)
        }
        buttonP.setOnClickListener {
            count++
            textView.setText("$count")
            setColor(count)

        }








    }
}
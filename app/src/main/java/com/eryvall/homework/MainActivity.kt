package com.eryvall.homework

import android.app.admin.SystemUpdateInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.eryvall.homework.databinding.ActivityMainBinding
import java.util.logging.Logger



class MainActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.buttonExit.setOnClickListener{
            finish()
        }
        bindingClass.setTextButton.setOnClickListener {
            bindingClass.textView1.text=getString(R.string.text1)
            bindingClass.textView2.text=getString(R.string.text2)
        }

        bindingClass.changeColorButton.setOnClickListener {
            bindingClass.root.setBackgroundColor(resources.getColor(R.color.black))

        }


    }


}









package com.mikeliu.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class KMainActivity : AppCompatActivity() , View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.text = "我的kotlin"
        button.setOnClickListener(this)

        /*button.setOnClickListener {//点击事件
            Toast.makeText(this, "button", Toast.LENGTH_SHORT).show()
        }*/

    }

    override fun onClick(v: View?) {//点击事件
        when (v?.id) {
            R.id.button ->
                Toast.makeText(this, "button", Toast.LENGTH_SHORT).show()
        }
    }

}

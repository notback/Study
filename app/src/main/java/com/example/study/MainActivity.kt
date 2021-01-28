package com.example.study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a = 1
        // 模板中的简单名称：
        val s1 = "a is $a"
        System.out.println(s1)
    }
}
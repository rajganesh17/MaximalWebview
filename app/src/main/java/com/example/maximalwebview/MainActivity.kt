package com.example.maximalwebview


import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnSearch.setOnClickListener {

            Webview.loadUrl("https://" + etUrl.text.toString())
        }


    }


    }







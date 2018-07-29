package com.chirag.secondapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    //declare var
    private lateinit var mEditText: EditText
    private lateinit var mButton: Button
    private lateinit var mTextViewMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    /**
     * initialise
     */
    private fun init() {
        mEditText = findViewById(R.id.editText)
        mTextViewMessage = findViewById(R.id.textView)
        mButton = findViewById(R.id.button)

        //set listener
        mButton.setOnClickListener(this)
    }

    /**
     * listener to handle click
     */
    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.button -> {
                mTextViewMessage.text = "Hello, ${mEditText.text}"
            }
        }
    }
}

package com.sycompany.bojstep

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    private lateinit var resultLauncher: ActivityResultLauncher<Intent>
    private lateinit var textName : TextView
    private lateinit var textAge : TextView
    private lateinit var nextBtn : Button
    private lateinit var nextBtn2 : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textName = findViewById(R.id.textName)
        textAge = findViewById(R.id.textAge)
        nextBtn = findViewById(R.id.nextBtn)
        nextBtn2 = findViewById(R.id.nextBtnTwo)

        initResultText()

        nextBtn.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            resultLauncher.launch(intent) // startActivityForResult 랑 동일한 기능 이다.
        }

        nextBtn2.setOnClickListener {
            val intent = Intent(this,RxActivity::class.java)
            startActivity(intent)
        }
    }

    @SuppressLint("SetTextI18n")
    private fun initResultText() {
        resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            if (it.resultCode == RESULT_OK) {
                val name = it.data?.getStringExtra("name") ?: ""
                val age = it.data?.getStringExtra("age") ?: ""

                textName.text = "이름 : $name"
                textAge.text = "나이 : $age 살"
            }
        }
    }
}
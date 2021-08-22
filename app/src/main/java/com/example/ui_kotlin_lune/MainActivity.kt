package com.example.ui_kotlin_lune

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        확인버튼이 눌리면 어떤 행동을 할지 이벤트를 달아주자.
        okBtn.setOnClickListener {
//            입력된 내용(=contentEdt의 text의 값)을 조회해(=get) 변수에 저장해두자.

            val inputContent = contentEdt.text.toString()

//            저장해둔 입력값을 텍스트뷰에 내용으로 반영(=set)

            resultTxt.text = inputContent
        }

    }
}
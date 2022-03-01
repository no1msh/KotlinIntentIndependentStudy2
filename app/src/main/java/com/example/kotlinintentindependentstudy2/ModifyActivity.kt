package com.example.kotlinintentindependentstudy2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_modify.*

class ModifyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modify)

        btnSubmitText.setOnClickListener {
            val nickname = edtModifyText.text.toString()

            val modifyIntent = Intent()

            modifyIntent.putExtra("nickname", nickname)

            setResult(RESULT_OK, modifyIntent)

            finish()
        }
    }
}
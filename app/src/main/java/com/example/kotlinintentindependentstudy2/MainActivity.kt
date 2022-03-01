package com.example.kotlinintentindependentstudy2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQ_CODE_NICKNAME = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSendText.setOnClickListener {

            val message = edtSendText.text.toString()

            val textSendIntent = Intent(this, SecondActivity::class.java)

            textSendIntent.putExtra("message", message)

            startActivity(textSendIntent)
        }

        btnModifyText.setOnClickListener {

            val modifyIntent = Intent(this, ModifyActivity::class.java)
            startActivityForResult(modifyIntent, REQ_CODE_NICKNAME)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQ_CODE_NICKNAME) {
            if (resultCode == RESULT_OK) {
                txtNickname.text = data?.getStringExtra("nickname")
            }
        }
    }
}
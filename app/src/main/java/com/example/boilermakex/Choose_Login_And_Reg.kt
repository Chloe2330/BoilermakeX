package com.example.boilermakex
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Choose_Login_And_Reg : AppCompatActivity() {

    private val mLogin by lazy {
        findViewById(R.id.login) as Button
    }

    private val mRegister by lazy {
        findViewById(R.id.register) as Button
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose__login__and__reg)

        mLogin.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val i = Intent(this@Choose_Login_And_Reg, LoginActivity::class.java)
                startActivity(i)
            }
        })
        mRegister.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val i = Intent(this@Choose_Login_And_Reg, RegisterActivity::class.java)
                startActivity(i)
            }
        })
    }




}
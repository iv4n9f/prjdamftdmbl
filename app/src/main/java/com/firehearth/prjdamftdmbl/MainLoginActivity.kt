package com.firehearth.prjdamftdmbl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainLoginActivity : AppCompatActivity() {

    lateinit var emailfield: EditText
    lateinit var passwordfield: EditText
    lateinit var loginButton: Button
    lateinit var registerButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)
    }
    override fun onStart(){
        super.onStart()
        emailfield = findViewById(R.id.MainLoginDisplayInputTextUser)
        passwordfield = findViewById(R.id.MainLoginDisplayInputTextPassword)
        loginButton = findViewById(R.id.MainLoginDisplayLogin)
        registerButton = findViewById(R.id.MainLoginDisplayRegister)
        addListerners()
    }
    fun addListerners(){
        registerButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainRegisterActivity::class.java)
            startActivity(intent)
        })
    }
}
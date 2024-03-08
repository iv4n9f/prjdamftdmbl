package com.firehearth.prjdamftdmbl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainLoginActivity : AppCompatActivity() {

    var emailfield: EditText = findViewById(R.id.MainLoginDisplayInputTextUser)
    var passwordfield: EditText = findViewById(R.id.MainLoginDisplayInputTextPassword)

    var loginButton: Button = findViewById(R.id.MainLoginDisplayLogin)
    var registerButton: Button = findViewById(R.id.MainLoginDisplayRegister)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)
        addListerners()
    }
    fun addListerners(){
        registerButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainRegisterActivity::class.java)
            startActivity(intent)
        })
    }
}
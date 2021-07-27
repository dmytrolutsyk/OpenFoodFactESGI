package com.example.openfoodfactesgi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.net.toUri
import com.example.openfoodfactesgi.services.NetworkProviderAPI
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {


   // lateinit var networkProvider : NetworkProviderAPI
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Log.d("cotest", loginEDT.text.toString())
        loginBTN.setOnClickListener {
          //  networkProvider.instance.login(loginEDT.text.toString(), passwordEDT.text.toString())
        }

    }
}
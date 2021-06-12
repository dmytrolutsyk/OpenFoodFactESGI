package com.example.openfoodfactesgi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.net.toUri

class LoginActivity : AppCompatActivity() {

    private val userLoginUri by lazy { "${getString(R.string.website)}cgi/user.pl".toUri() }
    private val resetPasswordUri by lazy { "${getString(R.string.website)}cgi/reset_password.pl".toUri() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}
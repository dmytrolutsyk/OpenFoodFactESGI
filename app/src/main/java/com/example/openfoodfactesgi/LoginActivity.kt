package com.example.openfoodfactesgi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.net.toUri
import com.example.openfoodfactesgi.services.NetworkProviderAPI
import android.view.View
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.Toolbar
import androidx.core.net.toUri
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    lateinit var connectButton : Button
    lateinit var forgotPasswordButton : Button
    lateinit var goToSignupButton : Button
    lateinit var SignupButton : Button


   // lateinit var networkProvider : NetworkProviderAPI
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        Log.d("cotest", loginEDT.text.toString())
        loginBTN.setOnClickListener {
          //  networkProvider.instance.login(loginEDT.text.toString(), passwordEDT.text.toString())
        }

        setTitle("Connexion")

        if (swich_signup_button != null)
            swich_signup_button.setOnClickListener { swichView() }


    }


    // don't forget click listener for back button
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    fun swichView(){
        if (signup_button.visibility == View.VISIBLE) {
            //Connection view
            setTitle("Connexion")
            password_confirm.visibility = View.GONE
            signup_button.visibility = View.GONE
            swich_signup_button.visibility = View.VISIBLE
            forgot_password_button.visibility = View.VISIBLE
            loginBTN.visibility = View.VISIBLE
        } else {
            //Sign up view
            setTitle("Nouveau Compte")
            password_confirm.visibility = View.VISIBLE
            signup_button.visibility = View.VISIBLE
            swich_signup_button.visibility = View.GONE
            forgot_password_button.visibility = View.GONE
            loginBTN.visibility = View.GONE
        }
    }
}
package com.example.splashscreenwithsignup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    // Assume these are your EditText fields
    lateinit var et_Email: EditText
    lateinit var et_pass: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

//        val loginButton = findViewById<Button>(R.id.loginButton)
//        loginButton.setOnClickListener {
//            Toast.makeText(this,"Login Successfully", Toast.LENGTH_LONG).show()
//        }

        // Initialize your EditText fields
        et_Email = findViewById<EditText>(R.id.et_Email)
        et_pass = findViewById<EditText>(R.id.et_pass)

        // Assume this is your login button
        val loginButton= findViewById<Button>(R.id.loginButton)

        // Set a click listener for the login button
        loginButton.setOnClickListener {
            // Get the entered email and password
            val enteredEmail = et_Email.text.toString()
            val enteredPassword = et_pass.text.toString()

            // Perform validation
            if (isValidCredentials(enteredEmail, enteredPassword)) {
                // Valid credentials, show success toast
                showToast("Login successful")
            } else {
                // Invalid credentials, show error toast
                showToast("Invalid login details")
            }
        }
    }
    private fun isValidCredentials(email: String, password: String): Boolean {
        // Perform your validation logic here
        // For simplicity, let's assume a simple check (non-empty email and password)
        return email.isNotEmpty() && password.isNotEmpty()
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
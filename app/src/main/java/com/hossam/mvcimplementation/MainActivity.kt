/*
 * *
 *  * Created by Hossam Waziry on 28/02/2022, 18:57
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 28/02/2022, 18:57
 *
 */

package com.hossam.mvcimplementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.hossam.mvcimplementation.R
import com.hossam.mvcimplementation.databinding.ActivityMainBinding
import com.hossam.mvcimplementation.ui.MainController

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainController: MainController = MainController()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUi()
    }

    private fun initUi(){
        binding.btnLogin.setOnClickListener {
            if (mainController.login(
                    binding.usernameEdittext.text.toString(),
                    binding.passwordEdittext.text.toString()
                )==1
            ) {
                Toast.makeText(this,"Login is succeeded",Toast.LENGTH_SHORT).show()
            }else Toast.makeText(this,"Login is Failed",Toast.LENGTH_SHORT).show()
        }
    }
}
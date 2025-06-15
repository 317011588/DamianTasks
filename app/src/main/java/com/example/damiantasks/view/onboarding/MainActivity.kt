package com.example.damiantasks.view.onboarding

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.damiantasks.databinding.ActivityMainBinding
import com.example.damiantasks.utils.FragmentCommunicator

class MainActivity : AppCompatActivity(), FragmentCommunicator {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun showLoader(value: Boolean) {
        binding.main.visibility = if (value) View.VISIBLE else View.GONE
    }
}
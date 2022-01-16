package com.example.batapikaever

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.batapikaever.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startBtn.setOnClickListener{
            val intent =  Intent(this, TorchOnService::class.java)
            startService(intent)
        }

        binding.stopBtn.setOnClickListener{
            val intent =  Intent(this, TorchOnService::class.java)
            stopService(intent)
        }
    }
}
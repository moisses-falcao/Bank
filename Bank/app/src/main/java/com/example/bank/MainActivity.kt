package com.example.bank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bank.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.saldo.setOnClickListener(){
            val intent = Intent(this, Saldo::class.java)
            startActivity(intent)
            finish()
        }

        binding.fatura.setOnClickListener(){
            val intent = Intent(this, Fatura::class.java)
            startActivity(intent)
            finish()
        }

        binding.transferencia.setOnClickListener(){
            val intent = Intent(this, Transferencia::class.java)
            startActivity(intent)
            finish()
        }

        binding.poupanca.setOnClickListener(){
            val intent = Intent(this, Poupanca::class.java)
            startActivity(intent)
            finish()
        }

    }


}
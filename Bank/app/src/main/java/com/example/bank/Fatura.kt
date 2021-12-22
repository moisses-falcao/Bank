package com.example.bank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bank.databinding.ActivityFaturaBinding

class Fatura : AppCompatActivity() {

    private lateinit var binding: ActivityFaturaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityFaturaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val toolbar = binding.toolbarFatura
        toolbar.title="Fatura"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setBackgroundColor(getColor(R.color.light_blue))

        toolbar.setNavigationIcon(R.drawable.voltar)
        toolbar.setNavigationOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
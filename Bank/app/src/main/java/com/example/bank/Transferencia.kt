package com.example.bank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bank.databinding.ActivityTransferenciaBinding

class Transferencia : AppCompatActivity() {

    private lateinit var binding: ActivityTransferenciaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTransferenciaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        supportActionBar!!.hide()

        var toolbar = binding.toolbarTransferencia

        toolbar.title="Transferência"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setBackgroundColor(getColor(R.color.light_blue))

        toolbar.setNavigationIcon(getDrawable(R.drawable.voltar))
        toolbar.setNavigationOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
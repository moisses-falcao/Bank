package com.example.bank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bank.databinding.ActivityPoupancaBinding

class Poupanca : AppCompatActivity() {

    private lateinit var binding: ActivityPoupancaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPoupancaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar!!.hide()

        var toolbar = binding.toolbarPoupanca

        toolbar.title="Poupança"
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
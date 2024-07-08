package com.example.androidassessment

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidassessment.databinding.ActivityMainBinding
import com.example.androidassessment.databinding.MoneyListItemBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val money= listOf("")
        binding.rvMoney.layoutManager=LinearLayoutManager(this)
        val moneyAdapter=MoneyListItemBinding
            binding.rvMoney.adapter.
    }
}


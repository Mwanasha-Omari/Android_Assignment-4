package com.example.androidassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidassessment.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        displayExpenses()

    }

    fun displayExpenses(){
        val expense1 = Money("","Salary","2 July 2024","KES 17400")
        val expense2 = Money("","Salary","3 July 2024","KES 42000")
        val expense3 = Money("","Salary","2 July 2024","KES 17400")
        val expense4 = Money("","Salary","3 July 2024","KES 42000")
        val expense5 = Money("","Salary","2 July 2024","KES 17400")
        val expense6 = Money("","Salary","3 July 2024","KES 42000")
        val expense7 = Money("","Salary","2 July 2024","KES 17400")
        val expense8 = Money("","Salary","3 July 2024","KES 42000")
        val expense9 = Money("","Salary","2 July 2024","KES 17400")
        val expense10 = Money("","Salary","3 July 2024","KES 42000")


        val expenseList = listOf(expense1,expense2,expense3,expense4,expense5,expense6,expense7,expense8,expense9,expense10)
        val transactionsAdapter = TransactionsAdapter(expenseList)
        binding.recyclerView.adapter = transactionsAdapter
    }

}





package com.example.androidassessment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class TransactionAdapter( private var expenseList:List<Money>):
    RecyclerView.Adapter<TransactionsAdapter>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val itemView=LayoutInflater.from(parent.context)
           .inflate(R.layout.money_list_item,parent,false)
        return TransactionViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TransactionAdapter, position: Int) {
        val money=expenseList[position]
        holder.tvSalary.text = money.text
        holder.tvSalaryAmount.text = money.salary
        holder.tvDate.text = money.date

    }

    override fun getItemCount(): Int {
        return expenseList.size

    }
}

class TransactionsAdapter(itemView: List<Money>):RecyclerView.ViewHolder(itemView){
    val tvSalary=itemView.findViewById<TextView>(R.id.tvSalary)
    val tvDate=itemView.findViewById<TextView>(R.id.tvDate)
    val tvSalaryAmount=itemView.findViewById<TextView>(R.id.tvSalaryAmount)

}



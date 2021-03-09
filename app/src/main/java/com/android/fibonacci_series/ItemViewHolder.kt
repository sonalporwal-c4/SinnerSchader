package com.android.fibonacci_series

import androidx.recyclerview.widget.RecyclerView
import com.android.fibonacci_series.databinding.FibonacciListItemBinding

class ItemViewHolder(private val binding: FibonacciListItemBinding)
    : RecyclerView.ViewHolder(binding.root) {

    fun bind(position: Int) {
        binding.cellNo.text = "Cell "+(position+1)
        binding.fibonacciNo.text = "Fibonacci "+(FibonacciListCalculation.getFibonacciNumber(position))
    }

}
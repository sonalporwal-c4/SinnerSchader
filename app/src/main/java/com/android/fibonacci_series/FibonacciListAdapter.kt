package com.android.fibonacci_series
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.fibonacci_series.databinding.FibonacciListItemBinding

class FibonacciListAdapter(private var count: Int) : RecyclerView.Adapter<ItemViewHolder>() {

    override fun getItemCount() = count

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemBinding =
            FibonacciListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(position)
    }

    fun addItems(itemsAddCount : Int) {
        count +=itemsAddCount
        notifyItemRangeInserted(count-itemsAddCount, count)
    }

}

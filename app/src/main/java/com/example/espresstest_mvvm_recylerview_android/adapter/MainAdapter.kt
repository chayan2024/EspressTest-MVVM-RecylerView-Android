package com.example.espresstest_mvvm_recylerview_android.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.espresstest_mvvm_recylerview_android.databinding.ItemBinding
import com.example.espresstest_mvvm_recylerview_android.databinding.ItemBinding.inflate
import com.example.espresstest_mvvm_recylerview_android.model.ItemData

class MainAdapter(var itemData: List<ItemData>) : RecyclerView.Adapter<MainAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = inflate(inflater, parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(itemData[position])
    }

    override fun getItemCount(): Int = itemData.size

    class ItemViewHolder(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(itemData: ItemData) {
            binding.item = itemData
            binding.executePendingBindings()
        }
    }
}

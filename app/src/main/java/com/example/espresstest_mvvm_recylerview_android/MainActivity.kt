package com.example.espresstest_mvvm_recylerview_android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.espresstest_mvvm_recylerview_android.adapter.MainAdapter
import com.example.espresstest_mvvm_recylerview_android.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModel: MainViewModel
    private lateinit var adapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        viewModel = MainViewModel()
        adapter = MainAdapter(emptyList())

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        viewModel.items.observe(this) { items ->
            adapter.apply {
                this.itemData = items
                notifyDataSetChanged()
            }
        }
    }
}

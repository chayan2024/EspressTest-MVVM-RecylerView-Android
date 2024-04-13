package com.example.espresstest_mvvm_recylerview_android.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.espresstest_mvvm_recylerview_android.model.ItemData

class MainViewModel : ViewModel() {
    private val _items = MutableLiveData<List<ItemData>>()
    val items: LiveData<List<ItemData>>
        get() = _items

    init {
        val itemDataLists = listOf(
            ItemData(1, "Apple US"),
            ItemData(2, "Google India"),
            ItemData(3, "Tesla India"),
            ItemData(3, "Amazon UK")
        )
        _items.value = itemDataLists

    }
}

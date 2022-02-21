package com.wwt.android.itemlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wwt.android.itemlist.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ItemListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val model: ItemListViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}
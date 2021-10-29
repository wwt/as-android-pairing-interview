package com.wwt.android.itemlist

import android.app.Application
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class ItemListApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(
                module {
                    viewModel { ItemListViewModel() }
                }
            )
        }
    }
}
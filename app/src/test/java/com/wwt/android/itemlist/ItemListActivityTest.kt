package com.wwt.android.itemlist

import androidx.test.core.app.launchActivity
import androidx.test.ext.junit.runners.AndroidJUnit4
import io.kotest.matchers.shouldNotBe
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module
import org.koin.test.AutoCloseKoinTest
import org.mockito.kotlin.mock
import org.robolectric.annotation.Config

@RunWith(AndroidJUnit4::class)
@Config(sdk = [28])
class ItemListActivityTest : AutoCloseKoinTest() {
    private val itemListViewModel: ItemListViewModel = mock()

    @Before
    fun setUp() {
        loadKoinModules(module {
            viewModel(override = true) { itemListViewModel }
        })
    }

    @Test
    fun `Example test`() {
        launchActivity<ItemListActivity>().onActivity {
            it shouldNotBe null
        }
    }
}
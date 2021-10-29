package com.wwt.android.itemlist

import android.app.Activity
import androidx.lifecycle.MutableLiveData
import androidx.test.core.app.ActivityScenario.launch
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item.view.*
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module
import org.koin.test.AutoCloseKoinTest
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
        var activity: ItemListActivity? = null

        launch(ItemListActivity::class.java).onActivity {
            activity = it
        }

        assertNotNull(activity)
    }
}
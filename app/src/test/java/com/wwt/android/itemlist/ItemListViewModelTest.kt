package com.wwt.android.itemlist

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert.assertNotNull
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule

class ItemListViewModelTest {
    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()

    @Test
    fun `Example test`() {
        val testObject = ItemListViewModel()

        assertNotNull(testObject)
    }
}
package com.wwt.android.itemlist

import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.wwt.android.matchers.atPosition
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
    private val itemListViewModel: ItemListViewModel = ItemListViewModel()

    @Before
    fun setUp() {
        loadKoinModules(module {
            viewModel(override = true) { itemListViewModel }
        })
    }

    @Test
    fun `should add item and clear input field`() {
        launchActivity<ItemListActivity>().use {
            onView(withId(R.id.newItemInput)).perform(typeText("New Item"))

            onView(withId(R.id.addButton)).perform(click())

            onView(withId(R.id.newItemInput)).check(matches(withText("")))
            onView(withId(R.id.itemsRecycler)).check(matches(atPosition(0, hasDescendant(withText("New Item")))))
        }
    }
}
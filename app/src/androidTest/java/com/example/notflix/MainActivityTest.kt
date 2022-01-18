package com.example.notflix

import android.text.TextUtils
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.notflix.utils.DataDummy
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    private val dummyMovies = DataDummy.generateDummyMovies()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loadMovies() {
        onView(withId(R.id.rv_movie_list)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie_list)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyMovies.size
            )
        )
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rv_movie_list)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.tv_detail_item_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_detail_item_title)).check(matches(withText(dummyMovies[0].title)))
        onView(withId(R.id.tv_detail_item_lang)).check(matches(withText(dummyMovies[0].language)))
        onView(withId(R.id.tv_detail_item_overview)).check(matches(withText(dummyMovies[0].overview)))
        onView(withId(R.id.tv_detail_item_vote)).check(matches(withText(dummyMovies[0].vote.toString())))
        onView(withId(R.id.tv_detail_item_year)).check(
            matches(
                withText(
                    TextUtils.substring(
                        dummyMovies[0].releaseDate,
                        0,
                        4
                    )
                )
            )
        )
    }
}
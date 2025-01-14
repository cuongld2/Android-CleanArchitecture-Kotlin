package com.fernandocejas.sample

import androidx.test.espresso.action.ViewActions.typeText


import androidx.test.espresso.Espresso

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId

import androidx.test.rule.ActivityTestRule
import com.fernandocejas.sample.features.movies.MoviesActivity
import junit.framework.Assert.assertTrue
import org.hamcrest.MatcherAssert.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test


class MainApplicationTest {
    @get:Rule
    val mActivityRule = ActivityTestRule(MoviesActivity::class.java, true, false)

    @Before
    fun setUp() {
        mActivityRule.launchActivity(null)
        Intents.init();
    }

    @After
    fun tearDown() {
        Intents.release();
    }

    @Test
    fun clickMovieListButton() {

        val movieListButton = onView(withId(R.id.movieList))
        movieListButton.perform(click())
        val moviePoster = onView(withId(R.id.moviePoster))
        moviePoster.check(matches(isDisplayed()))
    }


}
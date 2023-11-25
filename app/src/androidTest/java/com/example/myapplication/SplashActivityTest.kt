package com.example.myapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class SplashActivityTest {

    @get:Rule
    val activityTest = ActivityScenarioRule(SplashActivity::class.java)



    @Test
    fun clickLoginButton() {
        onView(withId(R.id.button)).check(matches(isDisplayed()))
        onView(withId(R.id.button)).perform(ViewActions.click())
        onView(withId(R.id.login)).check(matches(isDisplayed()))
        onView(withId(R.id.password)).check(matches(isDisplayed()))
        onView(withId(R.id.login)).perform(ViewActions.typeText("login"),closeSoftKeyboard())
        onView(withId(R.id.password)).perform(ViewActions.typeText("12345"),closeSoftKeyboard())
        onView(withId(R.id.enter)).perform(ViewActions.click())
        onView(withId(R.id.result)).check(matches(ViewMatchers.withText("Success!")))
    }


}
package com.brywal07.criminalintentbw


import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.Test


class CrimeDetailFragmentTest {

    @Test
    fun editText() {
        val scenario: FragmentScenario<CrimeDetailFragment> =
            launchFragmentInContainer()
        onView(withId(R.id.crime_title)).perform(typeText("New Crime Title"))
        scenario.onFragment { fragment ->
            assertEquals(fragment.crime.title, "New Crime Title")
        }
    }

    @Test
    fun checkBox() {
        val scenario: FragmentScenario<CrimeDetailFragment> =
            launchFragmentInContainer()
        onView(withId(R.id.crime_solved)).perform(click())
        scenario.onFragment { fragment ->
            assertTrue(fragment.crime.isSolved)
        }
    }
}
package net.davidcrotty.bikecatalogue.cucumber.steps

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.test.InstrumentationRegistry
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4

import net.davidcrotty.bikecatalogue.MainActivity
import net.davidcrotty.bikecatalogue.SecondActivity
import net.davidcrotty.bikecatalogue.cucumber.page.MainPage
import net.davidcrotty.bikecatalogue.cucumber.page.SecondPage
import net.davidcrotty.bikecatalogue.util.ActivityFinisher

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import cucumber.api.java.After
import cucumber.api.java.Before
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import junit.framework.Assert.assertNotNull

/**
 * Created by David Crotty on 01/11/2017.
 *
 *
 * Copyright © 2017 David Crotty - All Rights Reserved
 */
@RunWith(AndroidJUnit4::class)
class LoadCatalogueTest {

    private val mInstrumentationContext: Context? = null
    private val mAppContext: Context? = null
    private var mActivity: Activity? = null
    private var page: SecondPage? = null

    @Rule
    private val mActivityRule = ActivityTestRule(SecondActivity::class.java,
            false, false)

    @Test
    @Given("^A load button on screen$")
    fun loadButtonOnScreen() {
        mActivity = mActivityRule.launchActivity(Intent())
        page = SecondPage()
    }

    @Test
    @When("^User taps load button$")
    @Throws(Throwable::class)
    fun userTapsLoadButton() {
        page!!.pressButton()
    }

    @Test
    @Then("^Bike data should be displayed$")
    @Throws(Throwable::class)
    fun bikeDataShouldBeDisplayed() {
        page!!.hasLoaded()
        ActivityFinisher.finishOpenActivities()
    }
}

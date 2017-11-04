package net.davidcrotty.bikecatalogue.cucumber.steps

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Debug
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4

import net.davidcrotty.bikecatalogue.MainActivity
import net.davidcrotty.bikecatalogue.cucumber.page.MainPage
import net.davidcrotty.bikecatalogue.util.ActivityFinisher

import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException
import org.junit.runner.RunWith

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

/**
 * Created by David Crotty on 30/10/2017.
 *
 *
 * Copyright © 2017 David Crotty - All Rights Reserved
 */
@RunWith(AndroidJUnit4::class)
class AppStartTest {

    private val mInstrumentationContext: Context? = null
    private val mAppContext: Context? = null
    private var mActivity: Activity? = null
    private var mainPage: MainPage? = null

    @Rule
    private val mActivityRule = ActivityTestRule(MainActivity::class.java,
            false, false)

    @Rule
    var expectedEx = ExpectedException.none()

    @Test
    @Given("^A bike image$")
    @Throws(Exception::class)
    fun aBikeImage() {
        expectedEx.expect(Exception::class.java)
        //Activity must launch within the given, when and then cycle
        mActivity = mActivityRule.launchActivity(Intent())
        mainPage = MainPage()
    }

    @Test
    @When("^The app launches$")
    fun theAppLaunches() {

    }

    @Test
    @Then("^A bike image should be rendered$")
    fun aBikeImageShouldBeRendered() {
        mainPage!!.hasImage()
        ActivityFinisher.finishOpenActivities()
    }
}

package net.davidcrotty.bikecatalogue.cucumber.steps;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import net.davidcrotty.bikecatalogue.MainActivity;
import net.davidcrotty.bikecatalogue.SecondActivity;
import net.davidcrotty.bikecatalogue.cucumber.page.MainPage;
import net.davidcrotty.bikecatalogue.util.ActivityFinisher;

import org.junit.Rule;
import org.junit.runner.RunWith;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by David Crotty on 01/11/2017.
 * <p>
 * Copyright © 2017 David Crotty - All Rights Reserved
 */
@SuppressWarnings("JUnitTestCaseWithNoTests")
@RunWith(AndroidJUnit4.class)
public class LoadCatalogueTest {

    @SuppressWarnings("unused")
    private Context mInstrumentationContext;
    @SuppressWarnings("unused")
    private Context mAppContext;
    private Activity mActivity;
    private MainPage page;

    @Rule
    private ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class,
            false, false);

    @Given("^A load button on screen$")
    public void loadButtonOnScreen() {
        mActivity = mActivityRule.launchActivity(new Intent());
        page = new MainPage();
    }

    @When("^User taps load button$")
    public void userTapsLoadButton() throws Throwable {

    }

    @Then("^Bike data should be displayed$")
    public void bikeDataShouldBeDisplayed() throws Throwable {
        page.hasImage();
        ActivityFinisher.finishOpenActivities();
    }
}

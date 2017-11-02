package net.davidcrotty.bikecatalogue.cucumber.steps;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import net.davidcrotty.bikecatalogue.MainActivity;
import net.davidcrotty.bikecatalogue.cucumber.page.MainPage;
import net.davidcrotty.bikecatalogue.util.ActivityFinisher;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by David Crotty on 30/10/2017.
 * <p>
 * Copyright © 2017 David Crotty - All Rights Reserved
 */
@SuppressWarnings("JUnitTestCaseWithNoTests")
@RunWith(AndroidJUnit4.class)
public class AppStartTest {

    @SuppressWarnings("unused")
    private Context mInstrumentationContext;
    @SuppressWarnings("unused")
    private Context mAppContext;
    private Activity mActivity;
    private MainPage mainPage;

    @Rule
    private ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class,
            false, false);

    @Test
    @Given("^A bike image$")
    public void aBikeImage() {
        //Activity must launch within the given, when and then cycle
        mActivity = mActivityRule.launchActivity(new Intent());
        mainPage = new MainPage();
    }

    @Test
    @When("^The app launches$")
    public void theAppLaunches() {

    }

    @Test
    @Then("^A bike image should be rendered$")
    public void aBikeImageShouldBeRendered() {
        mainPage.hasImage();
        ActivityFinisher.finishOpenActivities();
    }
}

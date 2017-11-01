package net.davidcrotty.bikecatalogue.cucumber.steps;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import net.davidcrotty.bikecatalogue.MainActivity;
import net.davidcrotty.bikecatalogue.R;
import net.davidcrotty.bikecatalogue.cucumber.page.MainPage;

import org.junit.Rule;
import org.junit.runner.RunWith;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.Assert.assertNotNull;

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

    @Before //Very important to make sure this is cucumbers before NOT JUnits
    public void setUp() throws Exception {
        mInstrumentationContext = InstrumentationRegistry.getContext();
        mAppContext = InstrumentationRegistry.getTargetContext();
        mActivity = mActivityRule.launchActivity(new Intent());
        assertNotNull(mActivity);
    }

    @Given("^A bike image$")
    public void aBikeImage() {
        mainPage = new MainPage();
    }

    @When("^The app launches$")
    public void theAppLaunches() {

    }

    @Then("^A bike image should be rendered$")
    public void aBikeImageShouldBeRendered() {
        mainPage.hasImage();
    }
}

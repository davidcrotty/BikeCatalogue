package net.davidcrotty.bikecatalogue.cucumber.steps;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import net.davidcrotty.bikecatalogue.DownloadActivity;
import net.davidcrotty.bikecatalogue.R;
import net.davidcrotty.bikecatalogue.util.ActivityFinisher;

import org.junit.Rule;
import org.junit.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by David Crotty on 04/11/2017.
 * <p>
 * Copyright © 2017 David Crotty - All Rights Reserved
 */

public class NetworkActivityTest {

    @Rule
    private ActivityTestRule<DownloadActivity> mActivityRule = new ActivityTestRule<>(DownloadActivity.class,
            false, false);

    @Test
    @Given("^A downloadable URL and button$")
    public void givenDownloadableURL() {
        mActivityRule.launchActivity(new Intent());

        onView(withId(R.id.download_button)).check(matches(isDisplayed()));
    }

    @Test
    @When("^User taps download button$")
    public void userTapsButton() {
        onView(withId(R.id.download_button)).perform(click());
    }

    @Test
    @Then("^After a network delay, provide an image$")
    public void provideAnImage() {
        onView(withId(R.id.status_text)).check(matches(withText("success")));
        ActivityFinisher.finishOpenActivities();
    }
}

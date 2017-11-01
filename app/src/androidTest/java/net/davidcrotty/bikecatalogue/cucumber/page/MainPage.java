package net.davidcrotty.bikecatalogue.cucumber.page;

import net.davidcrotty.bikecatalogue.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by David Crotty on 01/11/2017.
 * <p>
 * Copyright © 2017 David Crotty - All Rights Reserved
 */

public class MainPage {
    public MainPage() {
        onView(withId(R.id.main_activity)).check(matches(isDisplayed()));
    }

    public void hasImage() {
        onView(withId(R.id.bike_image)).check(matches(isDisplayed()));
    }
}

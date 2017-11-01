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

public class SecondPage {

    public SecondPage() {
        onView(withId(R.id.activity_second)).check(matches(isDisplayed()));
    }

    public void pressButton() {

    }

    public void hasLoaded() {

    }
}

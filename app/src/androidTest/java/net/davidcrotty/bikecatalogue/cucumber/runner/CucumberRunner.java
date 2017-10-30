package net.davidcrotty.bikecatalogue.cucumber.runner;

import android.os.Bundle;
import android.support.test.runner.AndroidJUnitRunner;

import cucumber.api.android.CucumberInstrumentationCore;

/**
 * Created by David Crotty on 30/10/2017.
 * <p>
 * Copyright © 2017 David Crotty - All Rights Reserved
 */
public class CucumberRunner extends AndroidJUnitRunner {

    private final CucumberInstrumentationCore instrumentationCore = new CucumberInstrumentationCore(this);

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        instrumentationCore.create(bundle);
    }

    @Override
    public void onStart() {
        waitForIdleSync();
        instrumentationCore.start();
    }
}
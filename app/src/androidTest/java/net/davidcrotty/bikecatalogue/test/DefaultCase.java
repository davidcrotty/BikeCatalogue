package net.davidcrotty.bikecatalogue.test;

import cucumber.api.CucumberOptions;

/**
 * Created by David Crotty on 30/10/2017.
 * <p>
 * Copyright © 2017 David Crotty - All Rights Reserved
 */
@CucumberOptions(features = "features",
        glue={"net.davidcrotty.bikecatalogue.cucumber.steps"})
public class DefaultCase {
}

package com.guru.demo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\com.guru.demo\\features",
        glue = "com.guru.demo.stepsDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RegistrarRunner {
}

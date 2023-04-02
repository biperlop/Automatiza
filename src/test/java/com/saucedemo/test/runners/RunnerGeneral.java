package com.saucedemo.test.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/navegacion.feature",
        glue = "com.saucedemo.main.definitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerGeneral {
}

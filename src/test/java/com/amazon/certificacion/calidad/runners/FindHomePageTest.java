package com.amazon.certificacion.calidad.runners;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/find_amazon_homepage.feature",
        glue="com.amazon.certificacion.calidad.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class FindHomePageTest {

}

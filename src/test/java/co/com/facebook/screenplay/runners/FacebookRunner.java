package co.com.facebook.screenplay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/facebook/FaceBook.feature",
        tags= "@TestCase1",
        glue="co.com.facebook.screenplay.stepdefinitions",
        snippets=SnippetType.CAMELCASE		)

public class FacebookRunner {

}
package co.com.facebook.screenplay.stepdefinitions.faceboock;

import co.com.facebook.screenplay.model.entities.CurrentUserEntity;
import co.com.facebook.screenplay.tasks.OpenTask;
import co.com.facebook.screenplay.tasks.factory.FillFormTaskFactory;
import co.com.facebook.screenplay.tasks.factory.LoadTaskFactory;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FaceBookStepDefinition {

    @Before
    public void initialConfiguration() {
        setTheStage(new OnlineCast());
    }


    @Given("^(.*) load my personal info$")
    public void uploadTheTransactionData(String actor , List<String> data) {
        theActorCalled(actor).wasAbleTo(LoadTaskFactory.UserData(data));
    }

    @Then("^I try to authenticate using my credentials$")
    public void iTryToAuthenticateMyselfUsingMyCredentials() {
        theActorInTheSpotlight().attemptsTo(OpenTask.FaceBookPage());
        theActorInTheSpotlight().attemptsTo(FillFormTaskFactory.logIn());
    }
}

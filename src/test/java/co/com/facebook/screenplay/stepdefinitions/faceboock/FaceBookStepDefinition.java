package co.com.facebook.screenplay.stepdefinitions.faceboock;

import co.com.facebook.screenplay.model.entities.CurrentPublicationEntity;
import co.com.facebook.screenplay.model.entities.CurrentUserEntity;
import co.com.facebook.screenplay.questions.profile.IsPublicatedQuestion;
import co.com.facebook.screenplay.tasks.OpenTask;
import co.com.facebook.screenplay.tasks.factory.FillFormTaskFactory;
import co.com.facebook.screenplay.tasks.factory.HomePageFactory;
import co.com.facebook.screenplay.tasks.factory.LoadTaskFactory;
import co.com.facebook.screenplay.tasks.factory.ProfilePageTaskFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class FaceBookStepDefinition {

    @Before
    public void initialConfiguration() {
        setTheStage(new OnlineCast());
    }


    @Given("^(.*) joined Facebook with my peronsal information$")
    public void uploadTheTransactionData(String actor , List<String> data) {
        theActorCalled(actor).wasAbleTo(LoadTaskFactory.userData(data));
        theActorInTheSpotlight().attemptsTo(OpenTask.faceBookPage());
        theActorInTheSpotlight().attemptsTo(FillFormTaskFactory.logIn());

    }

    @When("^I make a publication in a friend wall$")
    public void iMakeAPublicationInAFriendWall(List<String> data){
        CurrentUserEntity.getUser().getFriendList().add(data.get(0));
        CurrentPublicationEntity.getPublication().setMessage(data.get(1));
        theActorInTheSpotlight().attemptsTo(HomePageFactory.myProfileInHeaderBar());
        theActorInTheSpotlight().attemptsTo(ProfilePageTaskFactory.selectExistingFriend());
        theActorInTheSpotlight().attemptsTo(ProfilePageTaskFactory.makePublication());


    }

    @Then("^i will see the publication$")
    public void iWillSeeThePublication() {
        theActorInTheSpotlight().should(seeThat(IsPublicatedQuestion.see() ,equalTo(CurrentPublicationEntity.getPublication().getMessage())));
    }
}

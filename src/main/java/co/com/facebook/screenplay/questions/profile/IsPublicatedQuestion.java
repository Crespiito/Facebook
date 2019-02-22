package co.com.facebook.screenplay.questions.profile;

import co.com.facebook.screenplay.model.entities.CurrentPublicationEntity;
import co.com.facebook.screenplay.userinterface.facebook.ProfilePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class IsPublicatedQuestion implements Question<String>  {

    public static IsPublicatedQuestion see() {
        return new IsPublicatedQuestion();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ProfilePage.PUBLISHED_BOX.of(CurrentPublicationEntity.getPublication().getMessage())).viewedBy(actor).asString();
    }
}

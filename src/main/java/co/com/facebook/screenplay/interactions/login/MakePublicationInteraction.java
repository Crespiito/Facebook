package co.com.facebook.screenplay.interactions.login;

import co.com.facebook.screenplay.model.entities.CurrentPublicationEntity;
import co.com.facebook.screenplay.userinterface.facebook.ProfilePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class MakePublicationInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        ProfilePage.PULISH_BOX.resolveFor(actor).click();
        ProfilePage.PULISH_BOX.resolveFor(actor).type(CurrentPublicationEntity.getPublication().getMessage());
        ProfilePage.PULISH_BUTTON.resolveFor(actor).click();

    }
}

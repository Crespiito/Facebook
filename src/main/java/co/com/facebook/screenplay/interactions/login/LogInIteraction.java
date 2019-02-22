package co.com.facebook.screenplay.interactions.login;

import co.com.facebook.screenplay.model.entities.CurrentUserEntity;
import co.com.facebook.screenplay.userinterface.facebook.LogInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;


public class LogInIteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        LogInPage.INPUT_EMAIL.resolveFor(actor).type(CurrentUserEntity.getUser().getCorreo());
        LogInPage.INPUT_PASSWORD.resolveFor(actor).type(CurrentUserEntity.getUser().getContra());
        LogInPage.BTN_PASSWORD.resolveFor(actor).click();

    }
}

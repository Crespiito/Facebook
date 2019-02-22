package co.com.facebook.screenplay.interactions.LogIn;

import co.com.facebook.screenplay.model.entities.CurrentUserEntity;
import co.com.facebook.screenplay.userinterface.facebook.FaceBookPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static co.com.facebook.screenplay.util.constants.LogInPage.*;

public class LogInIteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        FaceBookPage.OBJECT_BY_ID.of(LOGIN_USUARIO.getName(),LOGIN_USUARIO.getId()).resolveFor(actor).type(CurrentUserEntity.getUser().getCorreo());
        FaceBookPage.OBJECT_BY_ID.of(LOGIN_CONTRA.getName(),LOGIN_CONTRA.getId()).resolveFor(actor).type(CurrentUserEntity.getUser().getContra());
        FaceBookPage.OBJECT_BY_ID.of(LOGIN_BTN_INICIAR_SESION.getName(),LOGIN_BTN_INICIAR_SESION.getId()).resolveFor(actor).click();

    }
}

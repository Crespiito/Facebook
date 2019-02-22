package co.com.facebook.screenplay.interactions.profile;

import co.com.facebook.screenplay.userinterface.facebook.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class HeaderInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        HomePage.INPUT_EMAIL.resolveFor(actor).click();
    }
}

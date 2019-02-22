package co.com.facebook.screenplay.tasks.homepage;

import co.com.facebook.screenplay.interactions.factory.ProfileItetactionFactory;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;


import static co.com.facebook.screenplay.util.constants.Constants.HEADER_CASE;

public class GoToProfile implements Task {

    private String access;

    public GoToProfile(String access) {
        this.access = access;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (access){
            case HEADER_CASE:
                actor.attemptsTo(ProfileItetactionFactory.profileByHeader());
                break;
            default:
                break;
        }

    }
}

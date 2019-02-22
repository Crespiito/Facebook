package co.com.facebook.screenplay.tasks.login;

import co.com.facebook.screenplay.interactions.factory.LogInInteractionFactory;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class LogInFormTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(LogInInteractionFactory.logIn());
    }
}

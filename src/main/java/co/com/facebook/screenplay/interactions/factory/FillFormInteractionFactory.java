package co.com.facebook.screenplay.interactions.factory;

import co.com.facebook.screenplay.interactions.LogIn.LogInIteraction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillFormInteractionFactory {

    public static LogInIteraction LogIn(){
        return instrumented(LogInIteraction.class);
    }
}

package co.com.facebook.screenplay.interactions.factory;


import co.com.facebook.screenplay.interactions.login.LogInIteraction;
import co.com.facebook.screenplay.util.constants.Constants;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogInInteractionFactory {

    private LogInInteractionFactory() {
        throw new IllegalStateException(Constants.FACTORY_CLASS);
    }


    public static LogInIteraction logIn(){
        return instrumented(LogInIteraction.class);
    }
    
}

package co.com.facebook.screenplay.tasks.factory;

import co.com.facebook.screenplay.tasks.login.LogInFormTask;
import co.com.facebook.screenplay.util.constants.Constants;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillFormTaskFactory {

    private FillFormTaskFactory() {
        throw new IllegalStateException(Constants.FACTORY_CLASS);
    }


    public static LogInFormTask logIn() {
        return instrumented(LogInFormTask.class);
    }
}

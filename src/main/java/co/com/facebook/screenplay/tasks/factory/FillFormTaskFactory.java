package co.com.facebook.screenplay.tasks.factory;

import co.com.facebook.screenplay.tasks.login.LogInFormTask;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillFormTaskFactory {

    public static LogInFormTask logIn() {
        return instrumented(LogInFormTask.class);
    }
}

package co.com.facebook.screenplay.tasks;

import co.com.facebook.screenplay.userinterface.facebook.FaceBookPage;
import co.com.facebook.screenplay.util.constants.LogInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.core.pages.PageObject.withParameters;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTask implements Task {

    FaceBookPage faceBookPage = new FaceBookPage();

    public static OpenTask FaceBookPage() {
        return instrumented(OpenTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        faceBookPage.open("facebook",withParameters(""));
    }
}
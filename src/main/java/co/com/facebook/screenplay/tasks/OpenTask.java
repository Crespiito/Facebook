package co.com.facebook.screenplay.tasks;

import co.com.facebook.screenplay.userinterface.facebook.FaceBookPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.core.pages.PageObject.withParameters;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTask implements Task {

    private FaceBookPage faceBookPage = new FaceBookPage();

    public static OpenTask faceBookPage() {
        return instrumented(OpenTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        faceBookPage.open("facebook",withParameters(""));
    }
}

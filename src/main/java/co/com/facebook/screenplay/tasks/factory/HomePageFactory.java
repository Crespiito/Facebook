package co.com.facebook.screenplay.tasks.factory;

import co.com.facebook.screenplay.tasks.homepage.GoToProfile;
import co.com.facebook.screenplay.util.constants.Constants;

import static co.com.facebook.screenplay.util.constants.Constants.HEADER_CASE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomePageFactory {

    private HomePageFactory() {
        throw new IllegalStateException(Constants.FACTORY_CLASS);
    }



    public static GoToProfile myProfileInHeaderBar() {
        return instrumented(GoToProfile.class,HEADER_CASE);
    }

}

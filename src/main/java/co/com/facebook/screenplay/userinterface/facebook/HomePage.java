package co.com.facebook.screenplay.userinterface.facebook;

import co.com.facebook.screenplay.util.constants.Constants;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    private HomePage() {
        throw new IllegalStateException(Constants.UI_CLASS);
    }


    public static final Target INPUT_EMAIL = Target.the("User input").locatedBy("//*[@id='u_0_a']/div[1]/div[1]");

}

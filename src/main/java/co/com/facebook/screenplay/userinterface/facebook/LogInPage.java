package co.com.facebook.screenplay.userinterface.facebook;

import co.com.facebook.screenplay.util.constants.Constants;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogInPage {

    private LogInPage() {
        throw new IllegalStateException(Constants.UI_CLASS);
    }


    public static final Target INPUT_EMAIL = Target.the("User input").located(By.id("email"));

    public static final Target INPUT_PASSWORD = Target.the("Password input").located(By.id("pass"));

    public static final Target BTN_PASSWORD = Target.the("Submit button").located(By.id("u_0_2"));


}

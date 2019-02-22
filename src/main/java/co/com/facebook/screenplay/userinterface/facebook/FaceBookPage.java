package co.com.facebook.screenplay.userinterface.facebook;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import org.openqa.selenium.By;


@NamedUrls(
        {
                @NamedUrl(name = "facebook", url = "https://es-la.facebook.com/")
        }
)

public class FaceBookPage extends PageObject {

    public static final Target OBJECT_BY_ID = Target.the("The object named '{0}'").locatedBy("//*[@id= '{1}' ]");
}

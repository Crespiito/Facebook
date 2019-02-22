package co.com.facebook.screenplay.userinterface.facebook;

import co.com.facebook.screenplay.util.constants.Constants;
import net.serenitybdd.screenplay.targets.Target;

public class ProfilePage {

    private ProfilePage() {
        throw new IllegalStateException(Constants.UI_CLASS);
    }


    public static final Target ACTOR_SPAN = Target.the("Span Fiends").locatedBy("//*[@id='fbTimelineHeadline']//li//a[contains(text(), 'Amigos')]");

    public static final Target FRIEND_FILTER_INPUT = Target.the("firend filter input").locatedBy("//*[@id='pagelet_timeline_medley_friends']//span//input");

    public static final Target FRIEND_BOX = Target.the("friend  box").locatedBy("//div[@class='fbProfileBrowserListContainer']//ul//li//a[contains(text(), '{0}')]");

    public static final Target PULISH_BOX = Target.the("Publish  box").locatedBy("//*[@id='pagelet_timeline_composer']//*[@role = 'textbox']");

    public static final Target PULISH_BUTTON = Target.the("Publish Button").locatedBy("//*[@id='pagelet_timeline_composer']//button//*[contains(text(), 'Publicar')]");

    public static final Target PUBLISHED_BOX = Target.the("Published Button").locatedBy("//*[@id='pagelet_main_column_personal']//*[contains(text(), '{0}')]");

}

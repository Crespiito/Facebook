package co.com.facebook.screenplay.interactions.factory;

import co.com.facebook.screenplay.interactions.login.MakePublicationInteraction;
import co.com.facebook.screenplay.interactions.profile.HeaderInteraction;
import co.com.facebook.screenplay.interactions.profile.SelectFriendInteraction;
import co.com.facebook.screenplay.util.constants.Constants;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProfileItetactionFactory {


    private ProfileItetactionFactory() {
        throw new IllegalStateException(Constants.FACTORY_CLASS);
    }


    public static HeaderInteraction profileByHeader(){
        return instrumented(HeaderInteraction.class);
    }

    public static SelectFriendInteraction selectFriend(){
        return instrumented(SelectFriendInteraction.class);
    }

    public static MakePublicationInteraction makePublication() {
        return instrumented(MakePublicationInteraction.class);
    }
}
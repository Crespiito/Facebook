package co.com.facebook.screenplay.tasks.factory;

import co.com.facebook.screenplay.interactions.login.MakePublicationInteraction;
import co.com.facebook.screenplay.tasks.profilepage.ExistingFriendTask;
import co.com.facebook.screenplay.util.constants.Constants;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProfilePageTaskFactory {

    private ProfilePageTaskFactory() {
        throw new IllegalStateException(Constants.FACTORY_CLASS);
    }


    public static ExistingFriendTask selectExistingFriend() {
        return instrumented(ExistingFriendTask.class);
    }

    public static MakePublicationInteraction makePublication() {
        return instrumented(MakePublicationInteraction.class);
    }
}

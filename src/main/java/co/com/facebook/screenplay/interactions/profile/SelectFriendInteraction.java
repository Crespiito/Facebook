package co.com.facebook.screenplay.interactions.profile;

import co.com.facebook.screenplay.model.entities.CurrentUserEntity;
import co.com.facebook.screenplay.userinterface.facebook.ProfilePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class SelectFriendInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        ProfilePage.ACTOR_SPAN.resolveFor(actor).click();
        ProfilePage.FRIEND_FILTER_INPUT.resolveFor(actor).type(CurrentUserEntity.getUser().getFriendList().get(0));
        ProfilePage.FRIEND_BOX.of(CurrentUserEntity.getUser().getFriendList().get(0)).resolveFor(actor).click();
    }
}

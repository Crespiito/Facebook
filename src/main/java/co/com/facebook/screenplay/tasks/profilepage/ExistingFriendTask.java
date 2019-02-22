package co.com.facebook.screenplay.tasks.profilepage;

import co.com.facebook.screenplay.interactions.factory.ProfileItetactionFactory;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ExistingFriendTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ProfileItetactionFactory.selectFriend());
    }
}

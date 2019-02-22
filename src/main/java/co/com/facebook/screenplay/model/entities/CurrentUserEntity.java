package co.com.facebook.screenplay.model.entities;

import co.com.facebook.screenplay.model.user.User;
import co.com.facebook.screenplay.util.constants.Constants;

public class CurrentUserEntity {

    private static User user = new User();

    private CurrentUserEntity() {
        throw new IllegalStateException(Constants.ENTITY_CLASS);
    }

    public static User getUser() { return user; }

}

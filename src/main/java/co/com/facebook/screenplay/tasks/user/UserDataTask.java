package co.com.facebook.screenplay.tasks.user;

import co.com.facebook.screenplay.model.entities.CurrentUserEntity;
import co.com.facebook.screenplay.model.user.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

public class UserDataTask implements Task {

    private List<String> data;

    public UserDataTask(List data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        CurrentUserEntity.getUser().setNombre(data.get(0));
        CurrentUserEntity.getUser().setCorreo(data.get(1));
        CurrentUserEntity.getUser().setContra(data.get(2));
    }
}

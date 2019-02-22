package co.com.facebook.screenplay.tasks.factory;

import co.com.facebook.screenplay.tasks.user.UserDataTask;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoadTaskFactory {

    public static UserDataTask UserData(List<String> data) {
        return instrumented(UserDataTask.class , data);
    }
}

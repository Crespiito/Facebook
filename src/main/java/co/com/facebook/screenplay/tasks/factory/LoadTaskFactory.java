package co.com.facebook.screenplay.tasks.factory;

import co.com.facebook.screenplay.tasks.user.UserDataTask;
import co.com.facebook.screenplay.util.constants.Constants;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoadTaskFactory {

    private LoadTaskFactory() {
        throw new IllegalStateException(Constants.FACTORY_CLASS);
    }


    public static UserDataTask userData(List<String> data) {
        return instrumented(UserDataTask.class , data);
    }
}

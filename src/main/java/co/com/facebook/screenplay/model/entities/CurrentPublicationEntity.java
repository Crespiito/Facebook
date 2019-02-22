package co.com.facebook.screenplay.model.entities;

import co.com.facebook.screenplay.model.publication.Publication;
import co.com.facebook.screenplay.util.constants.Constants;

public class CurrentPublicationEntity {

    private static Publication publication = new Publication();

    private CurrentPublicationEntity() { throw new IllegalStateException(Constants.ENTITY_CLASS);}

    public static Publication getPublication() {
        return publication;
    }


}

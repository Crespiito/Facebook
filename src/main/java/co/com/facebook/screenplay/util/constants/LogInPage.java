package co.com.facebook.screenplay.util.constants;

public enum LogInPage {

    /**
     * ****************
     * Formulario de Log In para FaceBook
     * * ****************
     */

    LOGIN_USUARIO("Usuario","email"),
    LOGIN_CONTRA("Contraseña", "pass"),
    LOGIN_BTN_INICIAR_SESION("Iniciar Sesion", "u_0_2");

    private String name;
    private String id;

    LogInPage(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public String getId() {return  id;}
}

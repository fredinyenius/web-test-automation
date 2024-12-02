package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IniciarSesion implements Task {

    private final String username;
    private final String password;

    public IniciarSesion(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginPage.BTN_LOGIN_UP),
                Enter.theValue(username).into(LoginPage.LOG_USERNAME),
                Enter.theValue(password).into(LoginPage.LOG_PASSWORD),
                Click.on(LoginPage.BTN_LOGIN_BAJO)
        );
    }

    public static Performable withData(String username, String password) {
        return new IniciarSesion(username, password);
    }
}

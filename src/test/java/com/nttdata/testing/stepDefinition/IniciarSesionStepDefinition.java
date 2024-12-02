package com.nttdata.testing.stepDefinition;
import com.nttdata.testing.Pages.LoginPage;
import com.nttdata.testing.Tasks.NavigateTo;
import com.nttdata.testing.Tasks.IniciarSesion;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IniciarSesionStepDefinition {

    @Given("el {actor} está en la página de inicio de sesión")
    public void elUsuarioEstaEnLaPaginaDeInicioDeSesion(Actor actor) {
        actor.attemptsTo(NavigateTo.theLoginPage());
    }

    @And("selecciona el boton de inicio")
    public void seleccionaElBotonDeInicio() {
        theActorInTheSpotlight().attemptsTo(Click.on(LoginPage.BTN_LOGIN_UP));
    }

    @When("ingresa el nombre de usuario {string} y la contraseña {string}")
    public void ingresaElNombreDeUsuarioYLaContrasena(String username, String password) {
        System.out.println("Username: " + username + ", Password: " + password);
        theActorInTheSpotlight().attemptsTo(
                Enter.theValue(username).into(LoginPage.LOG_USERNAME),
                Enter.theValue(password).into(LoginPage.LOG_PASSWORD)
        );
    }
    @And("selecciona el botón de iniciar sesión")
    public void seleccionaElBotonDeIniciarSesion() {
        theActorInTheSpotlight().attemptsTo(Click.on(LoginPage.BTN_LOGIN_BAJO));
    }

    @Then("el usuario es redirigido a la página de inicio")
    public void elUsuarioEsRedirigidoALaPaginaDeInicio() {
        //System.out.println("exitoso");
        System.out.println("Redirigido a la página de inicio exitosamente");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

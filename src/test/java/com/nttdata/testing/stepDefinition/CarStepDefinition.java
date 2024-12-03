package com.nttdata.testing.stepDefinition;

import com.nttdata.testing.Pages.CarPage;
import com.nttdata.testing.Tasks.NavigateTo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CarStepDefinition {
    @Given("el {actor} esta en la pagina de inicioo")
    public void elUsuarioEstaEnLaPaginaDeInicioo(Actor actor) {
        {
            actor.attemptsTo(NavigateTo.theHomePage());
        }
    }
    @And("selecciona el boton del producto")
    public void seleccionaElBotonDelProducto() {
        theActorInTheSpotlight().attemptsTo(Click.on(CarPage.BTN_PRODUCT_PHONE));
    }

    @When("selecciona el boton agregar carrito")
    public void seleccionaElBotonAgregarCarrito() {
        theActorInTheSpotlight().attemptsTo(Click.on(CarPage.BTN_ADD_CART));
    }

    @Then("se realiza el añadido de manera exitosa")
    public void seRealizaElAnadidoDeManeraExitosa() {
        System.out.println("exitoso");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

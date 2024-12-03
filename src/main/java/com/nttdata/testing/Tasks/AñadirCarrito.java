package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.CarPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

    public class AñadirCarrito implements Task {

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(CarPage.BTN_PRODUCT_PHONE),

                    Click.on(CarPage.BTN_ADD_CART)
            );
        }

        public static Performable withData(String username, String password) {
            return new com.nttdata.testing.Tasks.IniciarSesion(username, password);
        }
    }


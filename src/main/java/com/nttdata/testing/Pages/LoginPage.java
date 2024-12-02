package com.nttdata.testing.Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.demoblaze.com/")
public class LoginPage extends PageObject {
    public static final Target BTN_LOGIN_UP = Target.the("Boton para iniciar sesion")
            .located(By.cssSelector("#login2"));
    public static final Target LOG_USERNAME = Target.the("Nombre de usuario")
            .located(By.id("loginusername"));
    public static final Target LOG_PASSWORD = Target.the("Contraseña")
            .located(By.id("loginpassword"));
    public static final Target BTN_LOGIN_BAJO = Target.the("Boton para iniciar sesion")
            .located(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
}
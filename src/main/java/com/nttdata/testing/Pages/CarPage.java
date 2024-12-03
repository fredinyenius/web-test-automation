

package com.nttdata.testing.Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.demoblaze.com/")
public class CarPage extends PageObject {
    //  SIGN UP
    public static final Target BTN_PRODUCT_PHONE = Target.the("Boton para hacer el registro")
        .located(By.cssSelector("#tbodyid > div:nth-child(1) > div > a > img"));

    public static final Target BTN_ADD_CART = Target.the("Boton Registrar")
        .located(By.cssSelector("#tbodyid > div.row > div > a"));

}

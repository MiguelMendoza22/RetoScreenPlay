package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaIncioSesion extends PageObject {
    public static final Target BOTON_INICIAR_SESION = Target.the("Botón iniciar sesión")
            .located(By.xpath("(//*[@class='account'])[1]"));


}

package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionCompra extends PageObject {
    public static Target MENSAJE_COMPRA = Target.the("Detalles de tu compra")
            .located(By.xpath("//strong[normalize-space()='Detalles de tu compra']"));
}

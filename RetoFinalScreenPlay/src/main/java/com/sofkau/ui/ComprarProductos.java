package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ComprarProductos extends PageObject {

    public static final Target CATEGORIA_CARNES = Target.the("Categoria carne")
            .located(By.className("selected"));
    public static final Target AGREGAR_CARRITO_CARNE1 = Target.the("Botón agregar carrito producto 1")
            .located(By.xpath("(//button[@type='submit'])[3]"));
    public static final Target AGREGAR_CARRITO_CARNE2 = Target.the("Botón agregar carrito producto 2")
            .located(By.xpath("(//button[@type='submit'])[4]"));
    public static final Target AGREGAR_CARRITO_CARNE3 = Target.the("Botón agregar carrito producto 3")
            .located(By.xpath("(//button[@type='submit'])[5]"));

}

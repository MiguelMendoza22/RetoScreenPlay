package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ComprarProductos extends PageObject {


    public static final Target CATEGORIA_CARNES = Target.the("Categoria carne")
            .located(By.xpath("(//span[@class='grower CLOSE'])[8]"));
    public static final Target SUBCATEGORIA_CARNES_NACIONALES = Target.the("Subcategoria carnes nacionales")
            .located(By.xpath("//li[@class='last']//a[contains(text(),'NACIONALES')]"));
    public static final Target ORDENAR_POR = Target.the("Dropdown list ordenar por")
            .located(By.xpath("//i[@class='material-icons float-xs-right']"));
    public static final Target PRECIO_MAS_BAJO = Target.the("ordenar por precio más bajo")
            .located(By.xpath("(//div//a[contains(@class,'select-list js-search-link')])[3]"));
    public static final Target AGREGAR_CARRITO_CARNE_UNO = Target.the("Botón agregar carrito producto 1")
            .located(By.xpath("(//*[@class='btn add-to-cart'])[2]"));
    public static final Target AGREGAR_CARRITO_CARNE_DOS = Target.the("Botón agregar carrito producto 2")
            .located(By.xpath("(//*[@class='btn add-to-cart'])[3]"));
    public static final Target AGREGAR_CARRITO_CARNE_TRES = Target.the("Botón agregar carrito producto 3")
            .located(By.xpath("(//*[@class='btn add-to-cart'])[4]"));
    public static final Target BOTON_CARRITO = Target.the("Botón carrito de compras")
            .located(By.className("cart_link"));
    public  static final Target BOTON_FINALIZAR_COMPRA = Target.the("Botón finalizar compra")
            .located(By.xpath("//a[normalize-space()='Finalizar Compra']"));
}

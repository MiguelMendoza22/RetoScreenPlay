package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.ComprarProductos.*;



public class AgregarProductosCarrito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CATEGORIA_CARNES),
                Click.on(SUBCATEGORIA_CARNES_NACIONALES),
                Click.on(ORDENAR_POR),
                Click.on(PRECIO_MAS_BAJO),
                WaitUntil.the(AGREGAR_CARRITO_CARNE_UNO,isClickable()),
                Click.on(AGREGAR_CARRITO_CARNE_UNO),
                WaitUntil.the(AGREGAR_CARRITO_CARNE_DOS,isClickable()),
                Click.on(AGREGAR_CARRITO_CARNE_DOS),
                WaitUntil.the(AGREGAR_CARRITO_CARNE_TRES,isClickable()),
                Click.on(AGREGAR_CARRITO_CARNE_TRES),
                Click.on(BOTON_CARRITO),
                Click.on(BOTON_FINALIZAR_COMPRA)
        );



    }


    public static AgregarProductosCarrito agregarProductosCarrito(){return new AgregarProductosCarrito();}
}

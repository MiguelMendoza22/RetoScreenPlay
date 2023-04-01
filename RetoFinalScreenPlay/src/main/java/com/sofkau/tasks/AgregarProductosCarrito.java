package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.ComprarProductos.*;



public class AgregarProductosCarrito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CATEGORIA_CARNES),
                Click.on(CATEGORIA_CARNES),
                Click.on(SUBCATEGORIA_CARNES_NACIONALES),
                Click.on(ORDENAR_POR),
                Click.on(PRECIO_MAS_BAJO)

        );
        actor.attemptsTo(
                WaitUntil.the(AGREGAR_CARRITO_CARNE_UNO,isPresent()),
                WaitUntil.the(AGREGAR_CARRITO_CARNE_UNO,isCurrentlyVisible()),
                WaitUntil.the(AGREGAR_CARRITO_CARNE_UNO,isCurrentlyEnabled()),
                WaitUntil.the(AGREGAR_CARRITO_CARNE_UNO,isClickable()),
                Click.on(AGREGAR_CARRITO_CARNE_UNO),

                WaitUntil.the(AGREGAR_CARRITO_CARNE_DOS,isPresent()),
                WaitUntil.the(AGREGAR_CARRITO_CARNE_DOS,isCurrentlyVisible()),
                WaitUntil.the(AGREGAR_CARRITO_CARNE_DOS,isCurrentlyEnabled()),
                Scroll.to(REFERENCIA_SCROLL),
                WaitUntil.the(AGREGAR_CARRITO_CARNE_DOS,isClickable()),
                Click.on(AGREGAR_CARRITO_CARNE_DOS),

                Click.on(BOTON_CARRITO),
                Click.on(BOTON_FINALIZAR_COMPRA)
        );

    }


    public static AgregarProductosCarrito agregarProductosCarrito(){return new AgregarProductosCarrito();}
}

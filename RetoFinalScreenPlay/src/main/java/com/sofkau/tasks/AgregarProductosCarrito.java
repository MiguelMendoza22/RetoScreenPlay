package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.tasks.RefrescarPagina.refrescarPagina;
import static com.sofkau.ui.ComprarProductos.*;


public class AgregarProductosCarrito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CATEGORIA_CARNES),
                Click.on(SUBCATEGORIA_CARNES_NACIONALES),
                Click.on(ORDENAR_POR),
                Click.on(PRECIO_MAS_BAJO),
                refrescarPagina(),
                Click.on(AGREGAR_CARRITO_CARNE1),
                Click.on(AGREGAR_CARRITO_CARNE2),
                Click.on(AGREGAR_CARRITO_CARNE3),
                Click.on(BOTON_CARRITO),
                Click.on(BOTON_FINALIZAR_COMPRA)
        );

    }

    public static AgregarProductosCarrito agregarProductosCarrito(){return new AgregarProductosCarrito();}
}

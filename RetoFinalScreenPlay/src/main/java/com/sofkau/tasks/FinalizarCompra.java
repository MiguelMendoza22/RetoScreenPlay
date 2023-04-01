package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.ComprarProductos.AGREGAR_CARRITO_CARNE_UNO;
import static com.sofkau.ui.InformacionEnvioYFacturacion.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class FinalizarCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_SCROLL,isPresent()),
                WaitUntil.the(BOTON_SCROLL,isCurrentlyVisible()),
                WaitUntil.the(BOTON_SCROLL,isCurrentlyEnabled()),
                Scroll.to(BOTON_SCROLL),
                Click.on(BOTON_CONFIRMAR_DIRECCION),
                Click.on(BOTON_CONFIRMAR_OPCION_ENVIO),
                Click.on(OPCION_DE_PAGO),
                Click.on(TERMINOS_CONDICIONES),
                Click.on(BOTON_PAGAR_AHORA)
        );
    }

    public static FinalizarCompra finalizarCompra() {
        return new FinalizarCompra();
    }
}

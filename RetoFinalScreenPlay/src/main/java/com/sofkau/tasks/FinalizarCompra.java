package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.InformacionEnvioYFacturacion.*;

public class FinalizarCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_CONFIRMAR_DIRECCION),
                Click.on(BOTON_CONFIRMAR_OPCION_ENVIO),
                Click.on(OPCION_DE_PAGO),
                Click.on(TERMINOS_CONDICIONES)
        );
    }

    public static FinalizarCompra finalizarCompra () {
        return new FinalizarCompra();
    }
}

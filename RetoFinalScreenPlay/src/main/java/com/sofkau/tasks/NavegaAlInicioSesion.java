package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaginaIncioSesion.BOTON_INICIAR_SESION;
import static com.sofkau.ui.PaginaIncioSesion.MENSAJE_COOKIES;

public class NavegaAlInicioSesion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENSAJE_COOKIES),
                Click.on(BOTON_INICIAR_SESION)
        );
    }
    public static NavegaAlInicioSesion navegaAlInicioSesion(){
        return new NavegaAlInicioSesion();
    }
}

package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.sofkau.ui.PaginaIncioSesion.*;

public class IniciarSesion implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        Properties proper = null;

        try {
            proper = propertiesArchivo();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                Enter.theValue(proper.getProperty("serenity.email")).into(CAMPO_EMAIL),
                Enter.theValue(proper.getProperty("serenity.contrasenna")).into(CAMPO_CONTRASENNA),
                Click.on(BOTON_INGRESAR)
        );
    }
    public static IniciarSesion iniciarSesion() {return new IniciarSesion();}
    public Properties propertiesArchivo () throws IOException {
        Properties properties = new Properties();
        FileInputStream archive = new FileInputStream("src\\test\\resources\\serenity.properties");
        properties.load(archive);
        return properties;
    }


}

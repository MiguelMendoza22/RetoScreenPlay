package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.NavegaAlInicioSesion.navegaAlInicioSesion;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraStepDefinitions extends Configuracion {
    public static Logger LOGGER = Logger.getLogger(CompraStepDefinitions.class);


    @Given("que el usuario esta logueado en la pagina principal")
    public void queElUsuarioEstaLogueadoEnLaPaginaPrincipal() {
        try {
            configurarNavegador();

            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()

            );

            theActorInTheSpotlight().attemptsTo(
                    navegaAlInicioSesion(),
                    iniciarSesion()
                            .conElEmail("juanmanuelgofu@gmail.com")
                            .conLaContrasenna("Juan1997")
            );
        }catch (Exception exception){
            quitarDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }

    @When("el usuario finaliza una compra agregando productos en el carrito")
    public void elUsuarioFinalizaUnaCompraAgregandoProductosEnElCarrito() {

    }

    @When("completa la informacion de envio y facturacion")
    public void completaLaInformacionDeEnvioYFacturacion() {

    }

    @Then("debera ser redireccionado a la pagina de pago")
    public void deberaSerRedireccionadoALaPaginaDePago() {

    }


}

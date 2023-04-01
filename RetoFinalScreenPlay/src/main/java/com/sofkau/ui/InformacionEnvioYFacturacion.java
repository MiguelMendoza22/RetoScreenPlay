package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class InformacionEnvioYFacturacion extends PageObject {
    public static final Target BOTON_SCROLL = Target.the("Botón referencia scroll")
            .located(By.xpath("//body//main//section//div//section//div//div//p//a[@href='https://www.superlosmontes.com/site/']"));
    public static final Target BOTON_CONFIRMAR_DIRECCION = Target.the("Botón corfirmar dirección")
            .located(By.name("confirm-addresses"));
    public static final Target BOTON_CONFIRMAR_OPCION_ENVIO = Target.the("Botón corfirmar opción de envio")
            .located(By.name("confirmDeliveryOption"));
    public static final Target OPCION_DE_PAGO = Target.the("Opción de pago")
            .located(By.id("payment-option-3"));
    public static final Target TERMINOS_CONDICIONES = Target.the("Checkbox terminos y condiciones")
            .located(By.id("conditions_to_approve[terms-and-conditions]"));
    public static final Target BOTON_PAGAR_AHORA = Target.the("Botón pagar ahora")
            .located(By.xpath("(//button[normalize-space()='Pagar Ahora'])[1]"));

}

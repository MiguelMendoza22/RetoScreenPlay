#Author: Jesús Miguel Molina Mendoza

Feature: Comprar productos
  yo como cliente de la web del supermercado los montes
  quiero comprar productos a través de la página web
  para ahorrar tiempo de ir al supermercado físico

  @Compra
  Scenario: Compra exitosa
    Given que el usuario esta logueado en la pagina principal
    When el usuario finaliza una compra agregando productos en el carrito
    And completa la informacion de envio y facturacion
    Then debera ser redireccionado a la pagina de pago
@tag
Feature: Añadir aL carrito de compras

@AddCart
Scenario:Añadir al carrito de compras exitosamente

  Given el usuario esta en la pagina de inicioo
  And selecciona el boton del producto
  When selecciona el boton agregar carrito
  Then se realiza el añadido de manera exitosa
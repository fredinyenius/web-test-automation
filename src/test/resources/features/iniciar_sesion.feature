

  Feature: Iniciar sesión

  @IniciarSesion @HappyPath
  Scenario Outline: Iniciar sesión de manera exitosa con credenciales válidas
    Given el usuario está en la página de inicio de sesión
    And selecciona el boton de inicio
    When ingresa el nombre de usuario "<username>" y la contraseña "<password>"
    And selecciona el botón de iniciar sesión
    Then el usuario es redirigido a la página de inicio

    Examples:
      | username    | password |
      | usuarioqwerq | pass123  |


    @IniciarSesion2 @HappyPath
    Scenario Outline: Iniciar sesión de un usuario
      Given el usuario está en la página de inicio de sesión
      When inicia sesión con el nombre de usuario "<username>" y contraseña "<password>"
      Then se muestra la página de inicio

      Examples:
        | username    | password |
        | usuarioqwerq | pass123  |
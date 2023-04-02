  #language:en
Feature: Iniciar Saucedemo

  Background: Cliente visita página principal
    Given El cliente visita pagina principal

  Scenario Outline: Cliente inicia sesion
    And el cliente ingresa un usuario as "<username>"
    And el cliente ingresa clave as "<password>"
    And el cliente hace click en boton 'Login'
    Then el cliente inicia sesion y visualiza la pagina de inventario
    Examples:
      |username       |password     |
      |standard_user  |secret_sauce |

  Feature: Buscar productos
    Background:
      Given Estoy en la pagina de productos

    Scenario Outline: Cliente busca producto
      And el cliente ingresa producto as "<product>"
      And cliente presiona boton 'buscar'
      Then Se muestra producto

      Examples:
        | product |  |
        | Sauce   |  |
        | Bolt    |  |
        | Test    |  |

  Feature: Seleccionar productos
  Background:
  Given Estoy en la pagina de productos

  Scenario Outline: Cliente selecciona producto
    And el cliente selecciona producto as "<product>"
    Then cliente presiona boton 'add' con producto as "<productid>"

    Examples:
      | product                 | productid             |
      | Sauce Labs Backpack     | sauce-labs-backpack   |
      | Sauce Labs Bike Light   | sauce-Labs-bike-light |
      | Sauce Labs Bolt T-Shirt | bolt-t-Shirt          |

  Feature: Ordenar productos
    Background:
      Given Estoy en la pagina de productos

    Scenario: Cliente ordena productos
      And el cliente selecciona ordenar "Price (low to high)"
      Then la pagina muestra ordenados los productos
      And compara precio de productos menor a mayor
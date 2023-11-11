


  Feature: Agregar un producto al carrito en amazon
    Como usuario necesito agregar al carrito de compras cualquier producto


    Scenario: Buscar el nombre de cualquier producto en el buscador de amazon
      Given que me encuentro en la pagina principal de amazon
      When escriba el nombre de un producto
      And de enter o click en el boton de buscar
      Then puedo ver una lista de resultados
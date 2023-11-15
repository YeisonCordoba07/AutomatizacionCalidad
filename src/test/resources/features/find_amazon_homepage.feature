


  Feature: Agregar un producto al carrito en amazon
    Como usuario necesito agregar al carrito de compras cualquier producto


    Scenario: Buscar un producto y agregarlo al carrito
      Given que me encuentro en la pagina principal de amazon
      When busque un producto y lo seleccione y lo agregue al carrito
      Then puedo ver como el numero de productos en el carrito cambia
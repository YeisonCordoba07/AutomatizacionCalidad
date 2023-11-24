


  Feature: Crear un grupo de clasificacion
    Como administrador quiero crear un grupo en base a un criterio de clasificacion

    Scenario: Llenar el formulario de creacion de grupos y enviarlo
      Given que me encuentro en la pagina de Configurar criterios
      When llene los campos y envie la informacion del formulario para crear grupos
      Then puedo ver un texto de exito
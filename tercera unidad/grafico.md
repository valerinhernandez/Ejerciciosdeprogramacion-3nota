Usuario          Sistema de Biblioteca           Base de Datos        Sistema de Notificaciones         Bibliotecario
  |                       |                             |                         |                          |
  |       Buscar Libro    |                             |                         |                          |
  |---------------------->|                             |                         |                          |
  |                       |                             |                         |                          |
  |        Consultar      |                             |                         |                          |
  |  Disponibilidad Libro |                             |                         |                          |
  |---------------------->|                             |                         |                          |
  |                       |   Obtener Disponibilidad    |                         |                          |
  |                       |<--------------------------->|                         |                          |
  |                       |                             |                         |                          |
  |       Mostrar         |                             |                         |                          |
  |    Disponibilidad     |                             |                         |                          |
  |<----------------------|                             |                         |                          |
  |                       |                             |                         |                          |
  |      Seleccionar      |                             |                         |                          |
  |    Libro para Reserva |                             |                         |                          |
  |---------------------->|                             |                         |                          |
  |                       |                             |                         |                          |
  |   Verificar Disponibilidad                          |                         |                          |
  |---------------------->|                             |                         |                          |
  |                       |   Consultar Disponibilidad  |                         |                          |
  |                       |<--------------------------->|                         |                          |
  |                       |                             |                         |                          |
  |    Confirmar Reserva  |                             |                         |                          |
  |<----------------------|                             |                         |                          |
  |                       |                             |                         |                          |
  |  Registrar Reserva    |                             |                         |                          |
  |---------------------->|                             |                         |                          |
  |                       |  Actualizar Disponibilidad  |                         |                          |
  |                       |<--------------------------->|                         |                          |
  |                       |                             |                         |                          |
  | Notificar Confirmación|                             |                         |                          |
  |---------------------->|---------------------------->|                         |                          |
  |                       |                             |     Enviar Notificación |                          |
  |                       |                             |<------------------------|                          |
  |                       |                             |                         |                          |
  |        Confirmación de Reserva                      |                         |                          |
  |<----------------------------------------------------|                         |                          |
  |                       |                             |                         |                          |
  |  Actualizar Base de Datos                           |                         |                          |
  |---------------------->|                             |                         |                          |
  |                       |                             |                         |                          |
  |        Notificar Bibliotecario                      |                         |                          |
  |---------------------->|                             |                         |                          |
  |                       |                             |                         |                          |
  |                       |                             |                         |                          |
  |                       |                             |                         |  Actualizar Sistema      |
  |                       |                             |                         |  de Biblioteca           |
  |                       |                             |                         |<-------------------------|

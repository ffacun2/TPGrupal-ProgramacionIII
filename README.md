# Sistema de Gestion de Viajes

## Descripcion del sistema
El sistema debe gestionar parte de una empresa de transporte de pasajeros. La empresa cuenta con una flota de Vehiculos de diferentes caracteristicas (Auto/Moto/Combi), un conjunto de Choferes de diferentes categorias (Permanente/Temporario/Contratado) que manejan cualquier topo de Vehiculo y un conjunto de Clientes registrados con los cuales opera. Estos actores y recursos son dinamicos, o sea, pueden aumentar.

***El sistema tendra dos tipos de usuarios***
- Un administrador
- Varios Clientes

### Funcionalidades del Administrador
- Alta de choferes y vehiculos.
- Solicitud de listado de:
  - Clientes
  - Choferes
  - Vehiculos
  - Viajes
- Calculo del total dinero necesario para pagar los salarios.
- Solicitud de listado de viajes de un chofer en particular.
- Solicitud de puntaje y sueldo de un chofer en particular.
- Creacion de Viaje, asignando un chofer disponible y un vehiculo pertinente a un Pedido generado por un cliente.

### Funcionalidades del Cliente
- Registro de un nuevo Cliente. El sistema debe notificar en caso de error, ya que no se permite repetir nombre de usuario.
- Completar formulario de solicitud de viaje. El sistema evaluara la solicitud e informara al usuario sobre:
    - Aceptacion del Pedido.
    - Rechazo por falta de vehiculo pertinente.
- Pagar el Viaje y Calificar el Chofer.
- Visualizacion de historial de los propios Viajes.

### Desarrollo
El proyecto de dividio en dos partes :
- La primera se utilizo una arquitectura de tres capas (Presentacion, Negocio, Datos), todas las funcionalidades se implementarion en la capa de negocio. Se utilizo el patron :
  - <b>FACADE</b>.
  - <b>Factory:</b> Para la creacion de vehiculos.
  - <b>Decorator:</b> Para los viajes.
  - <b>Singleton:</b> Para el Administrador.
- Para la segunda parte se incorporaron las siguientes caracteristicas y adaptaciones:
  -  <b>Patron MVC, DAO-DTO, Observer/Observable</b>.
  -  Vistas de Usuario (GUI).
  -  Programacion concurrente. Utilizando Threads.
  -  Persistencia mediante Serializacion y Archivos.

### Estudiantes: Joaquin Tomas Esposito - Criado Facundo - iavicoli nicolas - Eugenia Toledo

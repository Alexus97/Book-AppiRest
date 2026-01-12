Creacion de Api Rest donde vamos a evidenciar un crud con los Metodos GET, GET(All) POST, PUT, DELETE.
utilizamos la arquitectura por capas.
Donde manejamos las siguientes:
--> Controller: Aqui consumiremos los recursos (urls o endpoints)
--> Model: Contenemos las entidades(isbn, title, athor)
--> Service: Manejamos toda la logica de negocio donde realizamos la inyeccion de dependencias por medio de constructor y no por anotacion para que en el momento de realizar las pruebas unitarias no tenga que levantar todo el servidor.
-Como buena practica utilizamos minimo 2 class donde se implementa una para la inyeccion de dependencias y la otra(MemoryBookService), como un servicio que me contiene los datos en memoria.

Mejoras Por Realizar.
-> Crear Diagrama ERD.
-> Aplicar Principios SOLID.
-> Documentar con swagger.
-> Agregar Capa de Repository.
-> Agregar DTO.

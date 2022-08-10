# legal-person-api
API to obtain the information of a legal entity

## Pasos para ejecutar el proyecto
  1. Clonar repositorio y descargar las dependecias Maven
  2. Ejecutar la clase principal, el proyecto corre en http://localhost:8080/legal-person
  
### Método GET para obtener los datos de una persona jurídica
  Para obtener la información de una persona jurídica, se deben mandar los query parameters tipo = 2 y ruc = <nro_ruc> al endpoint antes mencionado, mediante el método     GET del protocolo HTTP.
  
### Método GET para obtener los datos de las personas jurídicas almacenados en la BD
  Para obtener la información de todas las personas jurídicas se debe realizar una petición GET al endpoint http://localhost:8080/legal-person/all, como se usó una BD de   en memoria para hacer la prueba correcta de que realmente se guardan los datos de las personas jurídicas, guardar un par de regitros en la BD mediante el endpoint       correspondiente y luego ejecutar este endpoint.
    
### Método POST para guardar la información de una persona jurídica
  Para guardar la información de una persona jurídica se debe realizar una petición POST a la URL http://localhost:8080/legal-person, mencionada al incio, mandándole el   objeto JSON que se obtiene al solicitar los datos de una persona jurídica mediante el endpoint que recibe por parámetros el tipo y el nro de RUC.
  
## Visualización de la documentación del API mediante Swagger
  Para visualizar la documentación del API mediante la interfaz gráfica de Swagger-UI colocar la URL http://localhost:8080/swagger-ui.html en el navegador.

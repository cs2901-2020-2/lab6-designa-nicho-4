# lab6-designa-nicho-4
lab6-designa-nicho-4 created by GitHub Classroom

## Requerimientos
### Funcionales
- La central meteorologica obtiene los datos de humedad, temperatura y velocidad del viento mediante un censor.
- El usuario debe ser capaz de acceder a la informacion actualizada obtenida por la central meteorológica mediante una sola consulta.

### No funcionales
- Solamente se guardará el último dato obtenido por el censor, es decir, los datos anteriores serán sobrescritos.
- Debe ser posible el manejo de varias solicitudes.

## Casos de uso
- Software System: Centro meteorológico
- Use Case: UC01 Detectar elementos meteorológicos
- Actors: Cliente, Analizador
- MSS: 
   - El usuario ingresa a la aplicación.
   - La aplicación solicita al usuario el texto a traducir.
   - El usuario ingresa el texto.
   - La aplicación muestra el texto traducido.


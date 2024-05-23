# Práctica Final
## Descripción

Este proyecto consiste de un gestor de vinos. Con este se puede ver los vinos de la base de datos, los 10 mejores vinos y las bodegas de estos, además, se pueden añadir vinos.

## Tablas de la base de datos

1. Vino: 
    - id | nombre | anyos | id_uva | id_bodega | calificacion
2. Uva: 
    - id | nombre | tipo
3. Bodega:
    - id | nombre | pais | id_enologo
4. Enologo:
    - id | nombre | apellido1 | apellido2

## Ventanas

- Vinos: Muestra una tabla con todos los vinos, arriba se pueden filtrar por el tipo. Hay tres botones abajo, añadir vino, ver top 10 y bodegas.

- Añadir vino: Es un modal con el que se pueden crear vinos.

- Top 10 vinos: Consiste de una tabla con los 10 vinos con mayor calificación, ordenados de mayor a menor.

- Bodegas: Muestra una tabla con todas las bodegas, incluyendo el nombre completo de sus enólogos.
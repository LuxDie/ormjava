# ORM Java
Un pequeño ejemplo de Hibernate y Java para los alumnos de Codo a Codo.
En este proyecto podemos ver en funcionamiento una clase `Orm`, con 3 métodos:
`getPersonaList()`, `getPersonaById()` y `savePersona()`. Con ellos podremos
trabajar sobre una base de datos MySQL sin necesidad de escribir código SQL y
manteniendo una separación entre la capa de datos y su implementación específica.

## Instrucciones

El directorio raíz es un proyecto de NetBeans.

La aplicación requiere una base de datos MySQL con su configuración predeterminada y la siguiente estructura de datos (ejecutar el siguiente script en una consola, por ej: MySQL Workbench):

```sql
CREATE SCHEMA `ormjava`;
CREATE TABLE `ormjava`.`persona` (
  `idpersona` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(30) NOT NULL,
  `apellido` VARCHAR(30) NOT NULL,
  `dni` VARCHAR(8) NOT NULL,
  `edad` INT NULL,
  PRIMARY KEY (`idpersona`));
```

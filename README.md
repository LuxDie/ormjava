# ormjava
Un pequeño ejemplo de Hibernate y Java para mis alumnos

## Estructura de la base de datos

Ejecutar el siguiente script MySQL:

```sql
CREATE TABLE `hibertest`.`persona` (
  `idpersona` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(30) NOT NULL,
  `apellido` VARCHAR(30) NOT NULL,
  `dni` VARCHAR(8) NOT NULL,
  `edad` INT NULL,
  PRIMARY KEY (`idpersona`));
```

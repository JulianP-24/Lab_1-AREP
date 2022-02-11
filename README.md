## Author: Julian Adolfo Peña
## AREP - Arquitectura Empresarial

# Conversion de Temperatura

Este proyecto consiste en una aplicacion, cuyo objetivo tiene convertir la temperatura dada por el usuario de grados Celcius a grados fahrenheit y viceversa. Para ello se creara una pagina web basica, en donde el usuario podra ingresar dichos datos y obtener la respuesta que se busca. Adicionalmente se creo una API que ofrece estas dos funcionalidades, que es consumida por javascript y ademas la aplicacion esta desplegada en Heroku.

## Prerrequisitos
Tener instalado JDK 8 o superior, de igual forma tener Maven, git y Heroku.

## Calculos
### Convertir de grados celcius a grados fahrenheit
Para convertir de grados celcius a fahrenheit usamos la siguiente formula:

```
public Float convertirAfahrenheit (Float numAconvertir){
        Resultado = (numAconvertir * 9/5) + 32;
}
```
### Convertir de grdos fahrenheit a grados celcius
```
public Float convertirAcelcius (Float numAconvertir){
        Resultado = ((5*numAconvertir)-160)/9;
}
```
## Implementacion
Se tiene una clase la cual se encarga de realizar los calculos y la clase principal en donde se implementa el main y el API, se encarga de crear un objeto json para guardar la respuesta y poder mostrarla en la pagina web. Como base para el API se utiliza un framework llamado Spark el cual permite crear aplicaciones web de manera muy sencilla.

## Uso del Proyecto
Para ejecutar este proyecto se puede clonar del repositorio de Github a traves del siguiente link:
https://github.com/JulianP-24/LAB1-AREP.git

Despliegue en Heroku: https://cryptic-woodland-70198.herokuapp.com

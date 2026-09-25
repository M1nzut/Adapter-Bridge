# GymTrack

GymTrack es una aplicación sencilla desarrollada únicamente en Java para registrar ejercicios realizados en el gimnasio.

El proyecto fue realizado para aplicar los patrones de diseño **Adapter** y **Bridge** mediante un caso de estudio práctico.

## Funcionalidades

- Registrar el nombre de un ejercicio.
- Registrar peso, series y repeticiones.
- Seleccionar el tipo de entrenamiento: Hipertrofia o Fuerza.
- Mostrar la información en una vista simple o detallada.
- Importar un ejercicio proveniente de un sistema externo.
- Interfaz gráfica realizada con Java Swing.

## Patrón Adapter

El patrón Adapter se utiliza para convertir la información de un ejercicio externo al formato que utiliza GymTrack.

La clase `EjercicioExterno` representa los datos provenientes de otro sistema y `EjercicioAdapter` se encarga de adaptarlos para convertirlos en un objeto `Ejercicio` que la aplicación pueda utilizar.

## Patrón Bridge

El patrón Bridge permite separar el tipo de entrenamiento de la forma en que se visualiza.

Los entrenamientos pueden ser:

- Hipertrofia
- Fuerza

Las visualizaciones pueden ser:

- Simple
- Detallada

De esta manera se pueden combinar los tipos de entrenamiento y las visualizaciones sin crear una clase diferente para cada combinación.

## Ejecución

Para compilar el proyecto:

```bash
javac *.java
```

Para ejecutarlo:

```bash
java Main
```

## Tecnologías

- Java
- Java Swing
- Programación Orientada a Objetos
- Patrón Adapter
- Patrón Bridge

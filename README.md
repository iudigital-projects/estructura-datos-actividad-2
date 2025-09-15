# Actividad - Ejercicios de práctica 1

Teniendo en cuenta lo estudiado hasta el momento en la Unidad 1, elabora el
pseudocódigo para los siguientes casos:

- Definir dos arreglos unidimensionales que permitan almacenar 7 números
ingresados por el usuario.
- Llenar un tercer arreglo con la diferencia de los dos primeros arreglos.
- Mostrar el promedio de todos los datos.
- Mostrar todos y cada uno de los datos del tercer arreglo.

Implementar el pseudocódigo en un lenguaje de programación como Java o C++.

Antes de enviar la actividad, revisa la rúbrica y verifica que cumplas con todo
lo solicitado en la actividad.

# DESARROLLO

## Pseudocódigo

```
INICIO
  DEFINIR arreglo1 COMO LISTA DE ENTEROS = [23, 32, 12, 3, 8, 10, 12]
  DEFINIR arreglo2 COMO LISTA DE ENTEROS = [20, 54, 78, 91, 7, 25, 11]
  DEFINIR arreglo3 COMO LISTA DE ENTEROS DE TAMAÑO 7.
  DEFINIR promedioDeArreglo3 COMO DECIMAL O FLOTANTE = 0
  

  PARA i DESDE 0 hasta (longitud(arreglo1) - 1) HACER 
    ASIGNAR arreglo3[i] = arreglo1[i] - arreglo2[i]
  FIN_PARA

  PARA i DESDE 0 hasta (longitud(arreglo3) - 1) HACER
    ASIGNAR promedioDeArreglo3 = promedioDeArreglo3 + arreglo3[i]
  FIN_PARA
  
  ASIGNAR promedioDeArreglo3 = promedioDeArreglo3 / longitud(arreglo3)
  
  ESCRIBIR "El promedio de todos los datos del arreglo 3 es: " + promedioDeArreglo3
  
  ESCRIBIR "Los datos del arreglo3 en orden: "
  PARA i DESDE 0 hasta (longitud(arreglo3) - 1) HACER
    ESCRIBIR arreglo3[i]
  FIN_PARA
FIN
```

## Requisitos Previos

- **Java JDK**: Versión 8 o superior
- **Maven**: Versión 3.6 o superior

### Verificar instalaciones

```bash
java -version
mvn -version
```

## Instrucciones de Ejecución

### 1. Clonar o descargar el proyecto

```bash
git clone <url-del-repositorio>
cd producto-tda
```

### 2. Compilar el proyecto

```bash
mvn clean compile
```

### 3. Ejecutar el programa

```bash
mvn exec:java -Dexec.mainClass="com.learning.App"
```


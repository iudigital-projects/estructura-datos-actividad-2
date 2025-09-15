package com.actividad;

public class App {
  public static void main(String[] args) {
    int[] arregloUno = { 23, 32, 12, 3, 8, 10, 12 };
    int[] arregloDos = { 20, 54, 78, 91, 7, 25, 11 };
    int[] arregloTres =  new int[7];
    double promedio = 0;

    System.out.println("La diferencia de los datos de los arreglos es: ");
    for (int i = 0; i <= arregloUno.length - 1; i++) {
      arregloTres[i] = arregloUno[i] - arregloDos[i]; 
      System.out.println(arregloUno[i] + " - " + arregloDos[i] + " = " + arregloTres[i]);
    }
    System.out.println();

    for(int z = 0; z <= arregloTres.length - 1; z++) {
      promedio = promedio + arregloTres[z];
    }
    promedio = promedio / arregloTres.length;

    System.out.println("El promedio de todos los datos del arregloTres es: " + promedio);
    System.out.println();
    System.out.println("Los datos del arregloTres en orden son: ");
    printArray(arregloTres);
  }

  static void printArray(int[] array) {
    for(int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

}

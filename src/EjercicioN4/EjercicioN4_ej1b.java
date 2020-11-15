package EjercicioN4;

import java.util.Scanner;

public class EjercicioN4_ej1b {
  public static void main(String[] args) {
    Scanner ingres = new Scanner(System.in);

    System.out.println("");
    System.out.println("");
    System.out.println("*Ejercicio nº 1b - GUIA Ejercicios N4*");
    System.out.println("**************************************");
    int numeros[] = new int[10];

    for (int i = 0; i < numeros.length; i++) {
      System.out.println("Ingrese un numero que desea guardar en la posición " + (i + 1) + ":");
      numeros[i] = ingres.nextInt();
    }

    int max = numeros[0], min = numeros[0];
    for (int j = 0; j < numeros.length; j++) {
      if (min > numeros[j]) {
        min = numeros[j];
      }
      if (max < numeros[j]) {
        max = numeros[j];
      }
    }
    System.out.println("El número máximo, ingresado es: " + max + "\nEl numero mínimo es: " + min);
    ingres.close();
  }
}

package EjercicioN4;

import java.util.Scanner;

public class EjercicioN4_ej1c {
  public static void main(String[] args) {
    Scanner ingres = new Scanner(System.in);
    System.out.println("");
    System.out.println("");
    System.out.println("*Ejercicio nº 1c - GUIA Ejercicios N4*");
    System.out.println("**************************************");

    int count3 = 0, j = 0, numeros15[] = new int[15];
    do {
      System.out.println("Ingrese un valor que desea guardar en la posición " + (j + 1) + ":");
      numeros15[j] = ingres.nextInt();
      if (numeros15[j] == 3) {
        count3 = count3 + 1;
      }
      j++;
    } while (j < numeros15.length);

    if (count3 == 0) {
      System.out.println("No se ha ingresado el numero 3.");
    } else {
      System.out.println("Hemos contado que ingresó " + count3 + " veces el numero 3.");
    }
    ingres.close();
  }
}

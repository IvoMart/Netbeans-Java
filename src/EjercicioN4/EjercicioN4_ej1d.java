package EjercicioN4;

import java.util.Scanner;

public class EjercicioN4_ej1d {
  public static void main(String[] args) {
    Scanner ingres = new Scanner(System.in);
    System.out.println("");
    System.out.println("");
    System.out.println("*Ejercicio nº 1d - GUIA Ejercicios N4*");
    System.out.println("**************************************");
    String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
        "Octubre", "Noviembre", "Diciembre" };
    int i = 0;
    double suma = 0, sueldos[] = new double[12];

    do {
      System.out.println("Ingrese el sueldo correspondiente al mes de " + meses[i] + ":");
      sueldos[i] = ingres.nextDouble();
      suma = suma + sueldos[i];
      i++;
    } while (i < meses.length);
    ingres.close();
    System.out.println("La suma de su sueldo anual es: " + suma + " y el sueldo promedio es: " + (suma / 12));

  }
}

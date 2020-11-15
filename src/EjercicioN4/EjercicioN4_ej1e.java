package EjercicioN4;

import java.util.Scanner;

public class EjercicioN4_ej1e {
  public static void main(String args[]) {
    Scanner ingres = new Scanner(System.in);

    String ciudMnes[] = new String[5];

    double max = 0, min = 0;
    double tempMin[] = new double[5];
    double tempMax[] = new double[5];


    System.out.println("");
    System.out.println("");
    System.out.println("*Ejercicio nº 1e - GUIA Ejercicios N4*");
    System.out.println("**************************************");

    int i , pmin = 0, pmax = 0;

    for (i = 0; i < ciudMnes.length; i++) {
      System.out.print("Indique la ciudad: ");
      ciudMnes[i] = ingres.nextLine();
      ingres.reset();
    }

    i = 0;
    do{
      System.out.print("Indique Temperatura Máxima en " + ciudMnes[i] + ": ");
      tempMax[i] = ingres.nextDouble();

      if (tempMax[i] > max) {
        max = tempMax[i];
        pmax = i;
      }
      ingres.reset();
      System.out.print("Indique Temperatura Mínima: ");
      tempMin[i] = ingres.nextDouble();

      if (tempMin[i] < min) {
        min = tempMin[i];
        pmin = i;
      }
      i++;
    }while(i < ciudMnes.length);

    ingres.close();

    System.out.println("CIUDAD  |  MAX  |  MIN");
    for (int j = 0; j < ciudMnes.length; j++) {
      System.out.println(ciudMnes[j] + "   " + tempMax[j] + "   " + tempMin[j]);
    }
    System.out.println("La ciudad con temperatura mínima es " + ciudMnes[pmin] + "  " + tempMin[pmin]
        + "\nLa ciudad con temperatura máxima es " + ciudMnes[pmax] + "  " + tempMax[pmax]);

  }
}
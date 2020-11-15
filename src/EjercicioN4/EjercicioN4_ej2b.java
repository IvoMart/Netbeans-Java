package EjercicioN4;

import java.util.Scanner;

public class EjercicioN4_ej2b {
  public static void main(String[] args) {
    Scanner ingredt = new Scanner(System.in);

    String razasCan[][] = new String[3][3];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("Ingrese una raza canina: (Colum " + (i + 1) + " Fila " + (j + 1) + ")/9");
        razasCan[j][i] = ingredt.nextLine();
      }
    }

    ingredt.close();
    System.out.println("Columna 1  " + " Columna 2  " + " Columna 3  ");
    for (int j = 0; j < 3; j++) {
      System.out.println(razasCan[j][0] + "  " + razasCan[j][1] + "  " + razasCan[j][2]);
    }

  }
}

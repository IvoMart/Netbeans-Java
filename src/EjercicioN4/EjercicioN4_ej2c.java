package EjercicioN4;

import java.util.Scanner;

public class EjercicioN4_ej2c {
  public static void main(String[] args) {
    Scanner ingresoDt = new Scanner(System.in);

    double notas[][] = new double[4][4];

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("Ingrese la nota"+(j+1)+" del Alumno"+(i+1));
        notas[i][j] = ingresoDt.nextDouble();
      }
      notas[i][3] = (notas[i][0]+notas[i][1]+notas[i][2])/(notas.length-1);
    }

    ingresoDt.close();

    System.out.println("Alumno  Nota1  Nota2  Nota3  Promedio");
    for (int i = 0; i < notas.length; i++) {
      System.out.println((i+1)+"    "+notas[i][0] + "    " + notas[i][1] + "    " + notas[i][2] + "    " + notas[i][3]);
    }
  }
}

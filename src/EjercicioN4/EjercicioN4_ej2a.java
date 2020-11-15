package EjercicioN4;



public class EjercicioN4_ej2a {
  public static void main(String[] args) {
    int numTabla[][] = new int[4][5];

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 4; j++) {
        numTabla[j][i] =5;
      }
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(numTabla[j][i]+" ");
      }
    }

  }
}

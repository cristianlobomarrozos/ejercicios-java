import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    int tama;
    int pos;
    String pal;
    int minimo = 10;
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca el tamaño del array: ");
    tama = Integer.parseInt(System.console().readLine());
    
    String[] palabras = new String[tama];
    int[] posicion = new int[tama];
    
    for (int i=0; i<tama; i++) {
      System.out.print("Introduzca la palabra de la posición: " + i + ": ");
      pal = s.nextLine();
      palabras[i] = pal;
      
      System.out.print("Introduzca el número desde 0 hasta " + (tama-1) + "de la posición " + i + ": ");
      pos = Integer.parseInt(System.console().readLine());
      if (pos < minimo) {
        minimo = pos;
      }
    }
    System.out.println();
    
    for (int i=0; i<tama; i++) {
      if (posicion[i] == minimo) {
        System.out.print(palabras[i] + ", ");
        minimo++;
      }
      
    }
  }
}

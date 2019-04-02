import java.util.Scanner;

/*
 * 02/04/2019
 */

public class Ejercicio3 {
  public static void main(String[] args) {
    
    MemoriaPalabras memoria = new MemoriaPalabras();
    String palabra;
    
    int opcion = 0;
    Scanner s = new Scanner(System.in);
    
    do {
      
      System.out.println();
      System.out.println("Elija opción:");
      System.out.println("1: Memorizar.");
      System.out.println("2: Invertir.");
      System.out.println("3: Mostrar.");
      System.out.println("0: SALIR.");
      
      opcion = Integer.parseInt(s.nextLine()); 
      
      switch (opcion) {
        case 1:
          System.out.println("Introduzca la palabra: ");
          palabra = s.nextLine();
          memoria.memorizar(palabra);
          break;
        case 2:
          memoria.invertir();
          break;
        case 3:
          System.out.println(memoria.toString());
          break;
        default:
      }
      
    } while (opcion != 0);
  }
}

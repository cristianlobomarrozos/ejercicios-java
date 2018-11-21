import java.util.Scanner;

public class ejercicio8b{
  public static void main(String[] args){
    int fila = 8;
    int columna = 8;
    int[][] tablero = new int[fila][columna];
    String caracter = "";
    int posicion1;
    char posicion2;
    
    System.out.print("Introduzca la fila en la que está el alfil(1-8): ");
    posicion1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la columna en la que está el alfil(a-h): ");
    posicion2 = reader.next().charAt(0);
    
    switch(posicion2){
      case 'a':
        columna = Integer.valueOf(posicion2);
        columna = 1;
      break;
      case 'b':
        columna = Integer.valueOf(posicion2);
        columna = 2;
      break;
      case 'c':
        columna = Integer.valueOf(posicion2);
        columna = 3;
      break;
      case 'd':
        columna = Integer.valueOf(posicion2);
        columna = 4;
      break;
      case 'e':
        columna = Integer.valueOf(posicion2);
        columna = 5;
      break;
      case 'f':
        columna = Integer.valueOf(posicion2);
        columna = 6;
      break;
      case 'g':
        columna = Integer.valueOf(posicion2);
        columna = 7;
      break;
      case 'h':
        columna = Integer.valueOf(posicion2);
        columna = 8;
      break;
      
    }
    
    
    fila = posicion1;
    columna = posicion2;
    
    System.out.print("El alfil puede moverse a: ");
    
    
  }
}

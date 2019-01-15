public class Ejercicio3B {
  public static void main(String[] args) {
    int numero;
    
    System.out.println("Mostraremos los números curiosos existentes entre 2 y el valor introducido.");
    
    do {
      System.out.print("Introduzca un número mayor a 2: ");
      numero = Integer.parseInt(System.console().readLine());
    } while (numero < 2);
    
    for(int i=2; i<numero; i++) {
      
    }
  }
}

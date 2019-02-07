import java.util.ArrayList;

public class ArrayList01 {
  public static void main (String[] args) {
    ArrayList<Integer> lista1 = new ArrayList<Integer>();
    
    int valor;
    do{
      System.out.print("Introduzca valor(0 para salir): ");
      valor = Integer.parseInt(System.console().readLine());
      if (valor != 0) {
        lista1.add(valor);
      }
    }while (valor != 0);
    
    System.out.println("Has introducido " + lista1.size() + " valores");
    
  }
}

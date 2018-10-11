public class ejercicio15{
  public static void main(String[] args){
    int base;
    int exponente;
    
    System.out.println("Introduzca la base: ");
    base = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca el exponente(número positivo): ");
    exponente = Integer.parseInt(System.console().readLine());
    
    for(int i=1; i<=exponente;i++){
      System.out.print(base + "^" + i + " ");
    }
  }
}

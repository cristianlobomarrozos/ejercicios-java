public class tablasPotencias{
  public static void main(String[] args){
    int numero;
    int potencia = 1;
    System.out.print("Introduzca un número: ");
    numero = Integer.parseInt(System.console().readLine());
    
    for(int i=1; i<=10; i++){
      potencia = potencia * numero;
      System.out.println(numero + "^" + i + " = " + potencia);
    }
    
  }


}

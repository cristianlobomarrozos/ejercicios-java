public class ejercicio13{
  public static void main(String[] args){
    int numero;
    int numerosPositivos = 0;
    int numerosNegativos = 0;
    
    System.out.println("Introduzca 10 números: ");
    
    for (int i=0; i<10; i++){
      numero = Integer.parseInt(System.console().readLine());
      if(numero >= 0){
        numerosPositivos++;
      }else{
        numerosNegativos++;
      }
    }
    System.out.println("Hay "+numerosPositivos+" numeros positivos y "+numerosNegativos+" numeros negativos.");
  }
    
}

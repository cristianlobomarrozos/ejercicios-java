public class fibonacci{
  public static void main(String[] args){
    int n1 = 0;
    int n2 = 1;
    int numero;
    int suma = 0;
    
    System.out.println("Introduzca el número de términos que quiere que se muestren: ");
    numero = Integer.parseInt(System.console().readLine());
    
    System.out.println("Sucesión de Fibonacci:");
    System.out.println(n1);
    System.out.println(n2);
    
    for (int i=0; i<=numero; i++){
      suma = n1 + n2;
      n1 = n2;
      n2 = suma;
      System.out.println(suma);
    }


  }
}

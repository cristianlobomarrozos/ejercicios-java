public class tablaMultiplicar{
  public static void main(String[] args){
    int a;
    int resultado=0;
    
    String entrada = System.console().readLine();
    System.out.print("Introduzca un número para hacer su tabla de multiplicación: ");
    entrada = System.console().readLine();
    a = Integer.parseInt(entrada);
    
    for(int i = 0; i<=10;i++){
      resultado = a * i;
      System.out.printf("%d * %d = %d\n",a,i,resultado);
    }
    
  }
}

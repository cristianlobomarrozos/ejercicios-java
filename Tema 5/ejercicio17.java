public class ejercicio17{
  public static void main(String[] args){
    int numero;
    int acumulador = 0;
    System.out.println("Introduzca un número(positivo): ");
    numero = Integer.parseInt(System.console().readLine());
    
    if(numero < 0){
      System.out.println("El número introducido es incorrecto.");
      
    }else{
      for(int i=0; i<=100; i++){
        acumulador = acumulador + numero;
        numero++;
      }
    }
    System.out.println("La suma de los 100 siguientes número es: " + acumulador);
  }

}

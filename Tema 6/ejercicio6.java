public class ejercicio6{
  public static void main(String[] args){
    int numero;
    int numero1;
    int intentos = 5;
    
    numero = (int)(Math.random()*101);
    
    for(int i=0; i<=4; i++){
      System.out.println("Intente adivinar el numero entre [0-100]: ");
      numero1 = Integer.parseInt(System.console().readLine());
      intentos--;
      if(numero1 < numero){
        System.out.println("El número que ha introducido es menor.");
        System.out.println("Quedan " + intentos + " intentos");
      }else if(numero1 > numero){
        System.out.println("El número que ha introducido es mayor.");
        System.out.println("Quedan " + intentos + " intentos");
      }else{
        System.out.println("Número acertado.");
      }
    }
  


  }
}

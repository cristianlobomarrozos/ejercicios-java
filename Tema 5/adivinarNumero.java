public class adivinarNumero{
  public static void main(String[] args){
    int numero;
    int numeroAdivinar = 15;
    
    System.out.println("Introduzca el número: ");
    numero = Integer.parseInt(System.console().readLine());
    
    if(numero == numeroAdivinar){
      System.out.println("El número introducido es correcto");
      
      
    }else{
      do{
        if(numero > numeroAdivinar){
          System.out.println("El número " + numero + " es mayor.");
          
        }else if (numero < numeroAdivinar){
          System.out.println("El número " + numero + " es menor.");
        }else{
        }
          System.out.println("Número incorrecto, introdúzcalo de nuevo: ");
          numero = Integer.parseInt(System.console().readLine());
          
        
        
      }while(numero != numeroAdivinar);
        System.out.println("El número introducido es correcto");
      
      
    }
  
  }

}

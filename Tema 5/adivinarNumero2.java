public class adivinarNumero2{
  public static void main(String[] args){
    int numero;
    int numeroAdivinar = 15;
    int a = 0;
    int numero1 = 0;
    
    System.out.println("Introduzca el número: ");
    numero = Integer.parseInt(System.console().readLine());
    
    if(numero == numeroAdivinar){
      System.out.println("El número introducido es correcto");
      
      
    }else{
      do{
        if(numero > numeroAdivinar){
          System.out.println("El número " + numero + " es mayor.");
          
          System.out.println("El numero está entre: " + a + " y " + numero);
          numero1 = numero;
          
        }else if (numero < numeroAdivinar){
          System.out.println("El número " + numero + " es menor.");
          a = numero;
          numero1 = numeroAdivinar + 5;
          System.out.println("El número esta entre: " + a + " y " + numero1);
          
        }else{
        }
          System.out.println("Número incorrecto, introdúzcalo de nuevo: ");
          numero = Integer.parseInt(System.console().readLine());
          
        
        
      }while(numero != numeroAdivinar);
        System.out.println("El número introducido es correcto");
      
      
    }
  
  }


}

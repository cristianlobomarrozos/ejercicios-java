public class ejercicio5{
  public static void main(String[] args){
    int numero;
    int mayor = 0;
    int menor = 200;
    int media;
    
    for(int i=0; i<=50; i++){
      numero = (int)(Math.random()*100)+100;
      System.out.print(numero);
      
      if(numero > mayor){
        
        mayor = numero;
      }
      if(numero < menor){
        
        menor = numero;
      }
      System.out.println("");
    }
    media = (mayor + menor)/2;
    System.out.println("El mayor: " + mayor);
    System.out.println("El menor: " + menor);
    System.out.println("Media: " + media);
  }
}

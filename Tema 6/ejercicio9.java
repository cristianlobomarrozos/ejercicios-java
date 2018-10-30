public class ejercicio9{
  public static void main(String[] args){
    int numero;
    
    do{
      numero = (int)(Math.random()*101);
      if(numero%2 == 0){
        System.out.print(numero + " ");
      
      }
    }while(numero != 24);
    

  }
}

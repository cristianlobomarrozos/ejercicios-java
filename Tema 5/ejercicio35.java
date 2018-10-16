public class ejercicio35{
  public static void main(String[] args){
    int altura;
    int espaciosIntermedios;
    System.out.print("Dime la altura de la \"X\": ");
    altura = Integer.parseInt(System.console().readLine());
    
    if((altura >= 3) && ((altura%2)!=0)) {
      //pintamos la X
      espaciosIntermedios = altura - 2;
      for(int i=1; i<= (altura/2+1); i++) {
        for(int j=1; j<i; j++) {
          System.out.print(" ");
        }
        if(i<(altura/2+1)){
          System.out.print("*");
        }
        for(int j=1; j<=espaciosIntermedios; j++) {
          System.out.print(" ");
          
        }
        System.out.print("*\n");
        
        espaciosIntermedios -= 2;

      }
      
      
      
    }else {
      System.out.println("No se puede pintar la \"X\".");
    }
      
      
    //Pintar la primera parte de la X
    
    
    espaciosIntermedios=1;
    
    for(int i=(altura/2); i>=1; i--) {
      for(int j=1; j<i; j++) {
        System.out.print(" ");
      }
      System.out.print("*");

      for(int j=1; j<=espaciosIntermedios; j++) {
        System.out.print(" ");
        
      }
      System.out.print("*\n");
      
      espaciosIntermedios+=2;

    }
    
  }

}

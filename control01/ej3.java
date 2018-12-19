public class ej3{
  public static void main(String[] args){
    int altura;
    
    do{
      System.out.print("Introduzca la altura de la pirámide (entre 3 y 30): ");
      altura = Integer.parseInt(System.console().readLine());
    }while ((altura < 3) || (altura>30));
    
    for(int i=1; i<=altura; i++){
      System.out.print("*");
      for(int j=1; j<=(i-2); j++){
        System.out.print(" ");
      }
      if(i > 1){
        System.out.print("*");
      }
      System.out.println();
    }
    
    for(int i=altura; i>0; i--){
      System.out.print("*");
      for(int j=1; j<=(i-2); j++){
        System.out.print(" ");
      }
      if(i > 1){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  
}

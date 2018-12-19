public class ej2{
  public static void main(String[] args){
    int altura;
    
    do{
      System.out.print("Introduzca la altura de la pirámide (entre 3 y 30): ");
      altura = Integer.parseInt(System.console().readLine());
    }while ((altura < 3) || (altura>30));
    
    for(int i=1; i<=altura; i++){
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    
    for(int i=altura; i>0; i--){
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

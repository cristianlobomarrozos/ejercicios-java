public class ejercicio20{
  public static void main(String[] args){
    
    //Revisar el código.
    
    int altura;
    String simbolo;
    
    System.out.println("Introduzca la altura que desea que tenga la pirámide: ");
    altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Escribe el carácter con que la dibuje: ");
    simbolo = System.console().readLine();
    
    int contadorEspacios = altura - 1;
    int contadorSimbolos = 1;
    for(int i=1; i<=altura; i++){
      
      for(int j=1; j<=contadorEspacios; j++){
        System.out.print(simbolo);
      }
      
      for(int j=1; j<=contadorSimbolos; j++){
        System.out.print(" ");
      }
      for(int a=1; a<=(altura); a++){
        System.out.print(simbolo);
      }
      if(altura > 1){
        System.out.print(simbolo);
      }
      
      System.out.println("");
      contadorEspacios--;
      contadorSimbolos+=2;
    }
  
  }


}

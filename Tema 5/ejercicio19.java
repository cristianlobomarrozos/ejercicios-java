public class ejercicio19{
  public static void main(String[] args){
    int altura;
    String simbolo;
    
    System.out.println("Introduzca la altura que desea que tenga la pirámide: ");
    altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Escribe el carácter con que la dibuje: ");
    simbolo = System.console().readLine();
    
    //bucle para pintar cada linea.
    int contadorEspacios = altura - 1;
    int contadorSimbolos = 1;
    for(int i=1; i<=altura; i++){
      //bucle para pintar los espacios en blacno.
      for(int j=1; j<=contadorEspacios; j++){
        System.out.print(" ");
      }
      //bucle para pintar los caracteres de la pirámide.
      for(int j=1; j<=contadorSimbolos; j++){
        System.out.print(simbolo);
      }
      System.out.println("");
      contadorEspacios--;
      contadorSimbolos+=2;
    }
  }
}

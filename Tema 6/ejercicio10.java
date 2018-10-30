public class ejercicio10{
  public static void main(String[] args){
    int numero;
    int longitud;
    String caracter = "";
    longitud = (int)(Math.random()*40)+1;
    
    for(int i=0; i<longitud; i++){
      numero = (int)(Math.random()*6);
      
      switch(numero){
        case 0:
          caracter = String.valueOf(numero);
          caracter = "*";
          System.out.print(caracter);
        break;
        case 1:
          caracter = String.valueOf(numero);
          caracter = "-";
          System.out.print(caracter);
        break;
        case 2:
          caracter = String.valueOf(numero);
          caracter = "=";
          System.out.print(caracter);
        break;
        case 3:
          caracter = String.valueOf(numero);
          caracter = ".";
          System.out.print(caracter);
        break;
        case 4:
          caracter = String.valueOf(numero);
          caracter = "|";
          System.out.print(caracter);
        break;
        case 5:
          caracter = String.valueOf(numero);
          caracter = "@";
          System.out.print(caracter);
        break;
        
      }
      
    }
  
  
  }
}

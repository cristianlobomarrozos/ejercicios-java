public class ejercicio8{
  public static void main(String[] args){
    int fila = 8;
    int columna = 8;
    int[][] tablero = new int[fila][columna];
    String caracter = "";
    int posicion1;
    int posicion2;
    
    System.out.print("Introduzca la fila en la que está el alfil: ");
    posicion1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la columna en la que está el alfil: ");
    posicion2 = Integer.parseInt(System.console().readLine());
    
    fila = posicion1;
    columna = posicion2;
    
    System.out.print("El alfil puede moverse a: ");
    
    do{
      switch(columna){
      case 0:
        caracter = String.valueOf(columna);
        caracter = "a";
      break;
      case 1:
        caracter = String.valueOf(columna);
        caracter = "b";
      break;
      case 2:
        caracter = String.valueOf(columna);
        caracter = "c";
      break;
      case 3:
        caracter = String.valueOf(columna);
        caracter = "d";
      break;
      case 4:
        caracter = String.valueOf(columna);
        caracter = "e";
      break;
      case 5:
        caracter = String.valueOf(columna);
        caracter = "f";
      break;
      case 6:
        caracter = String.valueOf(columna);
        caracter = "g";
      break;
      case 7:
        caracter = String.valueOf(columna);
        caracter = "h";
      break;
    }
    
      fila++;
      columna++;
      
      System.out.print(caracter + fila + " ");
    }while((fila!=7) || (columna!=7));
    
    do{
      switch(columna){
      case 0:
        caracter = String.valueOf(columna);
        caracter = "a";
      break;
      case 1:
        caracter = String.valueOf(columna);
        caracter = "b";
      break;
      case 2:
        caracter = String.valueOf(columna);
        caracter = "c";
      break;
      case 3:
        caracter = String.valueOf(columna);
        caracter = "d";
      break;
      case 4:
        caracter = String.valueOf(columna);
        caracter = "e";
      break;
      case 5:
        caracter = String.valueOf(columna);
        caracter = "f";
      break;
      case 6:
        caracter = String.valueOf(columna);
        caracter = "g";
      break;
      case 7:
        caracter = String.valueOf(columna);
        caracter = "h";
      break;
    }
    
      fila--;
      columna--;
      
      System.out.print(caracter + fila + " ");
    }while((fila!=1) || (columna!=1));
    
    

  }
}

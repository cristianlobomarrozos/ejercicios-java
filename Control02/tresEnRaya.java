public class tresEnRaya{
  public static void main(String[] args){
    int fila = 0;
    int columna = 0;
    
    String[][] tablero = new String[3][3];
    String ficha1 = "X";
    String ficha2 = "O";
    
    boolean victoria = false;
    boolean empate = false;
    boolean lleno = false;
    
    rellenarTablero(tablero);
    
    do{
      
      colocarFicha(ficha1, tablero, fila, columna);
      pintarTablero(tablero);
      colocarFicha(ficha2, tablero, fila, columna);
      pintarTablero(tablero);
      
    }while((!victoria) || (!empate) || (!lleno));
  }
  
  public static void colocarFicha(String ficha, String[][] array, int a, int b){
    System.out.print("Introduzca la fila en la que quiere colocar la ficha: ");
    a = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la columna en la que quiere colocar la ficha: ");
    b = Integer.parseInt(System.console().readLine());
    
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        if((i == a) && (j == b) && (array[i][j] == " ")){
          array[i][j] = ficha;
        }
      }
    }
  }
  public static String[][] pintarTablero(String[][] tablero){
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        System.out.print(tablero[i][j] + " ");
      }
      System.out.println();
    }
    return tablero;
  }
  
  public static void rellenarTablero(String[][] tablero){
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        tablero[i][j] = " ";
      }
    }
  }
  
}

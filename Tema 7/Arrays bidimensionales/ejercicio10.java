public class ejercicio10{
  public static void main(String[] args){
    String[][] tablero = new String[3][3];
    int fila;
    int columna;
    int numero;
    String ficha = "";
    
    numero = (int)(Math.random()*2);
    
    switch(numero){
      case 0:
        ficha = String.valueOf(numero);
        ficha = "X";
      break;
      case 1:
        ficha = String.valueOf(numero);
        ficha = "O";
      break;
    }
    
    
    for(int i=0; i<3; i++) {
      for(int j=0; j<3; j++){
        tablero[i][j] = " ";
      }
    }
    
    if(ficha == "O"){
      fila = (int)(Math.random()*4);
      columna = (int)(Math.random()*4);
      for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
          tablero[fila][columna] = "X";
          tablero[i][j] = tablero[fila][columna];
        }
      }
    }
    
    for(int i=0; i<3; i++) {
      for(int j=0; j<3; j++){
        System.out.printf("%3d",tablero[i][j]);
      }
      System.out.println();
    }
    
    System.out.println();
    
    boolean victoria = false;
    boolean tableroLleno = false;
    
    /*do{
      
      
      
      //pedimos donde quiere poner su ficha
      System.out.print("Introduzca la fila en la que quiere colocar la ficha: " + ficha);
      fila = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca la columna en la que quiere colocar la ficha: ");
      columna = Integer.parseInt(System.console().readLine());
      
      
      
      
      
      
    }while((!victoria) || (!tableroLleno));*/
    
    
    
    
  }
}


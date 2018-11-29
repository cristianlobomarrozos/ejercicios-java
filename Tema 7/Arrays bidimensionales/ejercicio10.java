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
    
    
    
    boolean victoria = false;
    boolean tableroLleno = false;
    
    do{
      /*
      if(ficha == "O"){
        for(int i=0; i<3; i++){
          for(int j=0; j<3; j++){
            fila = (int)(Math.random()*4);
            columna = (int)(Math.random()*4);
            if((fila == i) && (columna == j) && (tablero[i][j] == " ")){
              tablero[i][j] = "X";
            }
          }
        }
      }else{
        for(int i=0; i<3; i++){
          for(int j=0; j<3; j++){
            fila = (int)(Math.random()*4);
            columna = (int)(Math.random()*4);
            if((fila == i) && (columna == j) && (tablero[i][j] == " ")){
              tablero[i][j] = "O";
            }
          }
        }
      }   */
      
      if(ficha == "O"){
        for(int i=0; i<3; i++){
          for(int j=0; j<3; j++){
            fila = (int)(Math.random()*3);
            columna = (int)(Math.random()*3);
            
            if((fila == i) && (columna == j) && (tablero[i][j] == " ")){
              tablero[i][j] = "X";
            }
          }
        }
      } else{
        for(int i=0; i<3; i++){
          for(int j=0; j<3; j++){
            fila = (int)(Math.random()*3);
            columna = (int)(Math.random()*3);
            
            if((fila == i) && (columna == j) && (tablero[i][j] == " ")){
              tablero[i][j] = "O";
            }
          }
        }
      }
      
      //pedimos donde quiere poner su ficha
      System.out.print("Introduzca la fila en la que quiere colocar la ficha " + ficha + " : ");
      fila = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca la columna en la que quiere colocar la ficha " + ficha + " : ");
      columna = Integer.parseInt(System.console().readLine());
      
      
      
      for(int i=0; i<3; i++) {
        for(int j=0; j<3; j++){
          if((fila == i) && (columna == j) && (tablero[i][j] == " ")){
            tablero[i][j] = ficha;
          }
        }
      }
      
      
      for(int i=0; i<3; i++) {
        for(int j=0; j<3; j++){
          System.out.print(tablero[i][j] + "  ");
        }
        System.out.println();
      }
    
      System.out.println();
      
      for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
          if((ficha == "X")){
            if(((i == 0) && (j == 0) && (((tablero[i][j] == tablero[i][j+1]) && (tablero[i][j] == tablero[i][j+2]))
                || ((tablero[i][j] == tablero[i+1][j]) && (tablero[i][j] == tablero[i+2][j])) 
                || ((tablero[i][j] == tablero[i][j+1]) && (tablero[i][j] == tablero[i][j+2]))))){
              victoria = true;
            }
          }else{
            
          }
        }
      }
      
    }while((!victoria) || (!tableroLleno));
    
    
    
    
  }
}


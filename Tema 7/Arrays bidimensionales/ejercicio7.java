public class ejercicio7{
  public static void main(String[] args){
    int tamaño = 5;
    String[][] mapa = new String[tamaño][tamaño];
    String rellenar = "";
    int numero;
    int fila;
    int columna;
    String tesoro = "X";
    int x1;
    int x2;
    
    for(int i=0; i<tamaño; i++){
      for(int j=0; j<tamaño; j++){
        numero = (int)(Math.random()*2);
        switch(numero){
          case 0:
            rellenar = String.valueOf(numero);
            rellenar = " ";
            mapa[i][j] = rellenar;
          break;
          case 1:
            rellenar = String.valueOf(numero);
            rellenar = "*";
            mapa[i][j] = rellenar;
          break;
          
        }
      }
    }
    
    x1 = (int)(Math.random()*(tamaño+1));
    x2 = (int)(Math.random()*(tamaño+1));
    for(int i=0; i<tamaño; i++){
      for(int j=0; j<tamaño; j++){
        if((i == x1) && (j == x2)){
          mapa[i][j] = tesoro;
        }
      }
    }
    
    
    
    for(int i=0; i<tamaño; i++){
      for(int j=0; j<tamaño; j++){
        System.out.print(mapa[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    System.out.print("Introduzca la fila(1 -" + tamaño + ": ");
    fila = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.print("Introduzca la columna(1 -" + tamaño + ": ");
    columna = Integer.parseInt(System.console().readLine());
    
    int intentos = 6;
    boolean encontrado = false;
    do{
      
      if(((x1+1) == fila) && ((x2+1) == columna)){
        System.out.println("Tesoro encontrado!. ");
        encontrado = true;
      }else if ((mapa[fila][columna] == " ")){
        System.out.print("Fallo.");
        if((mapa[fila+1][columna] == "*") || (mapa[fila-1][columna] == "*") || (mapa[fila+1][columna+1] == "*") || (mapa[fila][columna+1] == "*") || (mapa[fila-1][columna-1] == "*") || (mapa[fila][columna-1] == "*")){
          System.out.println("¡Cuidado! Hay una bomba cerca. ");
        }
        System.out.print("Introduzca de nuevo la fila: ");
        fila = Integer.parseInt(System.console().readLine());
        System.out.println();
        System.out.print("Introduzca de nuevo la columna: ");
        columna = Integer.parseInt(System.console().readLine());
      }
      intentos--;
    }while((intentos != 0) || (encontrado == false));
  }
}

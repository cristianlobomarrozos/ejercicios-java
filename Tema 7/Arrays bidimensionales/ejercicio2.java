public class ejercicio2{
  public static void main(String[] args){
    int[][] numero = new int[4][5];
    int valor;
    int sumarFila = 0;
    int sumarColumna = 0;
    int sumarTotal = 0;
    
    for(int i=0; i<4; i++){
      for(int j=0; j<5; j++){
        System.out.print("Introduzca el valor de la fila " + i + ", columna " + j + ": ");
        valor = Integer.parseInt(System.console().readLine());
      }
    }
    
    //sumamos las filas
    for(int i=0; i<4; i++){
      
      for(int j=0; j<5; j++){
        sumarFila = sumarFila + valor;
      }
    }
    //sumamos las columnas
    for(int i=0; i<4; i++){
      for(int j=0; j<1; j++){
        sumarColumna = sumarColumna + valor;
      }
    }
  }
}

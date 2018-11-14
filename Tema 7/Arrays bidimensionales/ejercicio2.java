public class ejercicio2{
  public static void main(String[] args){
    int[][] numero = new int[4][5];
    int[] sumarColumna = new int[5];
    int[] sumarFila = new int[4];
    int sumarTotal = 0;
    
    for(int i=0; i<4; i++){
      for(int j=0; j<5; j++){
        System.out.print("Introduzca el valor de la fila " + i + ", columna " + j + ": ");
        numero[i][j] = Integer.parseInt(System.console().readLine());
        sumarColumna[j] = sumarColumna[j] + numero[i][j];
        sumarTotal = sumarTotal + numero[i][j];
        
      }
      
    }
    for(int j=0; j<5; j++){
      for(int i=0; i<4; i++){
        sumarFila[i] = sumarFila[i] + numero[i][j];
      }
    }
    
    for(int i=0; i<4; i++){
      System.out.print("     ");
      for(int j=0; j<5; j++){
        System.out.printf("%4d",numero[i][j]);
      }
      System.out.print(" " + sumarFila[i]);
      System.out.println();
    }
    
    System.out.println();

    System.out.print("Suma:");
    for(int i=0; i<5; i++){
      for(int j=0; j<5; j++){
        
      }
      System.out.printf("%4d",sumarColumna[i]);
    }
    System.out.print(" " + sumarTotal);
    System.out.println();
  }
}

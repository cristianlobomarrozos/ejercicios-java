public class ejercicio5{
  public static void main(String[] args){
    int[][] numero = new int[6][10];
    int maximo = 0;
    int minimo = 1001;
    
    //rellenamos el array
    for(int i=0; i<6; i++){
      for(int j=0; j<10; j++){
        numero[i][j] = (int)(Math.random()*1001);
        if(numero[i][j] < minimo){
          minimo = numero[i][j];
        }else if(numero[i][j] > maximo){
          maximo = numero[i][j];
        }
        System.out.printf("%4d ",numero[i][j]);
      }
      System.out.println();
    }
    
    System.out.println();
    //buscamos las coordenadas del mínimo
    for(int i=0; i<6; i++){
      for(int j=0; j<10; j++){
        if(minimo == numero[i][j]){
          
          System.out.print("Las coordenadas del mínimo son: Fila " + (i+1) + " columna " + (j+1));
        }
      }
    }
    System.out.println();
    //buscamos las coordenadas del máximo
    for(int i=0; i<6; i++){
      for(int j=0; j<10; j++){
        if(maximo == numero[i][j]){
          
          System.out.print("Las coordenadas del máximo son: Fila " + (i+1) + " columna " + (j+1));
        }
      }
    }
  }
}

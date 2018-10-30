public class ejercicio17{
  public static void main(String[] args){
    int coordenadaFila;
    int coordenadaColumna;
    
    int altura;
    int anchura;
    
    System.out.print("Introduzca la altura deseada(que sea mayor que 4): \n");
    altura = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la anchura deseada(que sea mayor que 4): \n");
    anchura = Integer.parseInt(System.console().readLine());
    
    coordenadaFila = (int)(Math.random()*(altura-2)+2);
    coordenadaColumna = (int)(Math.random()*(anchura-2)+2);
    
    for(int contadorFilas = 1; contadorFilas <= altura; contadorFilas++){
      for(int contadorColumnas = 1; contadorColumnas<=anchura; contadorColumnas++){
          if((contadorFilas == 1) || (contadorFilas == altura)){
            System.out.print("*");
            
          }else if((contadorColumnas == 1) || (contadorColumnas == anchura)){
            System.out.print("*");
          }else if((contadorFilas == coordenadaFila) && (contadorColumnas == coordenadaColumna)){
            System.out.print("&");
          }else{
            System.out.print(" ");
          }
        
      }
      System.out.println("");
    }
  
  }
}

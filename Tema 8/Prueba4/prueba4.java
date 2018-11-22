public class prueba4{
  
  public static void main(String[] args){
    int tamanio;
    int[] elementos;
    //float media;
    
    //pedir tamaño array
    System.out.print("Indica la cantidad de elementos: ");
    tamanio = Integer.parseInt(System.console().readLine());
    
    //reserva el espacio de memoria para el array
    elementos = new int[tamanio];
    
    //pedir datos por teclado
    for(int i=0; i<tamanio; i++){
      System.out.print("Valor posicion " + i + " : ");
      elementos[i] = Integer.parseInt(System.console().readLine());
    }
    
    //presentar los valores por pantalla
    System.out.print("Valores introducidos: ");
    
    mostrarArray(elementos, tamanio);
    /*for(int i=0; i<6; i++){
      System.out.print(elementos[i]);
      if(i < 5){
        System.out.print(" ");
      }
    }*/
    System.out.println();
    
    //calcular la media
    /*float media = 0;
    for(int i=0; i<tamanio; i++){
      media += elementos[i];
    }
    media /= (float)(tamanio);*/
    
    
    
    System.out.println("La media de los valores introducidos es: " + calcularMedia(elementos,tamanio));
  }
  
  /* funciones */
  
  public static void mostrarArray(int[] vector, int tama){
    for(int i=0; i<tama; i++){
      System.out.print(vector[i]);
      if(i < (tama-1)){
        System.out.print(" ");
      }
    }
  }
  
  public static float calcularMedia (int[] vector, int tama2) {
    float med = 0;
    for(int i=0; i<(tama2); i++){
      med += vector[i];
    }
    med /= (float)tama2;
    
    return med;
  }
  
}

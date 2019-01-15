public class Ejercicio4 {
  public static void main (String[] args) {
    int[] frecuencia = new int[100];
    int numero;
    
    
    for (int i=0; i<frecuencia.length; i++) {
      frecuencia[i] = 0;
    }
    
    do {
      
      System.out.print("Introduzca un nº entre 1 y 100 (-1 para finalizar): ");
      numero = Integer.parseInt(System.console().readLine());
      
      if((numero >= 1) && (numero <= 100)) {
        
        frecuencia[numero-1]++;
        
      }
      
      
    } while (numero!=-1);
    
    for(int i=0; i<frecuencia.length; i++) {
      if (frecuencia[i] > 0) {
        System.out.printf("%4d ", i+1);
      }
      
      for (int j=0; j<frecuencia[i]; j++) {
        System.out.print("*");
      }
      if (frecuencia[i] > 0) {
        System.out.println();
      }
    }
  }
}

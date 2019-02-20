public class Ejercicio4 {
  public static void main(String[] args) {
    int tama;
    int pos;
    String pal;
    int minimo = 0;
    
    
    System.out.print("Introduzca el número de palabras que desea introducir: ");
    tama = Integer.parseInt(System.console().readLine());
    
    String[] palabras = new String[tama];
    int[] posicion = new int[tama];
    
    boolean noRepetido = false;
    for (int i=0; i<tama; i++) {
      System.out.print("Introduzca la palabra de la posición: " + i + ": ");
      pal = System.console().readLine();
      palabras[i] = pal;
      
      do{
        System.out.print("Introduzca el número desde 0 hasta " + (tama-1) + " de la posición " + i + ": ");
        pos = Integer.parseInt(System.console().readLine());
        System.out.println();
        for(int j=0; (j<i || noRepetido); j++) {
          if(pos == posicion[j]) {
            System.out.println("Número repetido.");
          } else {
            noRepetido = true;
          }
        }
        
      }while (!noRepetido);
    }
    System.out.println();
    
    for (int i=0; i<tama; i++) {
      
      if (posicion[i] == minimo) {
        System.out.print(palabras[i] + ", ");
      }
      minimo++;
    }
  }
  
  public static boolean detectarDigito (int numero, int digito) {
    boolean resultado = false;
    int aux = numero;
    
    while (aux > 0) {
      int aux1 = aux%10;
      
      if (aux1 == digito) {
        resultado = true;
      }
      aux /= 10;
    }
    
    return resultado;
  }
}

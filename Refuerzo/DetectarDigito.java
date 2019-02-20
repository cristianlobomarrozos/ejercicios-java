public class DetectarDigito {
  public static void main (String[] args) {
    int[] numeros = new int[10];
    int digito;
    int aux;
    int aux1;
    
    
    for (int i=0; i<10; i++) {
      numeros[i] = (int)(Math.random()*1000);
    }
    
    for (int i=0; i<10; i++) {
      System.out.print(numeros[i] + " ");
    }
    
    System.out.println();
    System.out.println();
    
    System.out.print("Introduzcael dígito que quiere detectar: ");
    digito = Integer.parseInt(System.console().readLine());
    
    boolean esta = false;
    
    for (int i=0; i<10; i++) {
      aux = numeros[i];
      
      while ((aux > 0) && (!esta)) {
        aux1 = aux;
        aux1 = aux1%10;
        
       /* if (aux1 == digito) {
          esta = true;
        }*/
        
        esta = detectarDigito(aux1, digito);
        
        aux = aux/10;
      }
      
      if (esta) {
        System.out.print(numeros[i] + " ");
      }
      esta = false;
    }
  }
  
  public static boolean detectarDigito (int numero, int digito) {
    boolean resultado = false;
    
    while (numero > 0) {
      int aux = numero%10;
      
      if (aux == digito) {
        resultado = true;
      }
      
      numero /= 10;
    }
    
    return resultado;
  }
}

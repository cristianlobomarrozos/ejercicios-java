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
        
        if (aux1 == digito) {
          esta = true;
        }
        
        aux = aux/10;
      }
      
      if (esta) {
        System.out.print(numeros[i] + " ");
      }
      esta = false;
    }
  }
}

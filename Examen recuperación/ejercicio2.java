public class ejercicio2 {
  public static void main (String[] args) {
    long num1;
    long num2;
    int contador;
    
    System.out.println("Introduzca el primer número positivo: ");
    num1 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca el segundo número positivo: ");
    num2= Integer.parseInt(System.console().readLine());
    
    int[] numero1 = ArrayNumeros(num1);
    int[] numero2 = ArrayNumeros(num2);
    
    contador = compararArray(numero1, numero2);
    
    System.out.println("En el número " + num1 + " hay " + contador + " dígitos que están en el número " + num2);
  }
  
  public static int[] ArrayNumeros (long a) {
    int contador = 0;
    long aux = a;
    
    while (a > 0) {
      contador++;
      a = a/10;
    }
    
    int[] numero = new int[contador];
    
    for (int i = 0; i<numero.length; i++) {
      numero[i] = (int)(aux%10);
      aux = aux/10;
    }
    
    return numero;
  }
  
  public static int compararArray (int[] num1, int[] num2) {
    
    int contador = 0;
    
    
    for (int i=0; i<num1.length; i++) {
      for(int j=0; j<num2.length; j++) {
        
        if ((num2[j] == num1[i])) {
          contador++;
        }
      }
      
    }
    
    return contador;
  }
}

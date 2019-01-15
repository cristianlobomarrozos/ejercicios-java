public class Ejercicio2A {
  
  public static void main(String[] args) {
    int[] premios = {1000,500,250,50,50,50,50,50,50,50,50,50,50};
    int[] numerosPremiados;
    int numero;
    
    numerosPremiados = sacar(premios.length, 1, 9999);
    ganadores(numerosPremiados, premios);
    
    do {
      System.out.print("Introduzca su Nº de lotería(0 si desea salir): ");
      numero = Integer.parseInt(System.console().readLine());
      
      if (numero!=0) {
        System.out.println("Nº " + numero + " premiado con: " + premio(numerosPremiados, premios, numero) + " €.");
      }
    } while (numero != 0);
    
  }
  
  public static int[] sacar (int can, int max, int min) {
    
    int[] premiados = new int[can];
    int num;
    boolean repetido = false;
    
    for (int i=0; i<can; i++) {
      num = (int)(Math.random()*(max - min + 1)) + min;
      for(int j=0; j<i; j++) {
        if (premiados[j] == num) {
          repetido = true;
        }
      }
      if (!repetido)  {
        premiados[i] = num;
        
      }
    }
    
    return premiados;
    
  }
  
  public static int premio (int[] premiados, int[] premios, int numero) {
    int ganar = 0;
    
    for (int i=0; (i<premiados.length) && (ganar == 0); i++) {
      
      if(premiados[i] == numero) {
        
        ganar = premios[i];
        
      }
      
    }
    
    if (ganar == 0) {
      
      if ((numero%10) == (premiados[0]%10)) {
        
        ganar = 5;
        
      } else {
        
        int primera = numero;
        
        while(primera >= 10) {
          
          primera = primera/10;
          
        }
        
        if (primera == (premiados[0]%10)) {
          ganar = 5;
          
        }
      }
    }
    
    return ganar;
    
  }
  
  public static void ganadores (int[] premiados, int[] premios) {
    System.out.println("Lista números premiados:");
    
    for(int i=0; i<premiados.length; i++) {
      System.out.printf("Nº. %7d ----> %7d € \n", premiados[i], premios[i]);
      //System.out.println();
    }
    System.out.println("Reintegro de 5€ a la terminación: " + (premiados[0]%10));
  }
  
}

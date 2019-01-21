import libreriaHanoi.accesorioHanoi;

public class ejercicio1 {
  public static void main(String[] args){
    int numDiscos;
    int[][] postes;
    int ini;
    int fin;
    boolean colocados = false;
    boolean sePuede = false;
    
    System.out.print("Introduzca el número de discos con los que desea jugar(entre 2-10): ");
    numDiscos = Integer.parseInt(System.console().readLine());
    
    postes = inicializaPostes(numDiscos);
    accesorioHanoi.muestraTorres(postes);
    
    do {
      
      System.out.print("Introduzca el poste desde el que desea realizar el movimiento: ");
      ini = Integer.parseInt(System.console().readLine());
      
      System.out.print("Introduzca el poste al que desea realizar el movimiento: ");
      fin = Integer.parseInt(System.console().readLine());
      
      intentaMover(postes, ini, fin);
      accesorioHanoi.muestraTorres(postes);
      colocados = checkHanoi(postes, numDiscos);
      
      
    } while ((!colocados) || (ini != -1) || (fin != -1));
  }
  
  public static int[][] inicializaPostes (int numDiscos) {
    int[][] postes = new int[3][numDiscos+1];
    
    for (int i=0; i<3; i++) {
      for (int j=0; j<(numDiscos+1); j++) {
        postes[i][j] = 0;
      }
    }
    
    postes[0][0] = numDiscos;
    
    for (int i=1; i<(numDiscos+1); i++) {
      postes[0][i] = numDiscos;
      numDiscos--;
    }
    
    return postes;
  }
  
  public static boolean intentaMover (int[][] postes, int ini, int fin) {
    
  }
  
  
  public static boolean checkHanoi (int[][] postes, int numDiscos) {
    boolean colocados = false;
    
    for (int i=0; i<postes[2].length; i++) {
      if (i == numDiscos) {
        colocados = true;
      } else {
        colocados = false;
      }
      numDiscos--;
    }
    return colocados;
  }
}

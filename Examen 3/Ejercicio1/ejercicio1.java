//import libreriaHanoi.*;

public class ejercicio1 {
  public static void main(String[] args){
    int numDiscos;
    int[][] postes;
    int ini;
    int fin;
 
    
    do {
      System.out.print("Introduzca el número de discos con los que desea jugar(entre 2-10): ");
      numDiscos = Integer.parseInt(System.console().readLine());
    } while ((numDiscos < 2) || (numDiscos > 10));
    
    postes = inicializaPostes(numDiscos);
    
    //libreriaHanoi.accesorioHanoi.muestraTorres(postes);
    muestraTorres(postes);
    
    boolean quiereSalir = false;
    
    while ((!(checkHanoi(postes))) && (!(quiereSalir))) {
      
      System.out.print("Introduzca desde qué poste quiere mover disco: ");
      ini = Integer.parseInt(System.console().readLine());
      
      if (ini != -1) {
        System.out.print("Introduzca a qué poste quiere mover disco: ");
        fin = Integer.parseInt(System.console().readLine());
        
        if (fin != -1) {
         if (!(intentaMover(postes,ini,fin))) {
          System.out.println("No se ha podido realizar el movimiento.");
          }
      
          //libreriaHanoi.accesorioHanoi.muestraTorres(postes);
          muestraTorres(postes);
           
        } else {
          quiereSalir = true;
        }
        
      } else {
        quiereSalir = true;
      }
    }
    
  }
  
  public static int[][] inicializaPostes (int numDiscos) {
    int[][] postes = new int[3][numDiscos+1];
    
    postes[0][0] = numDiscos;
    for (int i=1; i<=numDiscos; i++) {
      postes[0][i] = numDiscos-i+1;
    }
    for (int i=1; i<3; i++) {
      for (int j=0; j<=numDiscos; j++) {
        postes[i][j] = 0;
      }
    }
    
    return postes;
  }
  
  public static boolean intentaMover (int[][] postes, int origen, int destino) {
    boolean sePuede = false;
    
    if ((origen >= 1 && origen <= 3) && (destino >= 1 && destino <= 3)) {
      
      if (postes[origen-1][0] > 0) {
        if (postes[destino-1][0] == 0) {
          postes[destino-1][0]++;
          postes[destino-1][postes[destino-1][0]] = postes[origen-1][postes[origen-1][0]];
          postes[origen-1][postes[origen-1][0]] = 0;
          postes[origen-1][0]--;
          sePuede = true;
        } else {
          if (postes[origen-1][postes[origen-1][0]] < postes[destino-1][postes[destino-1][0]]) {
            postes[destino-1][0]++;
            postes[destino-1][postes[destino-1][0]] = postes[origen-1][postes[origen-1][0]];
            postes[origen-1][postes[origen-1][0]] = 0;
            postes[origen-1][0]--;
            sePuede = true;
          }
        }
      }
      
    }
    
    return sePuede;
  }
  
  
  public static boolean checkHanoi (int[][] postes) {
    boolean colocados = false;
    
    if (postes[2][0] == (postes[2].length-1)) {
      colocados = true;
    }
    
    return colocados;
  }
  
  public static void muestraTorres (int[][] matriz) {
    int numDiscos = matriz[0].length-1;
    
    for (int i=0; i<numDiscos; i++) {
      //repetir para cada capa de varilla
      for (int j=0; j<3; j++) {
        //pintar espacios en blanco
        for (int k=0; k<numDiscos-matriz[j][numDiscos-i]; k++) {
          System.out.print(" ");
        }
        
        //pintar primera parte disco
        for (int k=0; k<matriz[j][numDiscos-i]; k++) {
          System.out.print("=");
        }
        
        //pintar varilla
        if (matriz[j][numDiscos-i] == 0) {
          System.out.print("|");
        } else {
          System.out.print("=");
        }
        
        //pintar segunda parte disco
        for (int k=0; k<matriz[j][numDiscos-i]; k++) {
          System.out.print("=");
        }
        
        //pintar espacios en blanco
        for (int k=0; k<numDiscos-matriz[j][numDiscos-i]; k++) {
          System.out.print(" ");
        }
      }
      
      System.out.println();
      
    }
  }
}

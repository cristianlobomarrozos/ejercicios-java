package matematicas;

public class varias{
  public static boolean esCapicua(int x){
    if(x == (voltea(x))){
      return true;
    }
    return false;
  }
  
  public static boolean esPrimo(long x){
    for(int i=2; i<x; i++){
      if((x%i)==0){
        return false;
      }
    }
    
    return true;
  }
  public static int siguientePrimo(int x){
    do{
      x++;
      
    }while(!esPrimo(x));
    
    return x;
  }
  
  public static int potencia(int x, int y){
    if(y == 0){
      return 1;
    }
    int z = 1;
    
    for(int i=0; i<y; i++){
      z = z*x;
    }
    return z;
  }
  
  public static int digitos(int x){
    if(x==0){
     return 1; 
    }else{
      int contador = 0;
      while (x>0){
        x = x/10;
        contador++;
      }
      return contador;
    }
  }
  
  public static int voltea(int x){
    int voltear = 0;
    
    while(x>0){
      voltear = (voltear * 10) + (x%10);
      x = x/10;
    }
    return voltear;
  }
  
  public static int digitoN(int x, int y){
    x = voltea(x);
    while(y-->0){
      x = x/10;
      
    }
    return x % 10;
  }
  
  public static int posicionDeDigito(int x){
    int y;
    System.out.print("Introduzca el número que desea encontrar: ");
    y = Integer.parseInt(System.console().readLine());
    int posicion = 0;
    
    if(x==0){
      return -1;
    }else {
      while(x>0){
        x = x/10;
        posicion++;
      }
      for(int i=0; i<posicion; i++){
        int aux = 1;
        aux = aux * 10;
        x = x%aux;
        
        if(x==y){
          return x;
        }else{
          return -1;
        }
      }
    }
    
  }
  
  public static int quitarPorDetras(int x){
    int quitar;
    System.out.print("Introduzca el número de dígitos que quiere quitar por la derecha: ");
    quitar = Integer.parseInt(System.console().readLine());
    
    int resultado;
    int aux = 1;
    
    for(int i=0; i<quitar; i++){
      aux = aux * 10;
      resultado = x / aux;
      x = resultado;
      
    }
    
    
    return x;
    
  }
  
  public static int quitarPorDelante(int x){
    int quitar;
    System.out.print("Introduzca el número de dígitos que quiere quitar por la izquierda: ");
    quitar = Integer.parseInt(System.console().readLine());
    
    int contador = 0;
    while(x>0){
      x = x/10;
      contador++;
    }
    
    int aux = 1;
    int resultado = 0;
    for(int i=0; i<quitar; i++){
      aux = aux * 10;
      resultado = x%aux;
    }
    return resultado;
  }
}

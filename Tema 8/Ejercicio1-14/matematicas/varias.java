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
    
    for(int i=0; i<x; i++){
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
    int posicion = 1;
    for(int i=0; i<y; i++){
      posicion = posicion * 10;
    }
    int digito;
    digito = x%posicion;
    
    return digito;
  }
  
  public static int posicionDeDigito(){
    
  }
}

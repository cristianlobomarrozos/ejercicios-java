public class ejercicio16{
  public static void main(String[] args){
    int tamaño = 20;
    int[] numero = new int[20];
    int aleatorio;
    int resaltar;
    
    
    
    for(int i=0; i<tamaño; i++){
      aleatorio = (int)(Math.random()*401);
      numero[i] = aleatorio;
      System.out.print(numero[i] + " ");
      
    }
    System.out.print("¿Que quiere resaltar? (1-para múltiplos de 5 y 2-para múltiplos de 7): ");
    resaltar = Integer.parseInt(System.console().readLine());
    
    if(resaltar == 1){
      for(int i=0; i<tamaño; i++){
        if((numero[i]%5==0)){
          System.out.print("[" + numero[i] + "]" + " ");
        }else{
          System.out.print(numero[i] + " ");
        }
        
      }
    }else if (resaltar == 2){
      for(int i=0; i<tamaño; i++){
        if((numero[i]%7==0)){
          System.out.print("[" + numero[i] + "]" + " ");
        }else{
          System.out.print(numero[i] + " ");
        }
        
      }
    }
  
  }

}

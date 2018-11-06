public class ejercicio6{
  public static void main(String[] args){
    int[] n = new int[15];
    int numero;
    
    
    for(int i=0; i<15; i++){
      System.out.print("Introduzca un número: ");
      numero = Integer.parseInt(System.console().readLine());
      
      n[i] = numero;
    }
    for(int i=0; i<15; i++){
      for(int j=0; j<15; j++){
        n[j] = n[i];
        /*if(i == 0){
          n[0] = n[14];
        }*/
        System.out.print(n[j] + " , ");
        
      }
    }
  }
}

public class ejercicioo{
  public static void main(String[] args){
    int[] jarra1 = new int[2];
    int[] jarra2 = new int[2];
    
    System.out.print("Introduzca la capacidad máxima de la jarra 1: ");
    jarra1[0] = Integer.parseInt(System.console().readLine());
    jarra1[1] = 0;
    
    System.out.print("Introduzca la capacidad máxima de la jarra 2: ");
    jarra2[0] = Integer.parseInt(System.console().readLine());
    jarra2[1] = 0;
    
    //llenamos la primera jarra
      jarra1[1] = jarra1[0];
    
    
    
      //llenamos la segunda jarra desde la primera
      jarra2[1] = jarra1[1] - jarra2[0];
      if(jarra1[1] > jarra2[1]){
        jarra1[1] = jarra1[1] - jarra2[0];
      }
      
      //vaciamos la segunda jarra si está llena
      if(jarra2[1] == jarra2[0]){
        jarra2[1] = 0;
      }
      
      System.out.print("Jarra A: " + jarra1[1]);
      System.out.print("Jarra B: " + jarra2[1]);
      
      /*//volcamos en la segunda jarra desde la primera
      do{
        if(jarra1[1] <= jarra2[0]){
          jarra2[1] = jarra2[0] - jarra1[1];
          jarra1[1] = 0;
        } else{
          jarra2[1] = jarra1[1] - jarra2[0];
          jarra1[1] = jarra1[1] - jarra2[0];
        }
      }while(jarra1[1] > jarra2[0]);
      
      */
      
      
      
    
    
    
  }
}

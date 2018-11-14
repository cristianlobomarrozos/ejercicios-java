public class ejercicio12{
  public static void main(String[] args){
    int[] vector = new int[10];
    
    //peticion de número por teclado
    System.out.println("Vamos a rellenar el vector: ");
    for(int i=0 ; i<10; i++){
      System.out.print("Indique valor de posición " + (i+1) + ": ");
      vector[i] = Integer.parseInt(System.console().readLine());
    }
    for(int i=0; i<10; i++){
      System.out.println(vector[i]);
    }
    System.out.println();
  
  }

}

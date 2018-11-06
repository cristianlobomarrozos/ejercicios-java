public class ejercicio3{
  public static void main(String[] args){
    double numero;
    double[] n;
    //int posicion = 9;
    n = new double[10];
    
    
    for(int i=9; i>=0; i--){
      System.out.print("Introduzca un número: ");
      numero = Integer.parseInt(System.console().readLine());
      
      n[i] = numero;
      
    }
    for(int i=0; i<10; i++){
      System.out.print(n[i] + " , ");
    }
  }

}

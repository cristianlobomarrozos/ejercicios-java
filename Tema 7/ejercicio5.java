public class ejercicio5{
  public static void main(String[] args){
    int[] n = new int[10];
    
    int numero;
    int a = 0;
    int i;
    int b = n[0];
    
    String estado = "";
    
    for(i=0; i<10; i++){
      System.out.print("Introduzca un numero: ");
      numero = Integer.parseInt(System.console().readLine());
      n[i] = numero;
      
    }
    for(i=0; i<10; i++){
      
      if(n[i] > a){
        estado = "maximo";
        a = n[i];
      } else if(n[i] < b){
        estado = "minimo";
        b = n[i];
      } else {
        estado = "";
      }
      
    }
    
  }
}

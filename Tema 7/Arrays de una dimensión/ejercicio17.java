public class ejercicio17{
  public static void main(String[] args){
    int[] tamaño = new int[10];
    int aleatorio;
    int numero;
    
    for(int i=0; i<10; i++){
      aleatorio = (int)(Math.random()*101);
      tamaño[i] = aleatorio;
    }
    System.out.print("Introduzca un número (entre 0 y 100, ambos incluidos): ");
    numero = Integer.parseInt(System.console().readLine());
    
    
  }

}

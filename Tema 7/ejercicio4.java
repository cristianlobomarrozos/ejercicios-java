public class ejercicio4{
  public static void main(String[] args){
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    
    
    System.out.println("numero-----cuadrado-----cubo");
    for(int i=0; i<20; i++){
      int aleatorio = (int)(Math.random()*101);
      numero[i] = aleatorio;
      
      cuadrado[i] = aleatorio * aleatorio;
      
      cubo[i] = aleatorio * aleatorio * aleatorio;
      
      
      
      System.out.println(numero[i] + "    " + cuadrado[i] + "    " + cubo[i]);
    }
    
  }
}

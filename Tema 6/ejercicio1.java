public class ejercicio1{
  public static void main(String[] args){
    int dado1;
    int dado2;
    int dado3;
    int suma;
    
    System.out.println("Vamos a lanzar 3 dados, a dar los valores que salen y luego la suma de los 3 valores: ");
    
    System.out.print("Dado 1: ");
    dado1 = (int)(Math.random()*6)+1;
    System.out.println(dado1);
    System.out.print("Dado 2: ");
    dado2 = (int)(Math.random()*6)+1;
    System.out.println(dado2);
    System.out.print("Dado 3: ");
    dado3 = (int)(Math.random()*6)+1;
    System.out.println(dado3);
    
    suma = dado1 + dado2 + dado3;
    System.out.println("Suma: " + suma);
  
  }


}

public class sumaVarios4{
  public static void main(String[] args){
    int acumulador = 0;
    int sumando;
    System.out.print("Introduzca el nº de números a sumar: ");
    int numSumandos = Integer.parseInt(System.console().readLine());
    
    //for(int i = 1; i<=numSumandos; i++){
    
    int i=0;
    while (i<numSumandos){
      System.out.print("Introduzca el sumando nº " + i + ": ");
      sumando = Integer.parseInt(System.console().readLine());
      acumulador += sumando;
    }
    System.out.print("La suma de los sumandos " + numSumandos + "números introducidos es: " + acumulador);
  }
}

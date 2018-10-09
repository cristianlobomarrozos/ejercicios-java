public class sumaVarios3{
  public static void main(String[] args){
    int acumulador = 0;
    int sumando=0;
    while(sumando != 0){
      System.out.print("Introduzca el sumando(0 para terminar: ");
      sumando = Integer.parseInt(System.console().readLine());
    }
    System.out.print("La suma de los sumandos "+ acumulador);
  }
}

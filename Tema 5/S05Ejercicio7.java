public class S05Ejercicio7{
  public static void main(String[] args){
    int a;
    String entrada = System.console().readLine();
    System.out.println("Introduzca la clave de 4 cifras: ");
    entrada = System.console().readLine();
    a = Integer.parseInt(entrada);
    int i = 0;
    while(i<=3){
          if(a == 1234){
            System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
          }else if(a != 1234){
            System.out.println("Lo siento, esa no es la combinación.");
            System.out.println("Introduzca de nuevo la clave: ");
            entrada = System.console().readLine();
            a = Integer.parseInt(entrada);
          }
      i++;
    }
      System.out.println("Ya ha superado 4 intentos.");
  }
}

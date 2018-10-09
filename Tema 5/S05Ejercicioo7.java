public class S05Ejercicioo7{
  public static void main(String[] args){
    int a;
    int intentos = 4;
    boolean acertado = false;
    do{
      String entrada = System.console().readLine();
      System.out.print("Introduzca la clave de 4 cifras: ");
      entrada = System.console().readLine();
      a = Integer.parseInt(entrada);
      
      if(a == 6587){
        acertado = true;
      }else{
        System.out.print("Clave incorrecta.");
      }
      intentos--;
    }while((intentos > 0) && (!acertado));
      if(acertado){
        System.out.print("La caja fuerte se ha abierto satisfactoriamente.");
      }else{
        System.out.print("Lo siento, esa no es la combinación.");
      }
  }
}

public class S05Ejercicio9{
  public static void main(String[] args){
    int numero;
    
    String entrada = System.console().readLine();
    System.out.println("Introduzca el número: ");
    entrada = System.console().readLine();
    numero = Integer.parseInt(entrada);
    
    int i = 0;
    int longitud=0;
    while(i<numero){
      i++;
    }
    if(numero>10){
      longitud = i%10;
    }else{
      longitud = 1;
    }
    System.out.println("El numero" + numero + " tiene " +longitud+ " cifras.");
  
  }
}

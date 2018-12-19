public class ej1{
  public static void main(String[] args){
    int numeroDecimal;
    String numeroBinario = "";
    
    do{
      System.out.print("Introduzca un número decimal entre 0 y 9999: ");
      numeroDecimal = Integer.parseInt(System.console().readLine());
    }while ((numeroDecimal < 0) || (numeroDecimal > 9999));
    
    int cociente = numeroDecimal;
    int resto;
    
    while(cociente > 0){
      resto = cociente%2;
      cociente = cociente/2;
      
      numeroBinario = resto + numeroBinario;
    }
    System.out.print("El número " + numeroDecimal + " decimal, es: " + numeroBinario + " binario.");
    
  }
}

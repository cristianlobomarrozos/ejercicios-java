import java.util.Scanner;
public class S05Ejercicio10{
  public static void main(String[] args){
    int numeros;
    int entrada = 0;
    int numeroMedia = 0;
    double media;   

    
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca los números(positivos) de los que quiera hacer la media(introducir nº negativo cuando haya terminado de introducir los números: ");
    numeros = Integer.parseInt(s.nextLine());
    entrada = entrada + numeros;
    /*do{
      
      numeros = Integer.parseInt(s.nextLine());
      entrada = entrada + numeros;
    
    }while(numeros >= 0);
    
    media = entrada/a;
    System.out.println("La media es: "+media);
    */
    while (numeros >= 0){
      numeros = Integer.parseInt(s.nextLine());
      entrada = entrada + numeros;
      numeroMedia++;
    }
    
    media = entrada/numeroMedia+1;
    
    System.out.println("La media es: "+media);
    
  }
}

import palotes.Palotes;
import java.util.Scanner;

public class PruebaPalotes {
  public static void main (String[] args) {
    int x;
    String palotes;
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca el número que desea pasar a \"palotes\": ");
    x = Integer.parseInt(s.nextLine());
    
    palotes = Palotes.parsePalotes(x);
    
    System.out.println();
    
    System.out.println("El número " + x + "en formato de palotes es: ");
    System.out.print(palotes);
  }
}

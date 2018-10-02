import java.util.Scanner;


public class tiempoEnCaer{
  //final static double g = 9.81;
  
  public static void main(String[] args){
    double h;
    //double t;
    double g;
    //sqrt(double t);
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca la altura en metros: ");
    
    h = Double.parseDouble(s.nextLine());
    
    g = 9.81;
    
    double t = Math.sqrt((2*h)/g);
    
    System.out.println("El tiempo que tardará en caer es: " + t);
    
    
  }  

}

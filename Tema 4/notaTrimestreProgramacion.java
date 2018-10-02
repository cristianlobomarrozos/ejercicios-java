import java.util.Scanner;

public class notaTrimestreProgramacion{
  public static void main(String[] args){
    double a;
    double b;
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca la nota del primer control:");
    a = Double.parseDouble(s.nextLine());
    System.out.println("Introduzca la nota del segundo control:");
    b = Double.parseDouble(s.nextLine());
    
    double m;
    
    m = (a + b)/2;
    if(m >= 5){
      System.out.println("El alumno ha aprobado con un: " + m);
      
    }else{

      //boolean apto = true;
      System.out.println("Introduzca el resultado de la recuperación(apto/no apto): ");
          String recuperacion = System.console().readLine();
      if(recuperacion.equals("apto")){
        m = 5; 
        System.out.println("La nota del alumno es: " + m);
      }else{
        System.out.println("El alumno ha sacado un: " + m);
      }
    }
    
  }


}

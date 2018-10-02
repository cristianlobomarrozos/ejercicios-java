import java.util.Scanner;

public class S04Ejercicio24{
  public static void main(String[] args){
    int a;
    int b;
    int c;
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("1-Programador junior.");
    System.out.println("2-Programador senior.");
    System.out.println("3-Jefe de proyecto.");
    System.out.println("Introduzca el cargo del empleado(1-3):");
    a = Integer.parseInt(s.nextLine());
    
    System.out.println("Cuantos dias ha estado de viaje visitando clientes:");
    b = Integer.parseInt(s.nextLine());
    
    System.out.println("Introduzca su estado civil(1-soltero, 2-casado");
    c = Integer.parseInt(s.nextLine());
    
    double d;
    double e;
    double f;
    double g;
    double h;
    
    if (a == 1){
      d = 950;
      System.out.println("El sueldo base es:" + d);
      e = b*30;
      System.out.println("Dietas (" + b + ") viajes:" + e);
      f = e + d;
      System.out.println("El sueldo bruto es:" + f);
        if(c == 1){
          g = f * 0.25;
        }else{
          g = f * 0.20;
        }
        System.out.println("Retención de IRPF:" + g);
        h = f - g;
        
        System.out.println("Sueldo neto:" + h);
      
    }else if (a == 2){
      d = 1200;
      System.out.println("El sueldo base es:" + d);
        e = b*30;
      System.out.println("Dietas (" + b + ") viajes:" + e);
      f = e + d;
      System.out.println("El sueldo bruto es:" + f);
        if(c == 1){
          g = f * 0.25;
        }else{
          g = f * 0.20;
        }
        System.out.println("Retención de IRPF:" + g);
        h = f - g;
        
        System.out.println("Sueldo neto:" + h);
      
      
    }else if (a == 3){
      d = 1600;
      System.out.println("El sueldo base es:" + d);
        e = b*30;
      System.out.println("Dietas (" + b + ") viajes:" + e);
      f = e + d;
      System.out.println("El sueldo bruto es:" + f);
        if(c == 1){
          g = f * 0.25;
        }else{
          g = f * 0.20;
        }
        System.out.println("Retención de IRPF:" + g);
        h = f - g;
        
        System.out.println("Sueldo neto:" + h);
      
      
    }
    
    
  }


}

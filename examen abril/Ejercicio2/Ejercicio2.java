import java.util.Scanner;

/*
 * 02/04/2019
 */

public class Ejercicio2 {
  public static void main(String[] args) {
    
    String nombre;
    long telefono;
    
    Agenda agendaDeContactos = new Agenda();
    
    int opcion = 0;
    Scanner s = new Scanner(System.in);
    
    do {
      System.out.println();
      System.out.println("Elija opción:");
      System.out.println("1: Añadir.");
      System.out.println("2: Borrar.");
      System.out.println("3: Consultar.");
      System.out.println("4: Mostrar lista completa");
      System.out.println("0: SALIR.");
      
      opcion = Integer.parseInt(s.nextLine()); 
      
      switch (opcion) {
        case 1:
          System.out.println("Introduzca el nombre: ");
          nombre = s.nextLine();
          System.out.println("Introduzca el teléfono: ");
          telefono = Integer.parseInt(s.nextLine());
          agendaDeContactos.darAlta(nombre,telefono);
          break;
        case 2:
          System.out.println("Introduzca el contacto que desea dar de baja: ");
          nombre = s.nextLine();
          agendaDeContactos.darBaja(nombre);
          break;
        case 3:
          System.out.println("Introduzca el contacto que desea consultar: ");
          nombre = s.nextLine();
          agendaDeContactos.consultarContacto(nombre);
          break;
        case 4:
        System.out.println("agendaDeContactos");
          System.out.print(agendaDeContactos.toString());
          break;
        default:
      }
      
    } while (opcion != 0);
  }
  
}

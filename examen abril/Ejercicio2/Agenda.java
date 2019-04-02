import java.util.*;

/*
 * 02/04/2019
 */

public class Agenda {
  private HashMap<String,Long> contactos;
  private long telefono;
  private String nombre;
  
  public Agenda() {
    this.contactos = new HashMap<String,Long>();
  }
  
  public void darAlta(String nombre, long numero) {
    String aux;
    if (contactos.containsKey(nombre)) {
      System.out.println("El contacto ya existe, si desea actualizarlo, introduzca (s): ");
      aux = System.console().readLine();
      if (aux.equals("s")) {
        contactos.remove(nombre);
        contactos.put(nombre, numero);
      }
    } else {
      contactos.put(nombre, numero);
    }
  }
  
  public void darBaja(String nombre) {
    contactos.remove(nombre);
  }
  
  public void consultarContacto(String nombre) {
    if (contactos.containsKey(nombre)) {
      System.out.println("Teléfono: " + contactos.get(nombre));
    } else if (!(contactos.containsKey(nombre))) {
      System.out.println("-1");
    }
  }
  
  public String toString() {
    String salida = "";
    salida += "=====================================\n";
    for (Map.Entry e : contactos.entrySet()) {
      salida += "Nombre: " + e.getKey() + "\n";
      salida += "Teléfono: " + e.getValue() + "\n";
      salida += "=====================================\n";
    }
    return salida;
  }
}

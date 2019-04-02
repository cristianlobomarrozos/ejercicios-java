import java.util.*;

/*
 * 02/04/2019
 */

public class Pais {
  private String nombre;
  private ArrayList<Region> regiones;
  
  public Pais(String nomb) {
    this.nombre = nomb;
    this.regiones = new ArrayList<Region>();
  }
  
  public void addRegion(Region a) {
    this.regiones.add(a);
  }
  
  public void borrarRegion(String nomb) {
    if(regiones.contains(nomb)) {
      this.regiones.remove(nomb);
    }
  }
  
  public ArrayList<Region> getRegion(String a) {
    return this.regiones;
  }
  
  public long getPoblacion() {
    long poblacion = 0;
    for (Region r : this.regiones) {
      poblacion += r.getPoblacion();
    }
    return poblacion;
  }
  
  public String getRegion() {
    return this.nombre;
  }
  
  public int getExtension() {
    int extension = 0;
    for (Region r : this.regiones) {
      extension += r.getExtension();
    }
    return extension;
  }
  
  public String toString() {
    String salida = "";
    salida += "Nombre: " + this.nombre + "\n Extensión: " + this.getExtension() + "\n Población: " + this.getPoblacion();
    for (Region r : this.regiones) {
      salida += "======================================\n";
    
      salida += r.toString();
    }
    
    
    return salida;
  }
}

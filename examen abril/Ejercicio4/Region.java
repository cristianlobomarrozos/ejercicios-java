import java.util.*;

/*
 * 02/04/2019
 */

public class Region {
  private String nombre;
  private ArrayList<Municipio> municipios;
  
  public Region(String nomb) {
    this.nombre = nomb;
    this.municipios = new ArrayList<Municipio>();
  }
  
  public void addMunicipio(Municipio a) {
    this.municipios.add(a);
  }
  
  public void borrarMunicipio(String nomb) {
    if(municipios.contains(nomb)) {
      this.municipios.remove(nomb);
    }
  }
  
  public long getPoblacion() {
    long poblacion = 0;
    for (Municipio m : this.municipios) {
      poblacion += m.getPoblacion();
    }
    return poblacion;
  }
  
  public int getExtension() {
    int extension = 0;
    for (Municipio m : this.municipios) {
      extension += m.getExtension();
    }
    return extension;
  }
  
  public ArrayList<Municipio> getMunicipio(String a) {
    return this.municipios;
  }
  
  public String toString() {
    String salida = "";
    salida += "Nombre: " + this.nombre + "\n Extensión: " + this.getExtension() + "\n Población: " + this.getPoblacion();
    for (Municipio m : this.municipios) {
      salida += "======================================\n";
    
      salida += m.toString();
    }
    
    
    return salida;
  }
}

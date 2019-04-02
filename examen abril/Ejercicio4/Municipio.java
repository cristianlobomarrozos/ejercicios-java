import java.util.*;

/*
 * 02/04/2019
 */

public class Municipio {
  private String nombre;
  private int extension;
  private long poblacion;
  
  public Municipio(String nomb, int ext, long pob) {
    this.nombre = nomb;
    this.extension = ext;
    this.poblacion = pob;
  }
  
  public long getPoblacion() {
    return this.poblacion;
  }
  
  public int getExtension() {
    return this.extension;
  }
  
  public void setPoblacion(long pob) {
    this.poblacion = pob;
  }
  
  public void setExtension(int ext) {
    this.extension = ext;
  }
  
  public String toString() {
    String salida = "";
    salida += "Nombre: " + this.nombre + "\n Extensión: " + this.extension + "\n Población: " + this.poblacion;
    
    return salida;
  }
}

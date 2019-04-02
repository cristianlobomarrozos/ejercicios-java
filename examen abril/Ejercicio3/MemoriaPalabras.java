import java.util.*;

/*
 * 02/04/2019
 */
 
public class MemoriaPalabras {
  private static ArrayList<String> palabras;
  private static ArrayList<String> aux = new ArrayList<String>();
  //private String nombre;
  
  public MemoriaPalabras() {
    this.palabras = new ArrayList<String>();
  }
  
  public void memorizar(String name) {
    this.palabras.add(name);
  }
  
  public void invertir() {
    Collections.reverse(palabras);
    for (int i=0; i<palabras.size(); i++) {
      this.aux.add(palabras.get(i));
    }
  }
  
  public String toString() {
    String salida = "";
    
    for (int i=0; i<palabras.size(); i++) {
      if (i == (palabras.size()-1)) {
        salida = palabras.get(i) + "," + salida + ".";
      } else {
        salida = palabras.get(i) + "," + salida;
      }
      
    }
    return salida;
  }
}

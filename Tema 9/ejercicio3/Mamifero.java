public class Mamifero extends Animal {
  private int tiempoGestacion;

  
  public Mamifero (int tiempoGest) {
    this.tiempoGestacion = tiempoGest;
  }
  
  public String toString () {
    String salida = super.toString();
    salida = salida + "\nTiempo de gestación: " + this.tiempoGestacion;
    
    return salida;
  }
}

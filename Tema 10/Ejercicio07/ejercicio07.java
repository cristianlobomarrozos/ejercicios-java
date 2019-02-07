import java.util.ArrayList;

public class ejercicio07 {
  public static void main (String[] args) {
    ArrayList<Moneda> m = new ArrayList<Moneda>();
    
    Moneda monedaAuxiliar = new Moneda();
    m.add(monedaAuxiliar);
    
    String ultimaPosicion = monedaAuxiliar.getPosicion();
    String ultimaCantidad = monedaAuxiliar.getCantidad();
    
    for (int i=0; i<6; i++) {
      do {
        monedaAuxiliar = new Moneda();
      } while((!(monedaAuxiliar.getPosicion().equals(ultimaPosicion))) && (!(monedaAuxiliar.getCantidad().equals(ultimaCantidad))));
      
      m.add(monedaAuxiliar);
      ultimaPosicion = monedaAuxiliar.getPosicion();
      ultimaCantidad = monedaAuxiliar.getCantidad();
    
    }
    
    for (Moneda mone : m) {
      System.out.println(mone);
    }
    
  }
}

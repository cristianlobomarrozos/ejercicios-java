public class usoThis {
  
  public static void main (String[] args) {
    Caballo rocinante;
    Caballo clavilenio;
    
    rocinante = new Caballo ("Rocinante", "macho");
    clavilenio = new Caballo ("Clavileño", "macho");
    
    rocinante.setEdad(3);
    rocinante.setPeso(350);
    rocinante.setRaza("Española");
    
    //System.out.println(rocinante.nombre);
    System.out.println(rocinante.getNombre());  
    
    //System.out.println(clavilenio.edad);
    System.out.println(rocinante.getEdad());
    System.out.println(rocinante.getPeso());
    
    System.out.println();
    
    System.out.print(rocinante);
    System.out.println();
    System.out.print(clavilenio);
  }
}

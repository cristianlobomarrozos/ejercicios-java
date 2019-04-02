import java.util.*;

/*
 * 02/04/2019
 */

public class Ejercicio4 {
  public static void main(String[] args) {
    
    Pais pais1 = new Pais("Pais1");
    Pais pais2 = new Pais("Pais2");
    
    pais1.addRegion(new Region("Region1"));
    pais1.getRegion("Region1").addMunicipio(new Municipio("Municipio1",10,20));
    pais1.getRegion("Region1").addMunicipio(new Municipio("Municipio2",20,30));
    
    pais1.addRegion(new Region("Region2"));
    pais1.getRegion("Region2").addMunicipio(new Municipio("Municipio3",30,40));
    pais1.getRegion("Region2").addMunicipio(new Municipio("Municipio4",40,50));
    
    pais2.addRegion(new Region("Region3"));
    pais2.getRegion("Region3").addMunicipio(new Municipio("Municipio5",50,60));
    pais2.getRegion("Region3").addMunicipio(new Municipio("Municipio6",60,70));
    pais2.addRegion(new Region("Region4"));
    
    System.out.println(pais1);
    System.out.println(pais2);
  }
}

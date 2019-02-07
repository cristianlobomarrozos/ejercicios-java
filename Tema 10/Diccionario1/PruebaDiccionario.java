import java.util.*;

public class PruebaDiccionario {
  public static void main (String[] args) {
    HashMap <String,String> diccionario = new HashMap <String,String>();
    
    diccionario.put("Hola","Hello");
    diccionario.put("Perro","Dog");
    diccionario.put("Gato","Cat");
    diccionario.put("Adiós","Bye");
    diccionario.put("Avión","Plane");
    
    //System.out.println(diccionario);
    
    
    String capturaTeclado;
    
    do {
      System.out.print("Introduzca palabras en castellano, (\"exit\" para salir): ");
      capturaTeclado = System.console().readLine();
      
      if (!capturaTeclado.equals("exit")) {
        if (diccionario.containsKey(capturaTeclado)) {
          System.out.println(capturaTeclado + " : " + diccionario.get(capturaTeclado));
        } else {
          System.out.println("Entrada inexistente: " + capturaTeclado);
        }
      }
      
    } while (!capturaTeclado.equals("exit"));
  }
}

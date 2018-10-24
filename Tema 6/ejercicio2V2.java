public class ejercicio2V2{
  public static void main(String[] args){
    int palo;
    int numero;
    String letra = "";
    String palo1 = "";
    
    palo = (int)(Math.random()*4);
    switch(palo){
      case 0:
        //System.out.println("Picas.");
        palo1 = String.valueOf(palo);
        palo1 = "Picas";
        //System.out.println(palo1);
      break;
      case 1:
        //System.out.println("Corazones.");
        palo1 = String.valueOf(palo);
        palo1 = "Corazones";
        //System.out.println(palo1);
      break;
      case 2:
        //System.out.println("Diamantes.");
        palo1 = String.valueOf(palo);
        palo1 = "Diamantes";
        //System.out.println(palo1);
      break;
      case 3:
        //System.out.println("Tréboles.");
        palo1 = String.valueOf(palo);
        palo1 = "Tréboles";
        //System.out.println(palo1);
      break;
    }
    
    numero = (int)(Math.random()*13) + 1;
    if((numero >= 2) && (numero <= 10)){
      //System.out.println(numero);
      System.out.print(numero + " de " + palo1);
    }else{
      switch(numero){
        case 1:
          letra = String.valueOf(numero);
          letra = "A";
          //System.out.println(letra);
        break;
        case 11:
          letra = String.valueOf(numero);
          letra = "J";
          //System.out.println(letra);
        break;
        case 12:
          letra = String.valueOf(numero);
          letra = "Q";
          //System.out.println(letra);
        break;
        case 13:
          letra = String.valueOf(numero);
          letra = "K";
          //System.out.println(letra);
        break;
        
      }
      System.out.print(letra + " de " + palo1);
    }
  }
}

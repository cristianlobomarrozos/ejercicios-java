public class ejercicio3{
  public static void main(String[] args){
    int palo;
    int numero;
    String letra = "";
    String palo1 = "";
    
    palo = (int)(Math.random()*4);
    switch(palo){
      case 0:
        palo1 = String.valueOf(palo);
        palo1 = "Bastos";
      break;
      case 1:
        palo1 = String.valueOf(palo);
        palo1 = "Oro";
      break;
      case 2:
        palo1 = String.valueOf(palo);
        palo1 = "Espadas";
      break;
      case 3:
       
        palo1 = String.valueOf(palo);
        palo1 = "Copas";
     
      break;
    }
    
    numero = (int)(Math.random()*10) + 1;
    if((numero >= 2) && (numero <= 7)){
     
      System.out.print(numero + " de " + palo1);
    }else{
      switch(numero){
        case 1:
          letra = String.valueOf(numero);
          letra = "As";

        break;
        case 8:
          letra = String.valueOf(numero);
          letra = "Sota";
       
        break;
        case 9:
          letra = String.valueOf(numero);
          letra = "Caballo";
       
        break;
        case 10:
          letra = String.valueOf(numero);
          letra = "Rey";
          
        break;
        
      }
      System.out.print(letra + " de " + palo1);
    }
  }
}

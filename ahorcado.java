public class ahorcado{
  
  public static void main(String[] args){
    String[] palabras = {"UNO", "DOS", "TRES", "CUATRO","CINCO","SEIS","SIETE","OCHO","NUEVE","DIEZ"};
    char[] palabraElegida = eligePalabra(palabras);
    char[] palabraOculta;
    palabraOculta = palabraEnBlanco(palabraElegida.length);
    
    //presentaPalabra(palabraElegida);
    presentaPalabra(palabraOculta);
    
    System.out.println();
    System.out.println();
    int fallos = 5;
    char letraUsuario;
    do {
      System.out.print("Te quedan " + fallos + " intentos erróneos.");
      System.out.print("Introduzca una letra (0 para abandonar): ");
      letraUsuario = System.console().readLine().toUpperCase().charAt(0);
      
      boolean laLetraEsta;
      
      laLetraEsta = destapaLetra(palabraElegida, palabraOculta, letraUsuario);
      presentaPalabra(palabraOculta);
      if(letraUsuario != '0'){
        if(laLetraEsta == false){
          fallos--;
        }
      }
      
    }while ((!palabraDescubierta(palabraOculta)) && (fallos > 0) && (letraUsuario != '0'));
    
    if(palabraDescubierta(palabraOculta) == true){
      System.out.println("¡¡ Has ganado !!");
      
    } else if (fallos == 0) {
      System.out.println("Has agotado todas las vidas.");
    }
    
  }
  
  public static char[] eligePalabra (String[] palabras) {
    int elegida = (int)(Math.random()*palabras.length);
    char[] palabraElegida = new char[palabras[elegida].length()];
    
    for(int j=0; j<palabras[elegida].length(); j++){
      palabraElegida[j] = palabras[elegida].charAt(j);
    }
    return palabraElegida;
  }
  
  public static char[] palabraEnBlanco (int cantidadLetras) {
    char[] palabraBlanca = new char[cantidadLetras];
    
    for(int j=0; j<cantidadLetras; j++){
      palabraBlanca[j] = '_';
    }
    return palabraBlanca;
  }
  
  public static void presentaPalabra (char[] palabraAPresentar) {
    System.out.println();
    for(int i=0; i<palabraAPresentar.length; i++){
      System.out.print(palabraAPresentar[i] + " ");
    }
  }
  
  public static boolean palabraDescubierta (char[] palabra) {
    boolean letrasALaVista = true;
    for(int i=0; (i<palabra.length) && letrasALaVista ; i++){
      if(palabra[i] == '_'){
        letrasALaVista = false;
      } 
    }
    return letrasALaVista;
  }
  
  public static boolean destapaLetra (char[] palabraALaVista, char[] palabraEnJuego, char letra) {
    boolean laLetraEsta = false;
    
    for(int i=0; i<palabraALaVista.length; i++) {
      if(palabraALaVista[i] == letra){
        palabraEnJuego[i] = letra;
        laLetraEsta = true;
      }
    }
    
    return laLetraEsta;
  }
  
  
}

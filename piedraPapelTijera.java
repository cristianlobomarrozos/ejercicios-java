public class piedraPapelTijera {
  
  public static void main (String[] args) { 
    
    int ordenador = 0;
    int partidas;
    int contadorEmpate = 0;
    int contadorMaquina = 0;
    int contadorJugador = 0;
    String aux;
    String maquina;
    String jugador;
    
    
    
    
    System.out.print("Introduzca cuantas partidas desea hechar: ");
    partidas = Integer.parseInt(System.console().readLine());
    
    do {
      
      aux = Maquina(ordenador);
      maquina = aux;
      
      
      
      do {
        System.out.print("Introduzca cual quiere que sea su jugada(piedra, papel o tijera): ");
        jugador = System.console().readLine();
      } while (!((jugador.equals("piedra")) || (jugador.equals("papel")) || (jugador.equals("tijera"))));
      
      
      
      
      partidas--;
    } while (partidas > 0);
    
    System.out.println("Ha habido " + contadorJugador + " Victorias del jugador, " + contadorEmpate + " Empates, " + contadorMaquina + " Victorias de la máquina.");
    System.out.println();
    
    FinJuego (maquina, jugador, contadorEmpate, contadorJugador, contadorMaquina);
    
  }
  
  public static String Maquina (int ordenador) {
    ordenador = (int)(Math.random()*3);
    String aux;
    String maquina = "";
    
    switch (ordenador) {
      case 0:
        aux = "piedra";
        maquina = aux;
      break;
      case 1:
        aux = "papel";
        maquina = aux;
      break;
      case 2:
        aux = "tijera";
        maquina = aux;
      break;
    }
    return maquina;
  }
  
  public static void Contadores (String jugador, String maquina, int contadorEmpate, int contadorJugador, int contadorMaquina) {
    
    if (jugador.equals(maquina)) {
        contadorEmpate++;
      } else if ((jugador.equals("papel")) && (maquina.equals("piedra"))) {
        contadorJugador++;
      } else if ((jugador.equals("piedra")) && (maquina.equals("tijera"))) {
        contadorJugador++;
      } else if ((jugador.equals("tijera")) && (maquina.equals("papel"))) {
        contadorJugador++;
      } else if ((maquina.equals("papel")) && (jugador.equals("piedra"))) {
        contadorMaquina++;
      } else if ((maquina.equals("piedra")) && (jugador.equals("tijera"))) {
        contadorMaquina++;
      } else if ((maquina.equals("tijera")) && (jugador.equals("papel"))) {
        contadorMaquina++;
      }
  }
  
  public static void FinJuego (String maquina, String jugador, int contadorEmpate, int contadorJugador, int contadorMaquina) {
    
    if ((contadorMaquina > contadorJugador) && (contadorMaquina > contadorEmpate)) {
      System.out.println("Ha ganado la máquina.");
    } else if ((contadorMaquina < contadorJugador) && (contadorJugador > contadorEmpate)) {
      System.out.println("Ha ganado el jugador.");
    } else if ((contadorMaquina == contadorJugador) && (contadorMaquina == contadorEmpate)) {
      System.out.println("Ha habido un completo empate, es decir, mismos empates, mismas victorias para la máquina y mismas victorias para el jugador.");
    }
  }
}

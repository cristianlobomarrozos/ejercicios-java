public class ejercicio11{
  public static void main(String[] args){
    int numeroNotas;
    String notas = "";
    int contadorSuspenso = 0;
    int contadorSuficiente = 0;
    int contadorBien = 0;
    int contadorNotable = 0;
    int contadorSobresaliente = 0;
    
    for(int i=1; i<=20; i++){
      numeroNotas = (int)(Math.random()*5);
      switch(numeroNotas){
        case 0:
          notas = String.valueOf(numeroNotas);
          notas = "Suspenso";
          System.out.println(notas);
        break;
        case 1:
          notas = String.valueOf(numeroNotas);
          notas = "Suficiente";
          System.out.println(notas);
        break;
        case 2:
          notas = String.valueOf(numeroNotas);
          notas = "Bien";
          System.out.println(notas);
        break;
        case 3:
          notas = String.valueOf(numeroNotas);
          notas = "Notable";
          System.out.println(notas);
        break;
        case 4:
          notas = String.valueOf(numeroNotas);
          notas = "Sobresaliente";
          System.out.println(notas);
        break;
        
      }
      if(notas == "Suspenso"){
        contadorSuspenso++;
      }else if(notas == "Suficiente"){
        contadorSuficiente++;
      }else if(notas == "Bien"){
        contadorBien++;
      }else if(notas == "Notable"){
        contadorNotable++;
      }else{
        contadorSobresaliente++;
      }
    }
    System.out.println("Numero de suspensos: " + contadorSuspenso);
    System.out.println("Numero de suficientes: " + contadorSuficiente);
    System.out.println("Numero de bien: " + contadorBien);
    System.out.println("Numero de notables: " + contadorNotable);
    System.out.println("Numero de sobresalientes: " + contadorSobresaliente);
  
  }
}

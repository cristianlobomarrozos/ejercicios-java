import java.util.Scanner;

public class pedirHora{
  public static void main(String[] args){
    int horaDada;
    int minutosDados;
    int segundosDados;

    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca la hora:");
    horaDada = Integer.parseInt(s.nextLine());
    
    System.out.println("Introduzca los minutos:");
    minutosDados = Integer.parseInt(s.nextLine());
    
    System.out.println("Introduzca los segundos:");
    segundosDados = Integer.parseInt(s.nextLine());
    
    int Segundo = 0;
    int Minutos = 0;
    int Horas = 0;
    
      if(horaDada < 24){
        if(minutosDados < 60){
          if(segundosDados < 60){
            if(segundosDados == 59){
              Segundo = 0;
              Minutos = minutosDados + 1;
              Horas = horaDada;
                if(minutosDados == 59){
                  Segundo = 0;
                  Minutos = 0;
                  Horas = horaDada + 1;
                
                }
            
            }else{
              Horas = horaDada;
              Minutos = minutosDados;
              Segundo = segundosDados + 1;
            }
            if(Horas == 24){
              Horas = 0;
              Minutos = 0;
              Segundo = 0;
            }
            
            System.out.println("La hora será: " + Horas + "." + Minutos + "." + Segundo);
            
          }else {
              System.out.println("No se admiten mas de 59 segundos.");
            }
          
          }
          
            }else{
            System.out.println("No se admiten mas de 59 minutos");
          }
      }else{
        System.out.println("No se admiten mas de 23 horas");
      }
    }
}

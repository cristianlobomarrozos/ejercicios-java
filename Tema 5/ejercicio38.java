public class ejercicio38{
  public static void main(String[] args){
    int altura;
    int espacioBlanco = 0;
    int numeroSimbolo = 0;
    
    do{
      
      System.out.print("Introduzca la altura deseada del reloj de arena(impar y mayor o igual que 3): ");
      altura = Integer.parseInt(System.console().readLine());
    }while((altura<3) || ((altura%2)==0));
    numeroSimbolo=altura;
    for(int i=1; i<=altura; i++){
      for(int j=1; j<=espacioBlanco; j++){
        System.out.print(" ");
      }
      for(int j=1; j<=numeroSimbolo; j++){
        System.out.print("*");
        
      }
      espacioBlanco++;
      numeroSimbolo -= 2;
      System.out.println("");
    }
    espacioBlanco = altura/2;
    numeroSimbolo = 1;
    for(int i=0; i<=espacioBlanco; i++){
      System.out.print(" ");
      for (int j=1; j<=numeroSimbolo; j++){
        System.out.print("*");
        
      }
      
      numeroSimbolo+=2;
      System.out.println("");
    }
    
    
  }


}

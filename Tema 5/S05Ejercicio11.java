public class S05Ejercicio11{
  public static void main(String[] args){
    int numeroIntroducido;
    
    System.out.println("Introduzca el número: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    for(int i=numeroIntroducido;i < (numeroIntroducido+5);i++){
      System.out.printf("%3d %5d %7d\n",i,i*i,i*i*i);
    }
    
  }
}

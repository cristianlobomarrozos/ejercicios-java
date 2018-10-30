public class ejercicio7{
  public static void main(String[] args){
    int numero;
    String letra = "";
    int equipo = 0;
    int equipo1 = 30;
    
    for(int i=0; i<14; i++){
      numero = (int)(Math.random()*3);
      if((numero == 1) || (numero == 2)){
          switch(numero){ 
          case 0:
            numero = 1;
          break;
          case 2:
            numero = 2;
          break;
          }
        System.out.print("Equipo " + equipo);
        System.out.print(" contra ");
        System.out.print("Equipo " + equipo1);
        System.out.println(" = " +numero);
        equipo1 = equipo1 + equipo;
      }else{
        letra = String.valueOf(numero);
        letra = "X";
        System.out.print("Equipo " + equipo);
        System.out.print(" contra ");
        System.out.print("Equipo " + equipo1);
        System.out.println(" = " +letra);
      }
      equipo1--;
      equipo++;
    
    }
  }
}

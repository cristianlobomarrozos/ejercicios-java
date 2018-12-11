public class ejercicio{
  public static void main(String[] args){
    int[] jarra1 = new int[2];
    int[] jarra2 = new int[2];
    
    jarra1[0] = 7;
    jarra1[1] = 0;
    jarra2[0] = 5;
    jarra2[1] = 0;
    /*System.out.print("Introduzca la capacidad máxima de la jarra 1: ");
    jarra1[0] = Integer.parseInt(System.console().readLine());
    jarra1[1] = 0;
    
    System.out.print("Introduzca la capacidad máxima de la jarra 2: ");
    jarra2[0] = Integer.parseInt(System.console().readLine());
    jarra2[1] = 0;*/
    
    llenar(jarra1);
    traspasar(jarra1, jarra2); //quedan 2 litros en jarra1, 5 litros en jarra2
    vaciar(jarra1); 
    traspasar(jarra2,jarra1); //5 litros en jarra1, jarra2 vacía
    llenar(jarra2); //5 litros en cada una
    traspasar(jarra2,jarra1); //7 litros en jarra1, 3 litros en jarra2
    vaciar(jarra1); //jarra1 vacía, jarra2 3 litros
    traspasar(jarra2, jarra1); //3 litros en jarra1, jarra2 vacía
    llenar(jarra2); //3 litros en jarra1, 5 litros en jarra2
    traspasar(jarra2,jarra1); //jarra2 queda 1 litro
    
    System.out.println("Capacidad total: " + jarra2[0]);
    System.out.println("Capacidad ocupada: " + jarra2[1]);
    
  }
  
  public static void llenar(int[] jarra){
    jarra[1] = jarra[0];
  }
  
  public static void traspasar(int[] jarra1, int[] jarra2){
    jarra2[1] += jarra1[1];
    jarra1[1] = 0;
    if(jarra2[0]<jarra2[1]){
      jarra1[1] = jarra2[1] - jarra2[0];
      jarra2[1] = jarra2[0];
    }
  }
  public static void vaciar(int[] jarra){
    jarra[1] = 0;
  }
  
  
}


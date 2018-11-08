public class ejercicio13{
  public static void main(String[] args){
    int[] n = new int[100];
    
    int numero;
    int destacar;
    int menor;
    int mayor;
    
    for(int i=0; i<100; i++){
      numero = (int)(Math.random()*501);
      n[i] = numero;
      System.out.print(n[i] + " ");
      
    }
    System.out.println("");
    do{
      System.out.print("Si quiere destacar el mínimo, introduzca 1 y para máximo 2: ");
      destacar = Integer.parseInt(System.console().readLine());
    }while((destacar != 2) && (destacar != 1));
    System.out.println("");
    for(int i=0; i<100; i++){
      menor = n[0];
      mayor = n[0];
      
      if(destacar == 1){
        for(int j=0; i<100; i++){
          if(n[i] > menor){
            menor = menor;
          }else{
            menor = n[i];
          }
        }
        //System.out.print("**" + menor + "**");
      } else if(destacar == 2){
        
        for(int j=0; i<100; i++){
          if(n[i] < mayor){
            mayor = mayor;
          }else{
            mayor = n[i];
          }

        }
        //System.out.print("**" + mayor + "**");
      }else{
        System.out.print(n[i] + " ");
      }
      
                
          do{
          System.out.print(n[i] + " ");
          }while ((n[i] != mayor) || (n[i] != menor));
    }

  }

}

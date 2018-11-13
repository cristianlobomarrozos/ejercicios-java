public class ejercicio15{
  public static void main(String[] args){
    int tamaño = 10;
    int comensalesPorMesa = 4;
    int[] mesas = new int[tamaño];
    
    for(int i=0; i<tamaño; i++){
      mesas[i] = (int)(Math.random()*(comensalesPorMesa+1));
    }
    
    int grupoEntrante;
    
    do{
      
      System.out.print("Mesa nº:    ");
      //presentación del estado de ocupación
      for(int i=0; i<tamaño; i++) {
        System.out.printf("%3d",i+1);
        
      }
      System.out.println("");
      
      System.out.print("Ocupación:  ");
      for(int i=0; i<tamaño; i++) {
        System.out.printf("%3d",mesas[i]);
        
      }
      System.out.printf("\n\n");
      
      System.out.print("Introduzca el nº de personas del grupo: ");
      grupoEntrante = Integer.parseInt(System.console().readLine());
      if(grupoEntrante != -1){
        if(grupoEntrante > 4){
          System.out.println("Lo siento no admitimos grupos de " + grupoEntrante + ". Haga grupos de " + comensalesPorMesa + " personas como máximo e intente de nuevo.");
          
        }else{
          //buscar mesa vacia
          boolean grupoSentado = false;
          for(int i=0; (i<tamaño) && (grupoSentado == false); i++){
            if(mesas[i]==0){
              mesas[i] = grupoEntrante;
              grupoSentado = true;
              System.out.println("Por favor, siéntese en la mesa nº: " +(i+1));
              
            }
            
          }
          //en caso de no estar sentados, buscar un hueco
          if (grupoSentado == false){
            for(int i=0; (i<tamaño) && (grupoSentado == false); i++){
              if((mesas[i] + grupoEntrante) <= comensalesPorMesa){ //encontrar hueco
                mesas[i] += grupoEntrante;
                grupoSentado = true;
                System.out.print("Tendrán que compartir mesa. ");
                System.out.println("Por favor, siéntese en la mesa nº: " +(i+1));
              
              }
            
            }
          }
          //si no los hemos podido sentar, es que no hay hueco para ellos
          if (grupoSentado == false) {
            System.out.println("Lo siento, en estos momentos no queda sitio.");
          }
          
          System.out.printf("\n\n");
          
        }
      }
      
    }while(grupoEntrante != -1);
    
  }
}

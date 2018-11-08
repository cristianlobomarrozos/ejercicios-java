public class ejercicio15{
  public static void main(String[] args){
    int tamaño = 10;
    int[] mesas = new int[tamaño];
    
    for(int i=0; i<tamaño; i++){
      mesas[i] = (int)(Math.random()*5);
    }
    
    int grupoEntrante;
    
    do{
      System.out.print("Introduzca el nº de personas del grupo: ");
      grupoEntrante = Integer.parseInt(System.console().readLine());
      if(grupoEntrante != -1){
        if(grupoEntrante > 4){
          System.out.println("Lo siento no admitimos grupos de " + grupoEntrante + ". Haga gruposde 4 personas como máximo e intente de nuevo.");
          
        }else{
          //buscar mesa vacia
          boolean grupoSentado = false;
          for(int i=0; i<tamaño; i++){
            if(mesas[i]==0){
              mesas[i] = grupoEntrante;
              grupoSentado = true;
              System.out.println("Por favor, siéntese en la mesa nº: " +(i+1));
              i = tamaño;
            }
            
          }
          //en caso de no estar sentados, buscar un hueco
          
        }
        
      }
      
    }while(grupoEntrante != -1);
    
  }
}

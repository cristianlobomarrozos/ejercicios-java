public class sentenciaIfAnidada{
  public static void main(String[] args){
    String linea;
    
    System.out.println("Le voy a decir si el número introducido es cero, es par o impar.");
    System.out.println("Introduzca el nº: ");
    
    linea = System.console().readLine();
    
    int numero = Integer.parseInt(linea);
    
    if (numero == 0){
        System.out.println("El número que has introducido es CERO");
    
    }else if ((numero % 2) == 0){ //el numero es par
      
        //System.out.println("El número " + numero + " es par.");
        System.out.printf("El número %d es par.\n",numero);
      
     } else {
      
          System.out.printf("El número %d es impar.\n",numero);
     
     
        } 
    
  
  }
}  

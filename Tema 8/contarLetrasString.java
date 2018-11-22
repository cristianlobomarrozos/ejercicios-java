//Número de letras que hay en una cadena de caracteres.

public class contarLetrasString{
  public static void main(String[] args){
    String cadena;
    int tamanioCadena;      //almacenará la logitud del string
    char[] cadenaComoArray; //almacenará el string recogido como array
    char[] caractEnc = new char[100];   //almacenará los caracteres distintos que haya
    int[] frecCaracEnc = new int[100];              //almacenará las veces que un caracter aparece
    int cantCarEnc = 0;   //almacenará la cantidad de caracteres distintos encontrados
    
    
    System.out.print("Introduzca la cadena de caracteres cuyas letras deba contar: ");
    cadena = System.console().readLine();
    
    cadenaComoArray = new char[cadena.length()];
    
    tamanioCadena = convCadAArray (cadena, cadenaComoArray);
    
    inicializarFrecuencias(frecCaracEnc,100);
    
    cantCarEnc = conteoLetras(cadenaComoArray, tamanioCadena, caractEnc, frecCaracEnc);
    
    
    for(int i=0; i<tamanioCadena; i++){
      System.out.print(cadenaComoArray[i]);
    }
    
  }
  public static int convCadAArray (String cadena1, char[] array1) {
    int longitud = cadena1.length();
    
    array1 = new char[longitud];
    
    for(int i=0; i<longitud; i++){
      array1[i] = cadena1.charAt(i);
    }
    
    return longitud;
  }
  
  public static int conteoLetras (char[] arrayChar, int tam, char[] encontrados, char[] frecuencias) {
    int cuenta = 0;   //cuenta los caracteres distintos que vamos encontrando
    
    for(int i=0; i<tama; i++){
      //para cada letra del array encontrada, buscamos si está en el array encontrados.
      for(int j=0; (j<cuenta) && !loVeo; j++){
        boolean loVeo = false;
        if(arrayChar[i] == encontrados[j]){
          leVeo = true;
          frecuencias[j]++;
        }
      }
      if(!loVeo){
      cuenta++;
      encontrados[cuenta] = arrayChar[i];
      frecuencias[cuenta] = 1
      }
    }
    return cuenta;
    
  }
  
  public static void inicializarFrecuencias(frecCaracEnc, int);
}

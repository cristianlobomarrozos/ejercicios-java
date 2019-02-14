package palotes;

public class Palotes {
  public static String parsePalotes (int a) {
    
    int aux = a;
    int numDig = 0;
    int numReves = 0;
    while (aux > 0){
      numReves = ((numReves*10) + (aux % 10));
      aux /=10;
      numDig++;
    }
    int cifra = 0;
    String palotes = "";
    
    for (int i = 0; i < numDig; i++){
      cifra = numReves%10;
      numReves /= 10;
      for (int j = 0; j < cifra; j++){
        palotes = palotes + "|";
      }
      if (i < numDig-1){
        palotes = palotes + "-";
      }
    }
    return palotes;
  }
  
  public static int parseInt (String b) {
    int contador = 0;
    
    String[] aux;
    
    
  }
}

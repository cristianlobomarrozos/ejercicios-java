public class cambiar3porE{
  public static void main(String[] args){
    
    String resultado;
    for(int i=0; i<=9; i++){
      for(int j=0; j<=9; j++){
        for(int k=0; k<=9; k++){
          resultado = "";
          if(i==3){
            resultado += "E";
          }else{
            resultado += i;
          }
          if(j==3){
            resultado += "-E";
          }else{
            resultado += "-"+j;
          }
          if(k==3){
            resultado += "-E";
          }else{
            resultado += "-"+k;
          }
          System.out.print(resultado+"   ");
        }
        
      }
      
    }
    
  }
}

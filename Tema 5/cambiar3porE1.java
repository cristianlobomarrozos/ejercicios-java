public class cambiar3porE1{
  public static void main(String[] args){
    String uno ="";
    String dos ="";
    String tres ="";
    
    for(int i=0; i<=9; i++){
      if(i==3){
        uno = "E";
      }else{
        uno = Integer.toString(i);
      }
    
        for(int j=0; j<=9; j++){
          if(j==3){
            dos = "E";
          }else{
            dos = Integer.toString(j);
          }
        
          for(int k=0; k<=9; k++){
            if(k==3){
              tres ="E";
            }else{
              tres = Integer.toString(k);
            }
            System.out.print(uno + "-" + dos + "-" + tres + "   ");
          }
        }
    }
  }

}

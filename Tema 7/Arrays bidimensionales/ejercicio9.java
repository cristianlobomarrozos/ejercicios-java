public class ejercicio9{
  public static void main(String[] args){
    int[][] array = new int[12][12];
    int[][] arrayAux = new int[12][12];
    
    //rellenamos el primer array
    for(int i=0; i<12; i++){
      for(int j=0; j<12; j++){
        array[i][j] = (int)(Math.random()*100);
      }
    }
    System.out.println("Array: ");
    //mostramos el primer array
    for(int i=0; i<12; i++){
      for(int j=0; j<12; j++){
        System.out.printf("%4d",array[i][j]);
      }
      System.out.println();
    }
    
    System.out.println();
    //rellenamos el segundo array
    for(int i=0; i<12; i++){
      for(int j=0; j<12; j++){
        arrayAux[i][j] = (int)(Math.random());
      }
    }
    
    //rotamos el array
    for(int i=0; i<12; i++){
      for(int j=0; j<12; j++){
        if(((i==0) && (j==0)) || ((i==1) && (j==1)) || ((i==2) && (j==2)) || ((i==3) && (j==3)) || ((i==4) && (j==4)) || ((i==5) && (j==5))){
          arrayAux[i][j] = array[i+1][j];
        } else if(((i==6) && (j==6)) || ((i==7) && (j==7)) || ((i==8) && (j==8)) || ((i==9) && (j==9)) || ((i==10) && (j==10)) || ((i==11) && (j==11))){
          arrayAux[i][j] = array[i-1][j];
        } else if((i==0) && (j!=0)){
          arrayAux[i][j] = array[i][j-1];
        }else if((i==11) && (j!=0)){
          arrayAux[i][j] = array[i][j+1];
        } else if((i==11) && (j==0)){
          arrayAux[i][j] = array[i][j+1];
        } else if((i!=0) && (j==11)){
          arrayAux[i][j] = array[i-1][j];
        } else if((i!=0) && (j==0)){
          arrayAux[i][j] = array[i+1][j];
        }
      }
      
    }  
    
    /*//rotamos el array
    for(int i=0; i<12; i++){
      for(int j=0; j<12; j++){
        if(((i==0) && (j==0)) || ((i==1) && (j==1)) || ((i==2) && (j==2)) || ((i==3) && (j==3)) || ((i==4) && (j==4)) || ((i==5) && (j==5))){
          arrayAux[i][j] = array[i+1][j];
        }else if((i==0) && (j!=0)){
          arrayAux[i][j] = array[i][j-1];
        }else if((i==12) && (j!=0)){
          arrayAux[i][j] = array[i][j+1];
        }
      }
      
    } */
    
    //mostramos array rotado
    System.out.println("Array rotado: ");
    for(int i=0; i<12; i++){
      for(int j=0; j<12; j++){
        System.out.printf("%4d",arrayAux[i][j]);
      }
      System.out.println();
      System.out.println();
    }
    
  }
}

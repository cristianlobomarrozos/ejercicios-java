import java.util.Scanner;

public class numeroCapicua{
  public static void main(String[] args){
    int a;
    boolean capicua = false;
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca un número de 5 cifras máximo:");
    
    a = Integer.parseInt(s.nextLine());
    
      if(a > 99999){
        System.out.println("El número introducido es mayor de 5 cifras.");
        
      }
      
      if(a < 10){
        capicua = true;
        
      }
      if((a >= 10) && (a < 100)){
        if((a/10) == (a % 10)){
          capicua = true;
        }
      }  
      if((a >= 100) && (a < 1000)){
        if((a/100) == (a % 10)){
          capicua = true;
          
        }
      }  
      if((a >= 1000) && (a < 10000)){
        if((a/1000) == (a%10) && (((a / 100)%10) == ((a / 10)%10))){
          capicua = true;
        }
      }
      if((a >= 10000) && (a < 100000)){
        if((a/10000) == (a % 10) && (((a / 1000) % 10) == ((a / 10)%10))){
          capicua = true;
        }
      }
      
      if(capicua){
        System.out.println("El número es capicua.");
      }else{
        System.out.println("El número no es capicúa.");
      }
  }




}

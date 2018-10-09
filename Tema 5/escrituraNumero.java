public class escrituraNumero{
  public static void main(String[] args){
    System.out.print("Introduzca un numero del 0 al 99: ");
    String s = System.console().readLine();
    int numero = Integer.parseInt(s);
    
    String numeroTexto = "";
      
      switch (numero) {
    
    

      switch (numero/10){
        case 0:
          break;
        case 1:
          numeroTexto = "diez";
          break;
        case 2:
          numeroTexto = "veinte";
          break;
        case 3:
          numeroTexto = "treinta";
          break;
        case 4:
          numeroTexto = "cuarenta";
          break;
        case 5:
          numeroTexto = "cincuenta";
          break;
        case 6:
          numeroTexto = "sesenta";
          break;
        case 7:
          numeroTexto = "setenta";
          break;
        case 8:
          numeroTexto = "ochenta";
          break;
        case 9:
          numeroTexto = "noventa";
          break;
          default:
          
            if (numero > 20 && numero%10 != 0){
                numeroTexto = numeroTexto + " y ";
            }else{
              switch (numero){
                case 11:
              numeroTexto = "once";
                break;
              case 12:
              numeroTexto = "doce";
                break;
              case 13:
              numeroTexto = "trece";
                break;
              case 14:
              numeroTexto = "catorce";
                break;
              case 15:
              numeroTexto = "quince";
                break;
              case 16:
              numeroTexto = "dieciséis";
                break;
              case 17:
              numeroTexto = "diecisete";
                break;
              case 18:
              numeroTexto = "dieciocho";
                break;
              case 19:
              numeroTexto = "diecinueve";
                break;
                default;
              }
              
            } 
        System.out.println(numeroTexto);
      }
    
    
  }

}

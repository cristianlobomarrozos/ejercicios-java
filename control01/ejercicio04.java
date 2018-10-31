public class ejercicio04{
  public static void main(String[] args){
    float dineroInicial;
    float rentabilidadMensual; //entendiendo como &
    float dineroFinal;
    
    float cantidadMinMeses = 0;
    
    System.out.print("Introduzca la cantidad inicial de dinero: ");
    dineroInicial = Float.parseFloat(System.console().readLine());
    
    System.out.print("Introduzca la rentabilidad mensual (en %, sin simbolo %): ");
    rentabilidadMensual = Float.parseFloat(System.console().readLine());
    
    System.out.print("Introduzca la cantidad final de dinero: ");
    dineroFinal = Float.parseFloat(System.console().readLine());
    //rentabilidad ingresada "al final del periodo"
    
    float dineroActual = dineroInicial;
    
    while(dineroActual < dineroFinal){
      dineroActual  += dineroInicial*rentabilidadMensual/100;
      cantidadMinMeses++;
    }
    
    System.out.println("Necesitará " + cantidadMinMeses + " meses para llegar al dinero final indicado.");
  
  }
}

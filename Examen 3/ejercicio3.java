public class ejercicio3 {
  public static void main(String[] args) {
    double precio;
    int numUnidades;
    int codigo;
    double descuento = 0;
    double precioDescuento;
    double precioUnidades;
    double precioIVA;
    
    
    System.out.print("Introduzca el precio de la unidad: ");
    precio = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el nº de unidades que desee: ");
    numUnidades = Integer.parseInt(System.console().readLine());
    
    
    System.out.print("Introduzca el código de descuento: ");
    codigo = Integer.parseInt(System.console().readLine());
    
    descuento = Descuento(codigo, precio, numUnidades);
      
    precioUnidades = PrecioUnidades(precio,numUnidades);
    precioDescuento = PrecioConDescuento(descuento, precio, numUnidades);
      
    precioIVA = CalcularIVA(precioDescuento);
    double precioTotal = PrecioTotal(precioIVA,precioDescuento);
    
    System.out.println("A continuación, se le muestra el precio desglosado del pedido: ");
      
    System.out.println("----------------------------------------------------");
    System.out.printf("Precio del artículo:             %.2f €\n", precio);
    System.out.printf("Precio nº unidades:             %2d\n",numUnidades);
    System.out.printf("Precio total unidades:           %.2f €\n",(precio * numUnidades));
    System.out.printf("Descuento aplicado: Código:%3d   %.2f €\n",codigo,descuento);
    System.out.printf("Precio con descuento:            %.2f €\n",precioDescuento);
    System.out.print("IVA(21%): ");
    System.out.printf("                       %.2f €\n", precioIVA);
    System.out.println("----------------------------------------------------");
    System.out.printf("Precio final:                    %.2f €\n",precioTotal);   
    
  }
  
  
  public static double Descuento (int codigo, double precio, int numUnidades) {
    
    
    double descuento = 0; 
    switch (codigo) {
      case 685:
        if (precio*numUnidades >= 15) {
          descuento = 15;
        } else {
          descuento = precio*numUnidades;
        }
      break;
      case 778:
        if (numUnidades <= 20) {
          descuento =  (0.05 * precio * (double)(numUnidades));
        } else {
          descuento = (0.05 * precio * 20);
        }
      break;
      case 219:
        if (numUnidades > 5) {
          descuento = precio * 5;
        }
      break;
      
      default: descuento = 0;
    }
    
    return descuento;
  }
  
  public static double PrecioConDescuento (double descuento, double precio, int numUnidades) {
    precio = precio * numUnidades - descuento;
    
    return precio;
  }
  
  public static double CalcularIVA (double precio) {
    double precioIVA; 
    
    precio = precio * 0.21;
    
    precioIVA = precio;
    
    return precioIVA;
  }
  
  public static double PrecioTotal (double precioIVA, double precioDescuento) {
    double total = precioIVA + precioDescuento;
    
    return total;
  }
  
  public static double PrecioUnidades (double precio, int numUnidades)  {
    double precio1 = precio * (double)(numUnidades);
    
    return precio1;
  }
}

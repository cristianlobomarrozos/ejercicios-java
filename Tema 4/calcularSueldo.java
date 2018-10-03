public class calcularSueldo{
  public static void main(String[] args){
    
    int cargoEmpleado;
    int diasMesVisitasClientes;
    int estadoCivil;
    
    double sueldoBase = 0;
    double dietas;
    double retencionIRPF;
    int porcentajeIRPF;
    double sueldoBruto;
    
    System.out.println("1- Programador Junior.");
    System.out.println("2- Programador senior.");
    System.out.println("3- Jefe de proyecto.");
    System.out.print("Introduzca el cargo del empleado(1-3): ");
    
    String entrada = System.console().readLine();
    
    cargoEmpleado = Integer.parseInt(entrada);
    System.out.print("¿Cuantos dias ha estado visitando clientes?: ");
    entrada = System.console().readLine();
    diasMesVisitasClientes = Integer.parseInt(entrada);
    
    System.out.print("Introduzca su estado civil(1-soltero, 2-casado): ");
    entrada = System.console().readLine();
    estadoCivil = Integer.parseInt(entrada);
    
    switch (cargoEmpleado){
      case 1:
        sueldoBase = 950;
        
        break;
      case 2:
        sueldoBase = 1200;
      
        break;
      case 3:
        sueldoBase = 1600;
        
        break;
      default:
        sueldoBase = 0;
    }
    
    dietas = diasMesVisitasClientes * 30;
    
    sueldoBruto = sueldoBase + dietas;
    
    if (estadoCivil == 1){
      porcentajeIRPF = 25;
    }else {
      porcentajeIRPF = 20;
    }
      retencionIRPF = sueldoBruto * porcentajeIRPF/100.0;
    System.out.printf("========================================\n");
    System.out.printf("= Sueldo base                  %7.2f =\n",sueldoBase);
    System.out.printf("= Dietas (%2d viajes)           %7.2f =\n",diasMesVisitasClientes,dietas);
    System.out.printf("========================================\n");
    System.out.printf("= Sueldo bruto                 %7.2f =\n",sueldoBruto);
    System.out.printf("= Retencion IRPF (%2d%%)         %7.2f =\n",porcentajeIRPF,retencionIRPF);
    System.out.printf("========================================\n");
    System.out.printf("= Sueldo neto                  %7.2f =\n", sueldoBruto-retencionIRPF);
  }


}

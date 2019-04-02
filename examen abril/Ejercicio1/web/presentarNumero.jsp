<%-- 
    Document   : presentarNumero
    Created on : Apr 2, 2019, 10:14:21 AM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Presentación número</title>
    </head>
    <body>
      
        <!--MUESTRA LAS IMÁGENES EN ORDEN INVERSO, NO ME HA DADO TIEMPO A PONERLO EN EL ORDEN CORRESPONDIENTE-->
        
        <h1>Presentación del número en formato gráfico</h1>
        <p>El número <% int numero1 = Integer.parseInt(request.getParameter("numero")); out.print(numero1); %> visto como representación gráfica</p>
        <%
            int numero = Integer.parseInt(request.getParameter("numero"));
            int imagen;
            int aux = numero;
            int tama = 0;
            while (aux > 0) {
              aux = aux/10;
              tama++;
            }
            aux = numero;
            int[] array = new int[tama];
            while(aux>0) {
                for (int i=0; i<tama; i++){
                    array[i] = aux%10;
                    aux = aux/10;
                }
            }
            
            for (int i=0; i<tama; i++) {
                switch(array[i]) {
                    case 0:
                       out.print("<img src=" + "digitos/0.png" + ">"); 
                       break;
                    case 1:
                       out.print("<img src=" + "digitos/1.png>"); 
                       break;
                    case 2:
                       out.print("<img src=" + "digitos/2.png>"); 
                       break;
                    case 3:
                       out.print("<img src=" + "digitos/3.png>"); 
                       break;
                    case 4:
                       out.print("<img src=" + "digitos/4.png>"); 
                       break;
                    case 5:
                       out.print("<img src=" + "digitos/5.png>"); 
                       break;
                    case 6:
                       out.print("<img src=" + "digitos/6.png>"); 
                       break;
                    case 7:
                       out.print("<img src=" + "digitos/7.png>"); 
                       break;
                    case 8:
                       out.print("<img src=" + "digitos/8.png>"); 
                       break;
                    case 9:
                       out.print("<img src=" + "digitos/9.png>"); 
                       break;
                    default:
                       
                }
            }
            
            %>
    </body>
</html>

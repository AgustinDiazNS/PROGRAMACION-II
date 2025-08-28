
package programacionII.PracticoII;

import java.util.Scanner;

public class ActIX {   
    public static double CalcularEnvio(double peso,String zona){

      Boolean valid=true; 
      int costo=1;
       Scanner sc=new Scanner(System.in);
        while (valid){
          switch (zona) {
              case "N":
                  costo=5;
                  valid=false;
                  break;
              case "I":
                  costo=10;
                  valid=false;
                  break;
              default:
                  System.out.println("Error, elija una zona valida: Nacional (N) o internacional (I)");
                  zona=sc.nextLine();         
                  break;
          }
        }
        return costo*peso;
    }
         
    public static double calcularTotalCompra(double precioProducto, double
costoEnvio){
    double costototal=precioProducto+costoEnvio;
    return costototal;
    }  
        
         public static void main (String[] Args){
             
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Ingrese el precio base del prodcuto: ");
         double pb=sc.nextDouble();
         
        System.out.println("Ingrese el peso del producto: ");
        double p=sc.nextDouble();
        
         System.out.println("Ingrese la zona para calcular el costo: Nacional (N) o Internacional (I)");
         String zone=sc.nextLine();
         
         double costoenvio=CalcularEnvio(p,zone);
         
         double costototal=calcularTotalCompra(pb,costoenvio);
         
         System.out.println("El costo total de la compra con el envío es $"+costototal);
}
}

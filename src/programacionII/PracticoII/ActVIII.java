

package programacionII.PracticoII;
import java.util.Scanner;
public class ActVIII {
   
    public static double calcularPrecioFinal(double preciobase, double impuesto, double
descuento){
        double preciofinal=preciobase + (preciobase*(impuesto/100)) + (preciobase*descuento/100);
        return preciofinal;
    }
    public static void main(String[] Args){
        
        Scanner sc=new Scanner(System.in);
       
         System.out.println("Ingrese el precio base del producto: ");
        double pb=sc.nextDouble();
         System.out.println("Ingrese el impuesto del producto(en porcentaje): ");
        double imp=sc.nextDouble();
         System.out.println("Ingrese el impuesto del producto(en porcentaje): ");
        double dcto=sc.nextDouble();
        
        System.out.println("El precio final del producto es $" + calcularPrecioFinal(pb,imp,dcto));   
    }
}
    
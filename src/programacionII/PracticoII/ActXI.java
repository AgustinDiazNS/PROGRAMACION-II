
package programacionII.PracticoII;

import java.util.Scanner;
public class ActXI {
    public static double dctoglobal=0.1;
    
    public static void descuentoaplicado(double precio){
        double dcto=precio*dctoglobal;
        double precfinal= precio -dcto;
      System.out.println("El precio original es $" +precio);
      System.out.println("El descuento aplicado es de $" +dcto);
      System.out.println("El precio final es $" +precfinal);
    }
    
    public static void main (String[] Args){
        Scanner sc=new Scanner(System.in);
        
      System.out.println("Escriba el precio del producto: "); 
      
      double precio=sc.nextDouble();
      
      descuentoaplicado(precio);
      
    }           
}

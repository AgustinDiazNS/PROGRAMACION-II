
package programacionII.PracticoII;
import java.util.Scanner;

public class ActIV {
   public static void main(String[] Args){
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Ingrese el precio del producto: ");
       double precio=sc.nextDouble();
       boolean continuar=true;
       double descuento=1;
       while(continuar==true){
        System.out.println("Ingrese la categoría del producto(A,B o C): ");
        String categoria=sc.nextLine();
       switch(categoria){
           case"A":
               descuento=0.1;
               continuar=false;
               break;
           case "B":
               descuento=0.15;
               continuar=false;
               break;
           case "C":
               descuento=0.2;
               continuar=false;
               break;
           default:
               System.out.println("Error, categoría no válida. Intente nuevamente (A,B,C)");      
           }
       }
       double preciocondto=precio-precio*descuento;
       System.out.println("Precio original: $"+precio);
       System.out.println("Descuento aplicado: "+ descuento*100 +"%");
       System.out.println("Precio con descuento: $"+preciocondto);
   }      
   }

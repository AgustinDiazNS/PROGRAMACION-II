
package programacionII.PracticoII;
import java.util.Scanner;
public class ActX {
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevostock= stockActual -cantidadVendida+cantidadRecibida;
    return nuevostock;
    }
    
    public static void main(String[] Args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el stock actual: ");
        int sa=sc.nextInt();
        System.out.println("Ingrese la cantidad vendida: ");
        int cv=sc.nextInt();
        System.out.println("Ingrese la cantidad recibida: ");
        int cr=sc.nextInt();
        
        System.out.println("El stock actualizado es de "+ actualizarStock(sa,cv,cr) + " productos");
    }
}

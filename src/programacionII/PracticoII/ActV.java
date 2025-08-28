
package programacionII.PracticoII;
import java.util.Scanner;
public class ActV {
  public static void main(String[] Args){
      Scanner sc=new Scanner(System.in);
     System.out.println("Escriba un numero(0 para terminar): ");
     int num=1;
     int suma=0;
     while (num!=0){
         num=sc.nextInt();
        if (num%2==0){
            suma += num;
        }
        System.out.println("Escriba otro numero: ");
     }
     System.out.println("La suma de todos los numeros pares que escribiste es " + suma);
     }
 
}

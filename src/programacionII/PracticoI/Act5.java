
package programacionII.PracticoI;
import java.util.Scanner;
public class Act5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba un numero: ");
        int n1= sc.nextInt();
        System.out.println("Escriba otro numero: ");
        int n2=sc.nextInt();
        
        int suma = n1 + n2;
        int resta= n1-n2;
        int multiplicacion=n1*n2;
        double division=n1/n2;
        System.out.println("La suma de "+n1+ " y " +n2+" es "+suma);
        System.out.println("La resta de "+n1+ " y " +n2+" es "+resta);
        System.out.println("La multiplicación de "+n1+ " y " +n2+" es "+multiplicacion);
        System.out.println("La división de "+n1+ " y " +n2+" es "+division);
    }
    
}

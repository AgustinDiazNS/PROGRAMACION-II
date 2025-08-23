
package PRACTICO1;
import java.util.Scanner;

public class Act8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba un numero");
        int n1=sc.nextInt();
        System.out.println("Escriba un numero");
        int n2=sc.nextInt();
        int division= n1/n2;
        double n3= n1;
        double n4= n2;
        double divisiion=n3/n4;
        System.out.println("La division con enteros (int) es " + division);
         System.out.println("La division con decimales (double) es " + divisiion);

    }
}

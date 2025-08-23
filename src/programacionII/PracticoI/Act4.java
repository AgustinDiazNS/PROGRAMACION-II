
package PRACTICO1;
import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Escriba su nombre: ");
    String nombre = sc.nextLine();
    
    System.out.println("Escriba su edad: ");
    int edad = sc.nextInt();
    System.out.println("Su nombre es " + nombre);
    System.out.println("Su edad es: " + edad + " años");
    
    }
}

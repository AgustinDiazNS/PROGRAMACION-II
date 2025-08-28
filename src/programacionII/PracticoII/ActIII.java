
package programacionII.PracticoII;
import java.util.Scanner;
public class ActIII {
    public static void main(String[] Args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad=sc.nextInt();
        if (edad<12){
            System.out.println("Niño");
        }
        else if (edad>=12 && edad<18){
            System.out.println("Adolescente");
        }
        else if (edad>=18 && edad<60){
            System.out.println("Adulto");
        }
        else if (edad>=60){
            System.out.println("Adulto mayor");
        }
    }
}

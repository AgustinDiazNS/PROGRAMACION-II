
package programacionII.PracticoII;
import java.util.Scanner;
public class ActII {
     public static int EsMayor(int x,int y){
return (x<y)? y:x;
 }
public static void main (String[] Args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Escriba el primer numero: ");
    int num1=sc.nextInt();
    System.out.println("Escriba el segundo numero: ");
    int num2=sc.nextInt();
    System.out.println("Escriba el tercer numero: ");
    int num3=sc.nextInt();
 if (EsMayor(num1,num2)<num3){
     System.out.println("El numero "+ num3 + " es el mayor");
 }  
 else{
     System.out.println("El numero "+ EsMayor(num1,num2) + " es el mayor");
 }
 }
}

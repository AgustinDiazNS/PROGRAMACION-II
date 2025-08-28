
package programacionII.PracticoII;

import java.util.Scanner;

public class ActI {
  
    public static void main(String[] Args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Escriba el año que desea evaluar: ");
    int año=sc.nextInt();
    if ((año%4==0 && año%100!=0)||año%400==0){
        System.out.println("El año es "+año+ " bisciesto");
    }
    else{
        System.out.println("El año "+año+ " no es bisciesto");
    }
    }
}

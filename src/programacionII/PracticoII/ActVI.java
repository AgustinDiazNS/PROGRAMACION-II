
package programacionII.PracticoII;

import java.util.Scanner;

public class ActVI {

public static void main(String[] Args){
    Scanner sc=new Scanner(System.in);
    int cn=0;
    int cc=0;
    int cp=0;
    for (int i=1;i<=10;i++){
        System.out.println("Ingrese un numero entero: ");
        int num=sc.nextInt();
        if (num<0){
            cn++;
        }
        else if (num==0){
            cc++;
        }
        else{
            cp++;
        }
    }
System.out.println("Se ingresaron " +cp + " numeros positivos");
System.out.println("Se ingresaron " +cc + " ceros");
System.out.println("Se ingresaron " +cn + " numeros negativos");
}  
}


package programacionII.PracticoII;

import java.util.Scanner;

public class ActVII {
    public static void main(String[] Args){
       Scanner sc=new Scanner(System.in);
       int cont=0;
       System.out.println("Ingrese la nota que desea registrar");
     do {
         int nota=sc.nextInt();
         if (nota>11 || nota<0){
         System.out.println("Error, nota inválida, intente nuevamente");  
         }
         else{
             System.out.println("Nota registrada correctamente: " + nota);
             System.out.println("Ingrese la siguiente");
             cont++;
         } 
     } while(cont<10);
    }
}

     
    


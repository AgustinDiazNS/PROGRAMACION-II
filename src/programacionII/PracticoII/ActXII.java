
package programacionII.PracticoII;
import java.util.Scanner;

public class ActXII {
    
    public static void main (String[] Args){
        
        Scanner sc=new Scanner(System.in);
        
        double[] precios={300,500,600,1500,400};
        String[] productos={"grasa","bifes","achuras","costillas","higado"};
        double[] preciosn=new double[5];
        System.out.println("Escriba los precios que desea actualizar:");
        System.out.println();
       
        System.out.println("Precios originales:");       
        for (int i=0;i<5;i++){
            System.out.println(productos[i] + ": $" + precios[i]);
            System.out.println("Coloque el nuevo precio(escriba \"-1\"si desea no actualizarlo)");
          double precion=sc.nextDouble();
          if(precion>=0){
              preciosn[i]=precion;
              System.out.println("PRECIO ACTUALIZADO CORRECTAMENTE.");
          }     
          else{
              preciosn[i]=precios[i];
              System.out.println("EL PRECIO SE MANTUVO.");
          }
        }
        System.out.println("PRECIOS ORIGINALES:");
        for (int i=0;i<5;i++){
            System.out.println("\t*"+ productos[i] + ": $" + precios[i]);     
        }
        System.out.println("PRECIOS MODIFICADOS:");
        for (int i=0;i<5;i++){
            System.out.println("\t*"+productos[i] + ": $" + preciosn[i]);     
        }  
    }      
}

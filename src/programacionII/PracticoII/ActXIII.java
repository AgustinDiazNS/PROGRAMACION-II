
package programacionII.PracticoII;
import java.util.Scanner;

public class ActXIII {
    
    public static double[] modificarprecios(double[] preciosviejos, int longitud,String[] productos, Scanner sc){    
        if(longitud<0){
            return preciosviejos;
                    }    
            System.out.println("Escriba el nuevo precio del producto:\n"+productos[longitud]);
            double producto=sc.nextDouble();
            preciosviejos[longitud]=producto;
            System.out.println("Precio registrado correctamente");
            modificarprecios(preciosviejos,longitud-1,productos,sc);
            return preciosviejos;
    }
    
    public static void main (String[] Args){
        Scanner sc=new Scanner(System.in);
        
        double[] preciosorig={500,150,1500,200,300};
        String[] productos={"detergente","limpiavidrio","perfumina","lavandina","alcohol"};
       double[] preciosn=modificarprecios(preciosorig,4,productos,sc);
       
       System.out.println("PRECIOS ANTIGUOS");
   int i;
      for (i=0;i<productos.length;i++){
   System.out.println("\t*"+productos[i]+": $"+preciosorig[i]);
   System.out.println("PRECIOS MODIFICADOS");
      }
      for (i=0;i<productos.length;i++){
   System.out.println("\t*"+productos[i]+": $"+ preciosn[i]);
}
    }
}



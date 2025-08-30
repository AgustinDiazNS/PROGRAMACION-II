
package programacionII.PracticoIII;

import programacionII.utilidades.fb;
import java.util.Scanner;
public class ActV {
    public static class nave{
    String nombre;
    double combustible;
    double distancia;
    
   boolean cargarcombustible(double lts){
       fb.msj("Usted tiene:",this.combustible,"lts","\n");
       if(lts<0){
           fb.msj("Ingrese una cantidad válida","\n");
           return false;
       }
       else if (lts>1500){
           fb.msj("Límite superado(1500 lts). Como maximo puede cargar",1500-this.combustible,"lts.","\n");
           return false;
       }
       else{
           this.combustible+=lts;
           fb.msj("Ahora se tiene un combustible de",this.combustible,"lts","\n");
           return true;
       }
   }
   boolean despegar(){
       if(this.combustible>=100){
           this.combustible-=100;
           return true;
               }
       else{
           fb.msj("Combustible insuficiente para despegar","\n","Se necesita más de 100 lts para el despegue","\n");
           
           return false;
   }
   }
   double avanzar(double distancia){
      if(this.combustible>distancia*0.2&this.despegar()&distancia>0){
           this.combustible-=distancia*0.2;
           return this.combustible;
       } 
       fb.msj("Queda un total de combustible de:",this.combustible,"lts ","\n");
       return this.combustible;
       }
   
   void mostrardatos(){
       fb.msj("Nombre:",this.nombre,"\n","Combustible disponible:",this.combustible,"lts","\n","Distancia recorrida:",distancia,"\n");
   } 
   
    }
    
      public static void main(String[] Args){
       Scanner sc=new Scanner(System.in);
       nave n=new nave();
       
       n.combustible=50.0;
       n.nombre="Rayo";
       double lts;
       
       
       while (!n.despegar()){
           fb.msj("Ingrese la cantidad de combustible que desea cargar(maximo 1500lts): ","\n");
           lts=sc.nextDouble();
           n.cargarcombustible(lts);
       }
       fb.msj("Despegue exitoso ¿Que distancia desea recorrer?","\n");
       n.distancia=sc.nextDouble();
       n.avanzar(n.distancia);
       
       n.mostrardatos();
               
   }
}


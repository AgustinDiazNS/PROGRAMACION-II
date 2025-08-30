
package programacionII.PracticoIII;
import programacionII.utilidades.fb;

public class ActIV {
 
    public static class Gallina{
        int huevos;
        int edad;
        String idgall;
        
      void envejecer(int años){
          this.edad+=años;
      } 
        
      void ponerhuevo(int dias){
          this.huevos+=dias;
      }
      
       public void mostrarinfo(){
         fb.msj("La informacion de la gallina solicitada es:","\n","Huevos puestos:",this.huevos,"\n","Edad:",this.edad,"\n","ID",this.idgall,"\n");   
        }
      }
    
    public static void main(String[] Args){
        Gallina g1=new Gallina();
        Gallina g2=new Gallina();
        
        g1.idgall="Turuleca";
        g2.idgall="Flavia";
        
        g1.huevos=3;
        g2.huevos=1;
        
        g1.edad=3;
        g2.edad=2;
        g1.mostrarinfo();
        g2.mostrarinfo();
        int i;
        fb.msj("Pasaron...","\n");
        for (i=0;i<=4;i++){
            fb.msj(i,"\n");
        }
        fb.msj(i,"años","\n");
        int dias=i*365;
        g1.envejecer(i);
        g1.ponerhuevo(dias);
        g2.envejecer(i);
        g2.ponerhuevo(dias);
          g1.mostrarinfo();
          g2.mostrarinfo();
        }
    }
    
    
   


package programacionII.PracticoIII;
import programacionII.utilidades.fb;

public class ActI {
    
    public static class Estudiante{
        String nombre;
        String apellido;
        String curso;
        double calificacion;
        void mostrarinfo(){
           fb.msj("Su nombre es:",nombre,"\n");
           fb.msj("Su apellido es:",apellido,"\n");
           fb.msj("Su curso es:",curso,"\n");
           fb.msj("Su calificacion es:",calificacion,"\n");
        }
        double subircalificacion(double puntos){
            this.calificacion=calificacion+puntos;
            return calificacion;
        }
        double bajarcalificacion(double puntos){
            this.calificacion=calificacion-puntos;
            return calificacion;
        }
    }
    
   public static void main(String[] Args){  
       Estudiante e1=new Estudiante();
       e1.nombre="Francisco";
       e1.apellido="Vargas";
       e1.curso="6B";
       e1.calificacion=5;
       e1.mostrarinfo();
       e1.subircalificacion(5);
       fb.msj("La nueva calificacion del alumno",e1.nombre,e1.apellido,"es",e1.calificacion,"\n");
       e1.bajarcalificacion(3);
       fb.msj("La nueva calificacion del alumno",e1.nombre,e1.apellido,"es",e1.calificacion);
   }
}

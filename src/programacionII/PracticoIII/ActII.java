
package programacionII.PracticoIII;

import programacionII.utilidades.fb;
public class ActII {
   
    public static class Mascotas{
        String nombre;
        String especie;
        int edad;
        void mostrarinfo(){
            fb.msj("El nombre es:",nombre,"\n","La edad es:",edad,"años","\n","La especie es",especie,"\n");
        }
         int cumpliraños(int años){
            this.edad=edad+años;
            return this.edad;
        }
    }
    
    public static void main(String[] Args){
        Mascotas perro=new Mascotas();
        perro.nombre="Pancho";
        perro.edad=5;
        perro.especie="Beagle";
        fb.msj("La informacion de",perro.nombre,"es","\n");
        perro.mostrarinfo();
        fb.msj("Pasan","\n","1","\n","2","\n","3 años");
        perro.cumpliraños(3);
        fb.msj("\n","La nueva información de",perro.nombre,"es\n");
        perro.mostrarinfo();
    }
}

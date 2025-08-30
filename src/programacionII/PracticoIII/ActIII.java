
package programacionII.PracticoIII;
import programacionII.utilidades.fb;
import java.util.Scanner;
public class ActIII {
    public static class Libro{
        private String titulo;
        private String autor;
        private int añopubli;
        public String Gettitulo(){
        return titulo;
    }
        public void settitulo(String titulo){
            this.titulo=titulo;
        }
        public String getautor(){
        return autor;
    }
        public void setautor(String autor){
            this.autor=autor;
        }
        public int Getaño(){
        return añopubli;
    }
        public boolean setaño(int año){
            if (año>=1800){
                this.añopubli=año;
                return true;
            }
            else{
                fb.msj("Error, fecha inváida, intente nuevamente.\n");
                return false;
            }
    }
    public void mostrarinfo(){
         fb.msj("La informacion del libro solicitado es:","\n","Titulo:",this.titulo,"\n","Autor:",this.autor,"\n","Año de publicación:",this.añopubli,"\n");   
        }
}
    
    public static void main(String[] Args){
        Scanner sc= new Scanner(System.in);
        Libro l1=new Libro();
        l1.settitulo("ProgramacionII");
        l1.setautor("Edgar Allan Poe");   
        int k;
     do{
        fb.msj("\nIngrese el año de publicación: ");
        k=sc.nextInt();
    } 
     while(!l1.setaño(k));
     
     l1.mostrarinfo();
    }  
}
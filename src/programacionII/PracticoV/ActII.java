
package programacionII.PracticoV;

public class ActII {
    
    public static class celular{
        private bateria bateria;
        private String marca;
        private int imei;
        private String modelo;
        private usuario usuario;
        
        public celular(String marca, int imei,String modelo, bateria bateria){
            this.bateria=bateria;
            this.marca=marca;
            this.modelo=modelo;
            this.imei=imei;
        }
        public void setusuario(usuario u){
        this.usuario=u;
        u.setcelular(this);
        }
        @Override
        public String toString(){
            return "Marca: "+this.marca+" Modelo: "+this.modelo+ " IMEI: "+this.imei+ " Bateria: " + this.bateria;
    }
    }
    public static class bateria{
        private String modelo;
        private int capacidad;
        
        public bateria(String modelo,int capacidad){
            this.modelo=modelo;
            this.capacidad=capacidad;
        }
        @Override
        public String toString(){
        return "BATERIA MODELO: "+this.modelo+" CAPACIDAD: "+this.capacidad;
        }
        }
    
    public static class usuario{
        private String nombre;
        private int DNI;
        private celular celular;
       public usuario(String nombre,int DNI){
           this.DNI=DNI;
           this.nombre=nombre;
       }
           public void setcelular(celular C){
           this.celular=C;
           }
           
           @Override
        public String toString(){
        return "Nombre: "+this.nombre+" DNI: "+this.DNI;
        }
           
       }
public static void main(String[] Args){
    bateria b=new bateria("Li-ion",1200);
    celular c=new celular("Samsung",111111111,"A10",b);
    usuario u=new usuario("Agustin",45699971);
    u.setcelular(c);
    c.setusuario(u);
    
    System.out.println(u+" "+" "+c);
}    
}



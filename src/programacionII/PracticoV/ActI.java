
package programacionII.PracticoV;

public class ActI {

    public static class pasaporte{
        
         private foto foto;
         private String fechaemision;
         private int numero;
        private titular titular;
        public pasaporte(String fechaemision,int numero,String imagen,String formato){
            this.foto=new foto(imagen,formato);
            this.fechaemision=fechaemision;
            this.numero=numero;
    }
        public void settitular(titular T){
            this.titular=T;
            this.titular.settpasaporte(this);
        }
   public foto getfoto(){
        return foto;
    }
   public String fechaemision(){
        return fechaemision;
    }
    public int numero(){
        return numero;
    }
    public titular gettitultar(){
        return titular;
    }
      @Override
    public String toString() {
    return "Pasaporte numero: " + this.numero;
}
    }
        
    public static class foto{
      private String imagen;
      private String formato;
      
      public foto(String imagen,String formato){
          this.imagen=imagen;
          this.formato=formato;
      }
     public String getformato(){
         return formato;
     }   
     public String getimagen(){
         return imagen;
     }
    }

    public static class titular{
        private String nombre;
        private int DNI;
        private pasaporte pasaporte;
        
        public titular(String nombre,int dni){
            this.DNI=dni;
            this.nombre=nombre;
        }
        
    public void settpasaporte(pasaporte PASAPORTE){
        this.pasaporte=PASAPORTE;
    }
   
        public pasaporte getpasaporte(){
        return pasaporte;
        
        
    }
        @Override
    public String toString() {
    return "Nombre: " + this.nombre + " DNI: " + this.DNI;
}
    }
    
    public static void main (String[] Args){
        pasaporte p=new pasaporte("10/10/25",12345,"cara","jpg");
        System.out.println("La foto del pasaporte es: "+ p.getfoto().getimagen()+ " y el formato es: "+ p.getfoto().getformato());        
        titular t=new titular("Maximiliano",46988124);
        t.settpasaporte(p);
        p.settitular(t);
        
        System.out.println("El titular del pasaporte es "+t+" El cual esta asociado al pasaporte: "+p);
    }
    
    }

    

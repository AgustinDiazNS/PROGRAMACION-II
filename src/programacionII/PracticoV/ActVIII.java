
package programacionII.PracticoV;

public class ActVIII {
     public static class Documento {
        private String titulo;
        private String contenido;
        private FirmaDigital firma; 

        public Documento(String titulo, String contenido, String codigoHash, String fecha) {
            this.titulo = titulo;
            this.contenido = contenido;
            this.firma = new FirmaDigital(codigoHash, fecha);
        }

        public String getTitulo() { 
            return titulo; }
        public String getContenido() { 
            return contenido; }
        public FirmaDigital getFirma() { 
            return firma; }
    }

    public static class FirmaDigital {
        private String codigoHash;
        private String fecha;
        private Usuario usuario; 

        public FirmaDigital(String codigoHash, String fecha) {
            this.codigoHash = codigoHash;
            this.fecha = fecha;
        }

        public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
        }

        public String getCodigoHash() { 
            return codigoHash; }
        public String getFecha() { 
            return fecha; }
        public Usuario getUsuario() { 
            return usuario; }
    }

    public static class Usuario {
        private String nombre;
        private String email;

        public Usuario(String nombre, String email) {
            this.nombre = nombre;
            this.email = email;
        }

        public String getNombre() { 
            return nombre; }
        public String getEmail() { 
            return email; }
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Marti", "marti@gmail.com");
        Documento doc = new Documento("Contrato", "Contenido importante", "ABC123HASH", "02/10/2025");

        doc.getFirma().setUsuario(usuario);

        System.out.println("Documento: " + doc.getTitulo());
        System.out.println("Contenido: " + doc.getContenido());
        System.out.println("Firma Hash: " + doc.getFirma().getCodigoHash() + " - Fecha: " + doc.getFirma().getFecha());
        System.out.println("Usuario que firmó: " + doc.getFirma().getUsuario().getNombre() + " - Email: " + doc.getFirma().getUsuario().getEmail());
    }
}

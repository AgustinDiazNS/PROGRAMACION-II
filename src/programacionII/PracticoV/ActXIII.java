
package programacionII.PracticoV;


public class ActXIII {
    public static class CodigoQR {
        private String valor;
        private Usuario usuario;

        public CodigoQR(String valor, Usuario usuario) {
            this.valor = valor;
            this.usuario = usuario;
        }

        public String getValor() { 
            return valor; }
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

    public static class GeneradorQR {
        public CodigoQR generar(String valor, Usuario usuario) {
            CodigoQR qr = new CodigoQR(valor, usuario);
            return qr;
        }
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Marti", "marti@gmail.com");
        GeneradorQR generador = new GeneradorQR();

        CodigoQR qr = generador.generar("http/ejemplo.com", usuario);

        System.out.println("QR generado: " + qr.getValor() + " para usuario: " + qr.getUsuario().getNombre());
    }
}

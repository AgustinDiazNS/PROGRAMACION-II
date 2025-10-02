
package programacionII.PracticoV;

public class ActXI {
 public static class Cancion {
        private String titulo;
        private Artista artista;

        public Cancion(String titulo, Artista artista) {
            this.titulo = titulo;
            this.artista = artista;
        }

        public String getTitulo() { 
            return titulo; }
        public Artista getArtista() { 
            return artista; }
    }

    public static class Artista {
        private String nombre;
        private String genero;

        public Artista(String nombre, String genero) {
            this.nombre = nombre;
            this.genero = genero;
        }

        public String getNombre() {
            return nombre; }
        public String getGenero() { 
            return genero; }
    }

    public static class Reproductor {
        public void reproducir(Cancion cancion) {
            System.out.println("Reproduciendo: " + cancion.getTitulo() + " de " + cancion.getArtista().getNombre() + " (" + cancion.getArtista().getGenero() + ")");
        }
    }

    public static void main(String[] args) {
        Artista artista = new Artista("Coldplay", "Rock");
        Cancion cancion = new Cancion("Yellow", artista);

        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
    }    
}

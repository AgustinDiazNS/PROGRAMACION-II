
package programacionII.PracticoV;

public class ActXIV {
  public static class Render {
        private String formato;
        private Proyecto proyecto;

        public Render(String formato, Proyecto proyecto) {
            this.formato = formato;
            this.proyecto = proyecto;
        }

        public String getFormato() { 
            return formato; }
        public Proyecto getProyecto() {
            return proyecto; }
    }

    public static class Proyecto {
        private String nombre;
        private int duracionMin;

        public Proyecto(String nombre, int duracionMin) {
            this.nombre = nombre;
            this.duracionMin = duracionMin;
        }

        public String getNombre() { 
            return nombre; }
        public int getDuracionMin() { 
            return duracionMin; }
    }

    public static class EditorVideo {
        public Render exportar(String formato, Proyecto proyecto) {
            Render render = new Render(formato, proyecto);
            return render;
        }
    }

    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("VideoTutorial", 15);
        EditorVideo editor = new EditorVideo();

        Render render = editor.exportar("MP4", proyecto);

        System.out.println("Render exportado en formato: " + render.getFormato() + " del proyecto: " + render.getProyecto().getNombre());
    }
}

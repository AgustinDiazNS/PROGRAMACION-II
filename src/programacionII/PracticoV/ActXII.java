
package programacionII.PracticoV;


public class ActXII {
    public static class Impuesto {
        private double monto;
        private Contribuyente contribuyente;

        public Impuesto(double monto, Contribuyente contribuyente) {
            this.monto = monto;
            this.contribuyente = contribuyente;
        }

        public double getMonto() { 
            return monto; }
        public Contribuyente getContribuyente() { 
            return contribuyente; }
    }

    public static class Contribuyente {
        private String nombre;
        private String cuil;

        public Contribuyente(String nombre, String cuil) {
            this.nombre = nombre;
            this.cuil = cuil;
        }

        public String getNombre() { 
            return nombre; }
        public String getCuil() { 
            return cuil; }
    }

    public static class Calculadora {
        public void calcular(Impuesto impuesto) {
            System.out.println("Calculando impuesto de " + impuesto.getContribuyente().getNombre() + " por $" + impuesto.getMonto());
        }
    }

    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Agustín", "20-12345678-9");
        Impuesto impuesto = new Impuesto(5000, contribuyente);

        Calculadora calc = new Calculadora();
        calc.calcular(impuesto);
    }
    }


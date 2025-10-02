
package programacionII.PracticoV;
public class ActVII {
    public static class Vehiculo {
        private String patente;
        private String modelo;
        private Motor motor; 
        private Conductor conductor;

        public Vehiculo(String patente, String modelo, Motor motor) {
            this.patente = patente;
            this.modelo = modelo;
            this.motor = motor;
        }

        public void setConductor(Conductor conductor) {
            this.conductor = conductor;
            conductor.setVehiculo(this);
        }

        public String getPatente() { 
            return patente; }
        public String getModelo() { 
            return modelo; }
        public Motor getMotor() { 
            return motor; }
        public Conductor getConductor() { 
            return conductor; }
    }

    public static class Motor {
        private String tipo;
        private String numeroSerie;

        public Motor(String tipo, String numeroSerie) {
            this.tipo = tipo;
            this.numeroSerie = numeroSerie;
        }

        public String getTipo() {
            return tipo; }
        public String getNumeroSerie() { 
            return numeroSerie; }
    }

    public static class Conductor {
        private String nombre;
        private String licencia;
        private Vehiculo vehiculo;

        public Conductor(String nombre, String licencia) {
            this.nombre = nombre;
            this.licencia = licencia;
        }

        public void setVehiculo(Vehiculo vehiculo) {
            this.vehiculo = vehiculo;
        }

        public String getNombre() { 
            return nombre; }
        public String getLicencia() { 
            return licencia; }
        public Vehiculo getVehiculo() { 
            return vehiculo; }
    }

    public static void main(String[] args) {
        Motor motor = new Motor("V6", "MTR12345");
        Conductor conductor = new Conductor("Agustín", "LIC98765");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota Corolla", motor);

        vehiculo.setConductor(conductor);

        System.out.println("Vehículo: " + vehiculo.getModelo() + " - Patente: " + vehiculo.getPatente());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo() + " - Serie: " + vehiculo.getMotor().getNumeroSerie());
        System.out.println("Conductor: " + conductor.getNombre() + " - Licencia: " + conductor.getLicencia());
    }
}
    

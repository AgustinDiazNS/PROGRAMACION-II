
package programacionII.PracticoV;

public class ActIX {
 public static class CitaMedica {
        private String fecha;
        private String hora;
        private Paciente paciente;       
        private Profesional profesional; 

        public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
            this.fecha = fecha;
            this.hora = hora;
            this.paciente = paciente;
            this.profesional = profesional;
        }

        public String getFecha() { 
            return fecha; }
        public String getHora() { 
            
            return hora; }
        public Paciente getPaciente() {
            return paciente; }
        public Profesional getProfesional() { 
            return profesional; }
    }

    public static class Paciente {
        private String nombre;
        private String obraSocial;

        public Paciente(String nombre, String obraSocial) {
            this.nombre = nombre;
            this.obraSocial = obraSocial;
        }

        public String getNombre() { 
            return nombre; }
        public String getObraSocial() {
            return obraSocial; }
    }

    public static class Profesional {
        private String nombre;
        private String especialidad;

        public Profesional(String nombre, String especialidad) {
            this.nombre = nombre;
            this.especialidad = especialidad;
        }

        public String getNombre() { 
            return nombre; }
        public String getEspecialidad() { 
            return especialidad; }
    }

    public static void main(String[] args) {
        Paciente paciente = new Paciente("Agustín", "OSDE");
        Profesional prof = new Profesional("Dra. López", "Cardiología");

        CitaMedica cita = new CitaMedica("10/10/2025", "10:30", paciente, prof);

        System.out.println("Cita Médica");
        System.out.println("Paciente: " + cita.getPaciente().getNombre() + " - Obra Social: " + cita.getPaciente().getObraSocial());
        System.out.println("Profesional: " + cita.getProfesional().getNombre() + " - Especialidad: " + cita.getProfesional().getEspecialidad());
        System.out.println("Fecha: " + cita.getFecha() + " - Hora: " + cita.getHora());
    }   
}

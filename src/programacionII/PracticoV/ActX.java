
package programacionII.PracticoV;

public class ActX {
    public static class CuentaBancaria {
        private String cbu;
        private double saldo;
        private ClaveSeguridad clave; 
        private Titular titular;

        public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
            this.cbu = cbu;
            this.saldo = saldo;
            this.clave = new ClaveSeguridad(codigo, ultimaModificacion);
        }

        public void setTitular(Titular titular) {
            this.titular = titular;
            titular.setCuenta(this);
        }

        public String getCbu() { 
            return cbu; }
        public double getSaldo() {
            return saldo; }
        public ClaveSeguridad getClave() { 
            return clave; }
        public Titular getTitular() { 
            return titular; }
    }

    public static class ClaveSeguridad {
        private String codigo;
        private String ultimaModificacion;

        public ClaveSeguridad(String codigo, String ultimaModificacion) {
            this.codigo = codigo;
            this.ultimaModificacion = ultimaModificacion;
        }

        public String getCodigo() { 
            return codigo; }
        public String getUltimaModificacion() { 
            return ultimaModificacion; }
    }

    public static class Titular {
        private String nombre;
        private int dni;
        private CuentaBancaria cuenta;

        public Titular(String nombre, int dni) {
            this.nombre = nombre;
            this.dni = dni;
        }

        public void setCuenta(CuentaBancaria cuenta) {
            this.cuenta = cuenta;
        }

        public String getNombre() { return nombre; }
        public int getDni() { 
            return dni; }
        public CuentaBancaria getCuenta() { 
            return cuenta; }
    }

    public static void main(String[] args) {
        Titular titular = new Titular("Agustín", 12345678);
        CuentaBancaria cuenta = new CuentaBancaria("12345678901234567890", 10000.50, "ABC123", "01/10/2025");

        cuenta.setTitular(titular);

        System.out.println("Titular: " + titular.getNombre() + " - DNI: " + titular.getDni());
        System.out.println("CBU: " + cuenta.getCbu() + " - Saldo: $" + cuenta.getSaldo());
        System.out.println("Clave: " + cuenta.getClave().getCodigo() + " - Última Modificación: " + cuenta.getClave().getUltimaModificacion());
    }  
}

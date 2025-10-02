
package programacionII.PracticoV;


public class ActIV {
   
    public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco; // Agregación

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        cliente.setTarjeta(this);
    }

    public String getNumero() { 
        return numero; }
    public String getFechaVencimiento() {
        return fechaVencimiento; }
    public Cliente getCliente() { 
        return cliente; }
    public Banco getBanco() {
        return banco; }
}

// Cliente.java
public class Cliente {
    private String nombre;
    private int dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getNombre() {
        return nombre; }
    public int getDni() {
        return dni; }
    public TarjetaDeCredito getTarjeta() { 
        return tarjeta; }
}

// Banco.java
public class Banco {
    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() { 
        return nombre; }
    public String getCuit() {
        return cuit; }
}


}

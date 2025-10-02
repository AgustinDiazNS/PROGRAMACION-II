
package programacionII.PracticoV;

public class ActVI {
    public class Reserva {
    private String fecha;
    private String hora;
    private ClienteReserva cliente;   
    private Mesa mesa;               

    public Reserva(String fecha, String hora, ClienteReserva cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public String getFecha() { 
        return fecha; }
    public String getHora() { 
        return hora; }
    public ClienteReserva getCliente() { 
        return cliente; }
    public Mesa getMesa() { 
        return mesa; }
}


public class ClienteReserva {
    private String nombre;
    private String telefono;

    public ClienteReserva(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() { 
        return nombre; }
    public String getTelefono() { 
        return telefono; }
}

public class Mesa {
    private int numero;
    private int capacidad;

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public int getNumero() { 
        return numero; }
    public int getCapacidad() {
        return capacidad; }
}
    
}

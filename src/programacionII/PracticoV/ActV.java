
package programacionII.PracticoV;


public class ActV {
    public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; 
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset);
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        propietario.setComputadora(this);
    }

    public String getMarca() { 
        return marca; }
    public String getNumeroSerie() { 
        return numeroSerie; }
    public PlacaMadre getPlacaMadre() { 
        return placaMadre; }
    public Propietario getPropietario() {
        return propietario; }
}


public class PlacaMadre {
    private String modelo;
    private String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public String getModelo() { 
        return modelo; }
    public String getChipset() { 
        return chipset; }
}


public class Propietario {
    private String nombre;
    private int dni;
    private Computadora computadora;

    public Propietario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public String getNombre() { 
        return nombre; }
    public int getDni() { 
        return dni; }
    public Computadora getComputadora() {
        return computadora; }
}
}

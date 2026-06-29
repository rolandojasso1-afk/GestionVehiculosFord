package ids.gestionvehiculosford;

/**
 * Clase que representa un vehículo Ford.
 * Contiene atributos, constructor y métodos para administrar la información
 * del vehículo.
 */
public class Vehiculo {

    // Atributos
    private String modelo;
    private int anio;
    private String color;
    private double precio;
    private String transmision;

    /**
     * Constructor
     */
    public Vehiculo(String modelo, int anio, String color, double precio, String transmision) {
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.precio = precio;
        this.transmision = transmision;
    }

    /**
     * Muestra la información del vehículo.
     */
    public void mostrarInformacion() {
        System.out.println("----------------------------------------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Anio: " + anio);
        System.out.println("Color: " + color);
        System.out.println("Transmision: " + transmision);
        System.out.println("Precio: $" + precio);
    }

    /**
     * Cambia el precio del vehículo.
     */
    public void actualizarPrecio(double nuevoPrecio) {
        precio = nuevoPrecio;
    }

    /**
     * Cambia el color del vehículo.
     */
    public void cambiarColor(String nuevoColor) {
        color = nuevoColor;
    }
}
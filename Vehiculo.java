package ids.gestionvehiculosford;

/**
 * Clase base que representa cualquier vehículo Ford.
 */
public class Vehiculo {

    protected String modelo;
    protected int anio;
    protected String color;
    protected double precio;
    protected String transmision;

    /**
     * Constructor de la clase Vehiculo.
     */
    public Vehiculo(String modelo, int anio, String color, double precio, String transmision) {

        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.precio = precio;
        this.transmision = transmision;

    }

    /**
     * Muestra la información general del vehículo.
     */
    public void mostrarInformacion() {

        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Color: " + color);
        System.out.println("Precio: $" + precio);
        System.out.println("Transmisión: " + transmision);

    }

}
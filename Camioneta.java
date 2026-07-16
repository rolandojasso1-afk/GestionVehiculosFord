package ids.gestionvehiculosford;

/**
 * Clase derivada de Vehiculo.
 */
public class Camioneta extends Vehiculo {

    protected int capacidadCarga;

    public Camioneta(String modelo,
                     int anio,
                     String color,
                     double precio,
                     String transmision,
                     int capacidadCarga) {

        super(modelo, anio, color, precio, transmision);

        this.capacidadCarga = capacidadCarga;

    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Capacidad de carga: " + capacidadCarga + " kg");

    }

    public void cargarMercancia() {

        System.out.println(modelo + " está cargando mercancía.");

    }

}
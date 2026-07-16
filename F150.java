package ids.gestionvehiculosford;

/**
 * Clase F150 que hereda de Camioneta.
 */
public class F150 extends Camioneta {

    private int capacidadRemolque;

    public F150(String modelo,
                int anio,
                String color,
                double precio,
                String transmision,
                int capacidadCarga,
                int capacidadRemolque) {

        super(modelo, anio, color, precio, transmision, capacidadCarga);

        this.capacidadRemolque = capacidadRemolque;

    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Capacidad de remolque: " + capacidadRemolque + " kg");

    }

    public void remolcar() {

        System.out.println(modelo + " está remolcando una carga.");

    }

}
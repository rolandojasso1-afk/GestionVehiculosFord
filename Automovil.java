package ids.gestionvehiculosford;

/**
 * Clase derivada de Vehiculo.
 */
public class Automovil extends Vehiculo {

    protected int numeroPuertas;

    public Automovil(String modelo,
                     int anio,
                     String color,
                     double precio,
                     String transmision,
                     int numeroPuertas) {

        super(modelo, anio, color, precio, transmision);

        this.numeroPuertas = numeroPuertas;

    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Número de puertas: " + numeroPuertas);

    }

    public void abrirCajuela() {

        System.out.println(modelo + " abrió la cajuela.");

    }

}
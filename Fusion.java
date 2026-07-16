package ids.gestionvehiculosford;

/**
 * Clase Fusion que hereda de Automovil.
 */
public class Fusion extends Automovil {

    private boolean asistenteEstacionamiento;

    public Fusion(String modelo,
                  int anio,
                  String color,
                  double precio,
                  String transmision,
                  int numeroPuertas,
                  boolean asistenteEstacionamiento) {

        super(modelo, anio, color, precio, transmision, numeroPuertas);

        this.asistenteEstacionamiento = asistenteEstacionamiento;

    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Asistente de estacionamiento: " + asistenteEstacionamiento);

    }

    public void estacionarAutomaticamente() {

        System.out.println(modelo + " está realizando un estacionamiento automático.");

    }

}
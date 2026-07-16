package ids.gestionvehiculosford;

/**
 * Clase Ranger que hereda de Camioneta.
 */
public class Ranger extends Camioneta {

    private boolean traccion4x4;

    public Ranger(String modelo,
                  int anio,
                  String color,
                  double precio,
                  String transmision,
                  int capacidadCarga,
                  boolean traccion4x4) {

        super(modelo, anio, color, precio, transmision, capacidadCarga);

        this.traccion4x4 = traccion4x4;

    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Tracción 4x4: " + traccion4x4);

    }

    public void activar4x4() {

        System.out.println(modelo + " activó la tracción 4x4.");

    }

}
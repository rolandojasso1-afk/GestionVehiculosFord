package ids.gestionvehiculosford;

/**
 * Clase Mustang que hereda de Automovil.
 */
public class Mustang extends Automovil {

    private int caballosFuerza;

    public Mustang(String modelo,
                   int anio,
                   String color,
                   double precio,
                   String transmision,
                   int numeroPuertas,
                   int caballosFuerza) {

        super(modelo, anio, color, precio, transmision, numeroPuertas);

        this.caballosFuerza = caballosFuerza;
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Caballos de fuerza: " + caballosFuerza + " HP");
    }

    public void activarModoSport() {

        System.out.println(modelo + " activó el modo Sport.");

    }

}
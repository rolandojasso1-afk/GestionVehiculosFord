package ids.gestionvehiculosford;

/**
 * Clase Focus que hereda de Automovil.
 */
public class Focus extends Automovil {

    private String tipoMotor;

    public Focus(String modelo,
                 int anio,
                 String color,
                 double precio,
                 String transmision,
                 int numeroPuertas,
                 String tipoMotor) {

        super(modelo, anio, color, precio, transmision, numeroPuertas);

        this.tipoMotor = tipoMotor;

    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Motor: " + tipoMotor);

    }

    public void activarModoEco() {

        System.out.println(modelo + " activó el modo Eco.");

    }

}
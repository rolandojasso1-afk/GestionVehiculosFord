package ids.gestionvehiculosford;

/**
 * Programa principal para gestionar vehículos Ford.
 */
public class GestionVehiculosFord {

    public static void main(String[] args) {

        // Crear objetos
        Vehiculo mustang = new Vehiculo(
                "Ford Mustang GT",
                2024,
                "Rojo",
                980000,
                "Manual");

        Vehiculo ranger = new Vehiculo(
                "Ford Ranger XLT",
                2023,
                "Azul",
                720000,
                "Automatica");

        Vehiculo explorer = new Vehiculo(
                "Ford Explorer Platinum",
                2025,
                "Negro",
                1150000,
                "Automatica");

        System.out.println("=== INVENTARIO FORD ===");

        mustang.mostrarInformacion();
        ranger.mostrarInformacion();
        explorer.mostrarInformacion();

        System.out.println("\n=== ACTUALIZACION DEL MUSTANG ===");

        // Cambiar precio
        mustang.actualizarPrecio(950000);

        // Cambiar color
        mustang.cambiarColor("Gris");

        // Mostrar nuevamente
        mustang.mostrarInformacion();

    }

}
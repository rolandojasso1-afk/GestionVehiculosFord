package ids.gestionvehiculosford;

/**
 * Clase principal del programa.
 * Aquí se crean objetos de las clases derivadas para demostrar la herencia.
 */
public class GestionVehiculosFord {

    public static void main(String[] args) {

        // Objetos de Automóviles
        Mustang mustang = new Mustang(
                "Ford Mustang GT",
                2024,
                "Rojo",
                980000,
                "Manual",
                2,
                480);

        Fusion fusion = new Fusion(
                "Ford Fusion",
                2020,
                "Blanco",
                450000,
                "Automática",
                4,
                true);

        Focus focus = new Focus(
                "Ford Focus",
                2019,
                "Azul",
                320000,
                "Manual",
                4,
                "2.0L");

        // Objetos de Camionetas
        Ranger ranger = new Ranger(
                "Ford Ranger",
                2023,
                "Gris",
                720000,
                "Automática",
                1200,
                true);

        F150 f150 = new F150(
                "Ford F-150",
                2025,
                "Negro",
                1100000,
                "Automática",
                1800,
                6000);

        System.out.println("=================================");
        System.out.println("      INVENTARIO FORD");
        System.out.println("=================================\n");

        System.out.println("----- MUSTANG -----");
        mustang.mostrarInformacion();
        mustang.abrirCajuela();
        mustang.activarModoSport();

        System.out.println("\n----- FUSION -----");
        fusion.mostrarInformacion();
        fusion.abrirCajuela();
        fusion.estacionarAutomaticamente();

        System.out.println("\n----- FOCUS -----");
        focus.mostrarInformacion();
        focus.abrirCajuela();
        focus.activarModoEco();

        System.out.println("\n----- RANGER -----");
        ranger.mostrarInformacion();
        ranger.cargarMercancia();
        ranger.activar4x4();

        System.out.println("\n----- F-150 -----");
        f150.mostrarInformacion();
        f150.cargarMercancia();
        f150.remolcar();

    }

}
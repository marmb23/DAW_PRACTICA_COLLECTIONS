import java.util.Scanner;

public class Controlador {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcio;
        do {
            vista.Vista.menuPrincipal();
            opcio = sc.nextInt();
            switch (opcio) {
                case 1:
                    vista.Vista.menuGestio();
                    break;
                case 2:
                    vista.Vista.menuIntroduirProducte();
                    break;
                case 3:
                    vista.Vista.menuPassarCaixa();
                    break;
                case 4:
                    vista.Vista.menuMostrarCarro();
                    break;
                case 0:
                    System.out.println("Fins aviat!");
                    break;
                default:
                    System.out.println("Opció no vàlida.");
            }
        } while (opcio != 0);
    }

    public static void menuGestio() {
        int opcio;
        do {
            vista.Vista.menuGestio();
            opcio = sc.nextInt();
            switch (opcio) {
                case 1:
                    // Llamar función que muestre la caducidad de los productos.
                    break;
                case 2:
                    // Llamar función que muestre los tickets de compra.
                    break;
                case 3:
                    // Llamar función que muestre la composición textil de los productos.
                    break;
                case 0:
                    System.out.println("Tornant enrere...");
                    break;
                default:
                    System.out.println("Opció no vàlida.");
            }
        } while (opcio != 0);
    }

    public static void menuIntroduirProducte() {
        int opcio;
        do {
            vista.Vista.menuIntroduirProducte();
            opcio = sc.nextInt();
            switch (opcio) {
                case 1:
                    // Función para mostrar el menú de introducir producto de alimentación.
                    // Función para introducir producto de alimentación.
                    break;
                case 2:
                    // Función para mostrar el menú de introducir producto de electronica
                    // Función para introducir producto de electroncia.
                    break;
                case 3:
                    /// Función para mostrar el menú de introducir producto textil.
                    // Función para introducir producto textil.
                    break;
                case 0:
                    System.out.println("Tornant enrere...");
                    break;
                default:
                    System.out.println("Opció no vàlida.");
            }
        } while (opcio != 0);
    }

    public static void menuProducteAlimentacio() {
        System.out.println("Afegir aliment");
        System.out.println("Nom del producte: ");
        String nom = sc.next();
        System.out.println("Preu del producte: ");
        Float preu = sc.nextFloat();
        System.out.println("Codi de barres: ");
        String codi_barres = sc.next();
        System.out.println("Data de caducitat (dd/mm/yyyy): ");
    }
}

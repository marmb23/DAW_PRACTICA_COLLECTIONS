package vista;
import Model.Model.*;
import Model.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Vista {
    private static Scanner scanner = new Scanner(System.in);

    public static void menuPrincipal() {
        System.out.println("BENVINGUT/DA AL SAPAMERCAT");
        System.out.println("--------------------------");
        System.out.println("-----------INICI----------");
        System.out.println("--------------------------");
        System.out.println("1. Gestió Magatzem i Compres.");
        System.out.println("2. Introduir producte.");
        System.out.println("3. Passar per caixa.");
        System.out.println("4. Mostrar carro de la compra.");
        System.out.println("0. Sortir.");
        System.out.println("Entra una opció: ");
    }

    public static void menuGestio() {
        System.out.println("1. Mostrar la caducitat dels productes.");
        System.out.println("2. Mostrar els tiquets de compra.");
        System.out.println("3. Mostrar la composició tèxtil dels productes.");
        System.out.println("0. Tornar enrere.");
    }

    public static void menuIntroduirProducte() {
        System.out.println("-----------------------------");
        System.out.println("-----------PRODUCTE----------");
        System.out.println("-----------------------------");
        System.out.println("1. Introduir producte d'alimentació.");
        System.out.println("2. Introduir producte tèxtil.");
        System.out.println("3. Introduir producte d'electrònica.");
        System.out.println("0. Tornar enrere.");
    }

    // Metodos para solicitar los datos de los productos al usuario
    public static String solicitarNomProducte() {
        System.out.println("Nom del producte: ");
        return scanner.next();
    }

    public static double solicitarPreuProducte() {
        System.out.println("Preu del producte: ");
        return scanner.nextDouble();
    }

    public static String solicitarCodiBarres() {
        System.out.println("Codi de barres: ");
        return scanner.next();
    }

    public static LocalDate solicitarDataCaducitat() {
        System.out.println("Data de caducitat (yyyy-mm-dd): ");
        return LocalDate.parse(scanner.next());
    }

    public static String solicitarDiesGarantia() {
        System.out.println("Dies de garantia: ");
        return scanner.next();
    }

    public static String solicitarComposicioTextil() {
        System.out.println("Composició tèxtil: ");
        return scanner.next();
    }

    // Metodo para mostrar los datos una vez introducidos
    public static void mostrarProducte(Producte producte) {
        System.out.println("Producte afegit: " + producte);
    }
}
package vista;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Classe Vista
 */
public class Vista {
    private static final Scanner scanner = new Scanner(System.in);

    /////////////////////////////// MENUS ///////////////////////////////
    /// MENU PRINCIPAL ///
    public static void menuPrincipal() {
        System.out.println("BENVINGUT/DA AL SAPAMERCAT");
        System.out.println("--------------------------");
        System.out.println("-----------INICI----------");
        System.out.println("--------------------------");
        System.out.println("1. Gestió Magatzem i Compres.");
        System.out.println("2. Introduir producte.");
        System.out.println("3. Menu compres");
        System.out.println("0. Sortir.");
        System.out.println("Entra una opció: ");
    }

    /// MENU QUAN ESCULLS EL NÚMERO 1 AL MENU PRINCIPAL ///
    public static void menuGestio() {
        System.out.println("------------------------------------------------");
        System.out.println("-----------------------GESTIO-------------------");
        System.out.println("------------------------------------------------");
        System.out.println("1. Mostrar la caducitat dels productes.");
        System.out.println("2. Mostrar els tiquets de compra.");
        System.out.println("3. Mostrar la composició tèxtil dels productes.");
        System.out.println("4. Mostrar els productes del magatzem.");
        System.out.println("0. Tornar enrere.");
    }

    /// MENU QUAN ESCULLS EL NÚMERO 2 AL MENU PRINCIPAL ///
    public static void menuIntroduirProducte() {
        System.out.println("-------------------------------------------");
        System.out.println("-------------------MAGATZEM----------------");
        System.out.println("-------------------------------------------");
        System.out.println("1. Introduir producte d'alimentació.");
        System.out.println("2. Introduir producte tèxtil.");
        System.out.println("3. Introduir producte d'electrònica.");
        System.out.println("0. Tornar enrere.");
    }

    /// MENU QUAN ESCULLS EL NÚMERO 3 AL MENU PRINCIPAL ///
    public static void menuCompres() {
        System.out.println("----------------------------------");
        System.out.println("-------------COMPRES--------------");
        System.out.println("----------------------------------");
        System.out.println("1. Afegir producte al carro.");
        System.out.println("2. Mostrar carro de la compra.");
        System.out.println("3. Passar per caixa.");
        System.out.println("0. Tornar enrere.");
    }

    /////////////////////////////// MENU PER COMPRAR ///////////////////////////////
    public static void demanarProducte() {
        System.out.println("-------------------------------------------");
        System.out.println("--------------------COMPRES----------------");
        System.out.println("-------------------------------------------");
        System.out.println("Quin tipus de producte vols comprar?");
        System.out.println("1. Afegir al carro producte d'alimentació.");
        System.out.println("2. Afegir al carro producte tèxtil.");
        System.out.println("3. Afegir al carro producte d'electrònica.");
        System.out.println("0. Tornar enrere.");
    }

    /////////////////////////////// PEDIR DADES A L'USUARI ///////////////////////////////
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

    public static Integer solicitarDiesGarantia() {
        System.out.println("Dies de garantia: ");
        return scanner.nextInt();
    }

    public static String solicitarComposicioTextil() {
        System.out.println("Composició tèxtil: ");
        return scanner.next();
    }

}
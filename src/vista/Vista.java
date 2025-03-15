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
        System.out.println("2. Introduir producte d'electrònica.");
        System.out.println("3. Introduir producte tèxtil.");
        System.out.println("0. Tornar enrere.");
    }

    public static Alimentacio menuProducteAlimentacio() throws NegatiuException, LimitCaractersException, DataCaducitatException {
        System.out.println("Afegir aliment");
        System.out.println("Nom del producte: ");
        String nom = scanner.next();
        System.out.println("Preu del producte: ");
        Float preu = scanner.nextFloat();
        System.out.println("Codi de barres: ");
        String codi_barres = scanner.next();
        System.out.println("Data de caducitat (yyyy-mm-dd): ");
        LocalDate data_caducitat = LocalDate.parse(scanner.next());

        return new Alimentacio(preu, nom, data_caducitat, codi_barres);
    }

    public static Electronica menuProducteElectronica() throws NegatiuException, LimitCaractersException {
        System.out.println("Afegir electrònica");
        System.out.println("Nom del producte: ");
        String nom = scanner.next();
        System.out.println("Preu del producte: ");
        Float preu = scanner.nextFloat();
        System.out.println("Garantia (dies): ");
        Integer dies_garantia = scanner.nextInt();
        System.out.println("Codi de barres: ");
        String codi_barres = scanner.next();

        return new Electronica(preu, nom, dies_garantia, codi_barres);
    }

    public static Textil menuProducteTextil() {
        System.out.println("Afegir tèxtil");
        System.out.println("Nom del producte: ");
        String nom = scanner.next();
        System.out.println("Preu del producte: ");
        Float preu = scanner.nextFloat();
        System.out.println("Composició: ");
        String composicio_textil = scanner.next();
        System.out.println("Codi de barres: ");
        String codi_barres = scanner.next();

        return new Textil(preu, nom, composicio_textil, codi_barres);
    }
}
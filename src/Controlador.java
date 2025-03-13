import Model.objects.Alimentacio;
import Model.objects.Electronica;
import Model.objects.Textil;
import vista.Vista;

import java.time.LocalDate;
import java.util.Scanner;

import static vista.Vista.menuPrincipal;

public class Controlador {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcio;
        do {
            menuPrincipal();
            opcio = sc.nextInt();
            switch (opcio) {
                case 1:
                    menuGestio();
                    break;
                case 2:
                    menuIntroduirProducte();
                    break;
                case 3:
                    // función para pasar por caja.
                    break;
                case 4:
                    // mostrar carro de la compra
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
            menuGestio();
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
            menuIntroduirProducte();
            opcio = sc.nextInt();
            switch (opcio) {
                case 1:
                    menuProducteAlimentacio();
                    // Función para introducir producto de alimentación.
                    break;
                case 2:
                    menuProducteElectronica();
                    // Función para introducir producto de electroncia.
                    break;
                case 3:
                    menuProducteTextil();
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

    public static Alimentacio menuProducteAlimentacio() {
        System.out.println("Afegir aliment");
        System.out.println("Nom del producte: ");
        String nom = sc.next();
        System.out.println("Preu del producte: ");
        Float preu = sc.nextFloat();
        System.out.println("Codi de barres: ");
        String codi_barres = sc.next();
        System.out.println("Data de caducitat (yyyy-mm-dd): ");
        LocalDate data_caducitat = LocalDate.parse(sc.next());

        return new Alimentacio(preu, nom, data_caducitat, codi_barres);
    }

    public static Electronica menuProducteElectronica() {
        System.out.println("Afegir electrònica");
        System.out.println("Nom del producte: ");
        String nom = sc.next();
        System.out.println("Preu del producte: ");
        Float preu = sc.nextFloat();
        System.out.println("Garantia (dies): ");
        Integer dies_garantia = sc.nextInt();
        System.out.println("Codi de barres: ");
        String codi_barres = sc.next();

        return new Electronica(preu, nom, dies_garantia, codi_barres);
    }

    public static Textil menuProducteTextil() {
        System.out.println("Afegir tèxtil");
        System.out.println("Nom del producte: ");
        String nom = sc.next();
        System.out.println("Preu del producte: ");
        Float preu = sc.nextFloat();
        System.out.println("Composició: ");
        String composicio_textil = sc.next();
        System.out.println("Codi de barres: ");
        String codi_barres = sc.next();

        return new Textil(preu, nom, composicio_textil, codi_barres);
    }
}

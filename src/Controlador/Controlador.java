package Controlador;
import Model.Excepcions.CarroBuitException;
import Model.Excepcions.LimitCaractersException;
import Model.Excepcions.NegatiuException;
import static Model.Model.*;
import static vista.Vista.*;
import java.time.LocalDate;
import java.util.*;

/**
 * Classe Controlador
 */
public class Controlador {
    private static final Scanner scanner = new Scanner(System.in);
    /**
     * Mètode que gestiona el menú d'inici
     */
    public static void Menu() {
        int opcio;
        do {
            menuPrincipal();
            opcio = scanner.nextInt();
            switch (opcio) {
                case 1:
                    Gestio();
                    break;
                case 2:
                    IntroduirProducte();
                    break;
                case 3:
                    menuCarro();
                    break;
                case 0:
                    System.out.println("Fins aviat!");
                    break;
                default:
                    System.out.println("Opció no vàlida.");
                    menuPrincipal();
            }
        } while (opcio != -1);
    }

    /**
     * Mètode que gestiona el menú de gestió
     */
    public static void Gestio() {
        int opcio;
        do {
            menuGestio();
            opcio = scanner.nextInt();
            switch (opcio) {
                case 1:
                    mostrarProductesCaducitat();
                    break;
                case 2:
                    mostrarTiquets();
                    break;
                case 3:
                    mostrarProductesComposicioTextil();
                    break;
                case 4:
                    mostrarProductesMagatzem();
                    break;
                case 0:
                    System.out.println("Tornant enrere...");
                    return;
                default:
                    System.out.println("Opció no vàlida.");
                    menuGestio();
            }
        } while (opcio != -1);
    }

    /**
     * Mètode que gestiona el menú d'introduir producte
     * @throws LimitCaractersException poden haver errors en el limit de caràcters del producte que llencin aquesta excepció
     * @throws NegatiuException poden haver errors en la introducció del preu del producte que llencin aquesta excepció
     */
    public static void IntroduirProducte() throws LimitCaractersException, NegatiuException {
        int opcio;
        do {
            menuIntroduirProducte();
            opcio = scanner.nextInt(); // Primer es demana qué tipus de producte vol introduir
            //  Així que si l'usuari vol tornar enrere, ho pot fer directament, ho faig així perquè sino et demanarà les dades de "nom, preu, codi_barres" abans de tornar enrere.
            if (opcio == 0) {
                System.out.println("Tornant enrere...");
                return;
            }
            // Després demano les dades comunes a tots els productes:
            String nom = solicitarNomProducte();
            double preu = solicitarPreuProducte();
            String codi_barres = solicitarCodiBarres();
            try {
                // I després, amb un switch, demano les dades específiques de cada tipus de producte
                switch (opcio) {
                    // Alimentacio
                    case 1:
                        LocalDate data_caducitat = solicitarDataCaducitat();
                        afegirProducte(crearProducte(nom, preu, codi_barres, data_caducitat));
                        break;
                    // Textil
                    case 2:
                        String composicio_textil = solicitarComposicioTextil();
                        afegirProducte(crearProducte(nom, preu, codi_barres, composicio_textil));
                        break;
                    //  Electronica
                    case 3:
                        Integer dies_garantia = solicitarDiesGarantia();
                        afegirProducte(crearProducte(nom, preu, codi_barres, dies_garantia));
                        break;
                    default:
                        System.out.println("Opció no vàlida.");
                        menuIntroduirProducte();
                }
            } catch (NegatiuException | LimitCaractersException e) {
                System.out.println("Error en la creació del producte: " + e.getMessage());
            }
        } while (opcio != -1);
    }

    /**
     * Mètode que gestiona el menú de compres
     * @throws CarroBuitException pot haver l'error de que el carro està buit, per tant, llençarà aquesta excepció
     */
    public static void menuCarro() throws CarroBuitException {
        int opcio;
        do {
            menuCompres();
            opcio = scanner.nextInt();
            if (opcio == 0) {
                System.out.println("Tornant enrere...");
                return;
            }
            switch (opcio) {
                case 1:
                    comprarProducte();
                    break;
                case 2:
                    mostrarCarro();
                    break;
                case 3:
                    generarTiquet(carro_compra);
                    break;
                default:
                    System.out.println("Opció no vàlida.");
                    menuCompres();
            }
        } while (opcio != -1);
    }

    /**
     * Mètode que gestiona la compra de productes
     */
    public static void comprarProducte() {
        int opcio;
        do {
            demanarProducte();
            opcio = scanner.nextInt(); // Primer es demana qué tipus de producte vol introduir
            //  Així que si l'usuari vol tornar enrere, ho pot fer directament
            if (opcio == 0) {
                System.out.println("Tornant enrere...");
                return;
            }
            // Després demano les dades comunes a tots els productes:
            String nom = solicitarNomProducte();
            double preu = solicitarPreuProducte();
            String codi_barres = solicitarCodiBarres();
                switch (opcio) {
                    case 1:
                        LocalDate data_caducitat = solicitarDataCaducitat();
                        afegirProducteCarro(crearProducte(nom, preu, codi_barres, data_caducitat));
                        break;
                    case 2:
                        String composicio_textil = solicitarComposicioTextil();
                        afegirProducteCarro(crearProducte(nom, preu, codi_barres, composicio_textil));
                        break;
                    case 3:
                        Integer dies_garantia = solicitarDiesGarantia();
                        afegirProducteCarro(crearProducte(nom, preu, codi_barres, dies_garantia));
                        break;
                    default:
                        System.out.println("Opció no vàlida.");
                        demanarProducte();
                }
        } while (opcio != -1);
    }
}
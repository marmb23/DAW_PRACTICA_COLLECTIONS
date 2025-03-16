package Controlador;
import Model.*;
import static Model.Alimentacio.getData_caducitat;
import static Model.Model.*;
import static vista.Vista.*;
import java.util.*;

public class Controlador {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws NegatiuException, LimitCaractersException, LimitProductesException {
        int opcio;
        do {
            menuPrincipal();
            opcio = scanner.nextInt();
            switch (opcio) {
                case 1:
                    menuGestio();
                    break;
                case 2:
                    menuIntroduirProducte();
                    break;
                case 3:
                    generarTiquet();
                    break;
                case 4:
                    mostrarCarro();
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
            opcio = scanner.nextInt();
            switch (opcio) {
                case 1:
                    getData_caducitat();
                    break;
                case 2:
                    generarTiquet();
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

    public static void menuIntroduirProducte() throws NegatiuException, LimitCaractersException {
        int opcio;
        do {
            menuIntroduirProducte();
            opcio = scanner.nextInt();
            switch (opcio) {
                // Alimentacio
                case 1:
                    solicitarNomProducte();
                    solicitarPreuProducte();
                    solicitarCodiBarres();
                    solicitarDataCaducitat();
                    // Función para introducir producto de alimentación.
                    break;
                    // Textil
                case 2:
                    solicitarNomProducte();
                    solicitarPreuProducte();
                    solicitarComposicioTextil();
                    solicitarCodiBarres();
                    // Función para introducir producto de electronica.
                    break;
                    // Electronica
                case 3:
                    solicitarNomProducte();
                    solicitarPreuProducte();
                    solicitarDiesGarantia();
                    solicitarCodiBarres();
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
}



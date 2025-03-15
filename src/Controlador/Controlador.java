package Controlador;
import Model.Producte;
import static Model.Model.*;
import static vista.Vista.*;
import java.util.*;

public class Controlador {
    private static Scanner scanner = new Scanner(System.in);
    public static Queue<Producte> carro_compra = new LinkedList<>();

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

    public static void menuIntroduirProducte() throws NegatiuException, LimitCaractersException {
        int opcio;
        do {
            menuIntroduirProducte();
            opcio = scanner.nextInt();
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
}



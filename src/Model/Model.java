package Model;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static Controlador.Controlador.*;

public class Model {
    private List<Alimentacio> Producte = new ArrayList<>();
    public static Queue<Producte> carro_compra = new LinkedList<>();

    public static void mostrarCarro()  {
        try {
            for (Producte p : carro_compra) {
                if (carro_compra.isEmpty()) {
                    throw new CarroBuitException("El carro de la compra està buit.");
                } else {
                    System.out.println("Producte del carro de la compra:");
                    System.out.println(p);
                }
            }
        } catch (CarroBuitException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void generarTiquet() {
        try {
            System.out.println("-------------------");
            System.out.println("SAPAMERCAT - Tiquet");
            System.out.println("-------------------");

            double total = 0;
            while (!carro_compra.isEmpty()) {
                if (carro_compra.isEmpty()) {
                    throw new CarroBuitException("El carro de la compra està buit.");
                } else {
                    Producte p = carro_compra.poll();
                    System.out.printf("%s - %.2f€\n", p.getNom(), p.getPreu());
                    total += p.getPreu();
                }
            }
            System.out.println("-------------------");
            System.out.printf("Total: %.2f€\n", total);

        } catch (CarroBuitException e) {
            System.out.println(e.getMessage());
        }
    }

    public void afegirProducte(Producte nouProducte) {
        try {


    // Excepcions

    public static class LimitProductesException extends Exception {
        public LimitProductesException(String message) {
            super(message);
        }
    }

    public static class DataCaducitatException extends Exception {
        public DataCaducitatException(String message) {
            super(message);
        }
    }

    public static class NegatiuException extends Exception {
        public NegatiuException(String message) {
            super(message);
        }
    }

    public static class LimitCaractersException extends Exception {
        public LimitCaractersException(String message) {
            super(message);
        }
    }

    public static class CarroBuitException extends Exception {
        public CarroBuitException(String message) {
            super(message);
        }
    }

}


//    public static void afegirTextil(Textil nouTextil) {
//        try {
//            for (Producte p : carro_compra) {
//                if (p instanceof Textil && p.getCodi_barres().equals(nouTextil.getCodi_barres())) {
//                    throw new LimitProductesException("Ja existeix un producte amb aquest codi de barres.");
//                } else if (carro_compra.size() == 100) {
//                    throw new LimitProductesException("El carro de la compra està ple.");
//                } else {
//                    carro_compra.offer(nouTextil);
//                }
//            }
//        } catch (LimitProductesException e) {
//            System.out.println(e.getMessage());
//        }
//    }

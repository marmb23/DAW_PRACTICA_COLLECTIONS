package Model;
import static Controlador.Controlador.*;

public class Model {

    public static void afegirTextil(Textil nouTextil) throws LimitProductesException {
        for (Producte p : carro_compra) {
            if (p instanceof Textil && p.getCodi_barres().equals(nouTextil.getCodi_barres())) {
                throw new LimitProductesException("Ja existeix un producte amb aquest codi de barres.");
            } else if (carro_compra.size() == 100) {
                throw new LimitProductesException("El carro de la compra està ple.");
            } else {
                carro_compra.offer(nouTextil);
            }
        }
    }

    public static void mostrarCarro() throws LimitProductesException {
        if (carro_compra.isEmpty()) {
            System.out.println("El carro de la compra està buit.");
        } else {
            System.out.println("Producte del carro de la compra:");
            for (Producte p : carro_compra) {
                System.out.println(p);
            }
        }
    }

    public static void generarTiquet() {
        if (carro_compra.isEmpty()) {
            System.out.println("El carro de la compra està buit.");
            return;
        }

        System.out.println("-------------------");
        System.out.println("SAPAMERCAT - Tiquet");
        System.out.println("-------------------");

        double total = 0;
        while (!carro_compra.isEmpty()) {
            Producte p = carro_compra.poll();
            System.out.printf("%s - %.2f€\n", p.getNom(), p.getPreu());
            total += p.getPreu();
        }
        System.out.println("-------------------");
        System.out.printf("Total: %.2f€\n", total);
    }

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

}


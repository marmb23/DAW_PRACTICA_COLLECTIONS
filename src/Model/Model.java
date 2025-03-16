package Model;
import Model.Excepcions.*;
import Model.Objectes.*;
import java.time.LocalDate;
import java.util.*;

public class Model {
    //############################################### LLISTES ###############################################
    public static List<Producte> magatzem = new ArrayList<>();
    public static Queue<Producte> carro_compra = new LinkedList<>();
    public static Queue<Tiquet> tiquets_compra = new LinkedList<>();

    //############################################### AFEGIR A LLISTES ###############################################
    /**
     * Afegir producte al magatzem
     * @param nou_producte Producte a afegir al magatzem (Llista)
     * @throws CodiBarresException Si el codi de barres ja existeix al magatzem llança una excepció
     */
    public static void afegirProducte(Producte nou_producte) throws CodiBarresException {
        for (Producte p : magatzem) {
            if (p.getCodi_barres().equals(nou_producte.getCodi_barres())) {
                throw new CodiBarresException("El codi de barres ja existeix.");
            }
        }
        magatzem.add(nou_producte);
        System.out.println("Producte afegit: " + nou_producte);
    }

    /**
     * Es genera un tiquet amb els objectes que hi ha a la llista del carro de la compra, es buida el carro i es mostra el tiquet.
     * @param carro_compra Carro de la compra
     * @throws CarroBuitException Si el carro de la compra està buit llança una excepció
     */
    public static void generarTiquet(Queue<Producte> carro_compra) throws CarroBuitException {
        if (carro_compra.isEmpty()) {
            throw new CarroBuitException("El carro de la compra està buit.");
        }
        Tiquet nou_tiquet = new Tiquet(carro_compra);
        System.out.println(nou_tiquet);
        Model.carro_compra.clear();
    }

    /**
     * Afegir producte al carro de la compra (queue)
     * @param nou_producte Producte a afegir al carro de la compra (queue)
     * @throws CodiBarresException Si el producte ja està al carro de la compra (queue) llança una excepció
     * @throws ProducteNoDisponible Si el producte no està disponible al magatzem (llista) llança una excepció
     */
    public static void afegirProducteCarro(Producte nou_producte) throws CodiBarresException, ProducteNoDisponible {
        if (carro_compra.stream().anyMatch(p -> p.getCodi_barres().equals(nou_producte.getCodi_barres()))) {
            throw new CodiBarresException("El producte ja està al carro de la compra.");
        }
        if (magatzem.stream().noneMatch(p -> p.getCodi_barres().equals(nou_producte.getCodi_barres()))) {
            throw new ProducteNoDisponible("El producte no està disponible al magatzem.");
        }
        carro_compra.add(nou_producte);
        System.out.println("Producte afegit al carro: " + nou_producte);
    }

    //############################################### MOSTRAR ###############################################
    /**
     * Mostrar productes de tipus Alimentació ordenats per data de caducitat
     */
    public static void mostrarProductesCaducitat() {
        if (magatzem.isEmpty()) {
            System.out.println("No hi ha productes al magatzem.");
            return;
        }
        magatzem.stream()
                .filter(p -> p instanceof Alimentacio) // Filtrar només productes de tipus alimentació
                .map(p -> (Alimentacio) p) // Els convertim a alimentació
                .sorted(Comparator.comparing(Alimentacio::getData_caducitat)) // Els ordenem per data de caducitat
                .forEach(System.out::println); // Mostrem per pantalla cada producte ja ordenat
    }

    /**
     * Mostrar productes de tipus tèxtil ordenats per composició tèxtil
     */
    public static void mostrarProductesComposicioTextil() {
        if (magatzem.isEmpty()) {
            System.out.println("No hi ha productes al magatzem.");
            return;
        }
        magatzem.stream()
                .filter(p -> p instanceof Textil) // Filtrar només productes de tipus tèxtil
                .map(p -> (Textil) p) // Els convertim a tèxtil
                .sorted(Comparator.comparing(Textil::getComposicio_textil)) // Els ordenem per composició tèxtil
                .forEach(System.out::println); // Mostrem per pantalla cada producte ja ordenat
    }

    /**
     * Mostrar el carro de la compra (queue)
     * @throws CarroBuitException Si el carro de la compra està buit llança una excepció
     */
    public static void mostrarCarro() {
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

    /**
     * Mostrar tiquets de compra (queue)
     * @throws CarroBuitException Si no hi ha tiquets de compra llança una excepció
     */
    public static void mostrarTiquets() {
        try {
            if (tiquets_compra.isEmpty()) {
                throw new CarroBuitException("No hi ha tiquets de compra.");
            } else {
                System.out.println("Tiquets de compra:");
                for (Tiquet t : tiquets_compra) {
                    System.out.println(t);
                }
            }
        } catch (CarroBuitException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Mostrar productes del magatzem (llista)
     * @throws LimitProductesException Si no hi ha productes al magatzem llança una excepció
     */
    public static void mostrarProductesMagatzem() {
        try {
            if (magatzem.isEmpty()) {
                throw new LimitProductesException("No hi ha productes al magatzem.");
            } else {
                System.out.println("Productes del magatzem:");
                for (Producte p : magatzem) {
                    System.out.println(p);
                }
            }
        } catch (LimitProductesException e) {
            System.out.println(e.getMessage());
        }
    }

    //############################################### CREAR PRODUCTE ###############################################
    /**
     * Crear producte amb els paràmetres introduïts per l'usuari segons el tipus de producte (alimentació, tèxtil, electrònica)
     * @param nom Nom del producte
     * @param preu Preu del producte
     * @param codi_barres Codi de barres del producte
     * @param extra Paràmetre extra segons el tipus de producte (data de caducitat, composició tèxtil, dies de garantia)
     * @return Producte creat
     * @throws NegatiuException Si el preu és negatiu llança una excepció
     * @throws DataCaducitatException Si la data de caducitat és anterior a la data actual llança una excepció
     * @throws LimitCaractersException Si el nom o la composició tèxtil superen els 50 caràcters llança una excepció
     */
    public static Producte crearProducte(String nom, double preu, String codi_barres, Object extra) throws NegatiuException, DataCaducitatException, LimitCaractersException {
        try {
            if (extra instanceof LocalDate) {
                return new Alimentacio(nom, preu, codi_barres, (LocalDate) extra);
            } else if (extra instanceof String) {
                return new Textil(nom, preu, codi_barres, (String) extra);
            } else if (extra instanceof Integer) {
                return new Electronica(nom, preu, codi_barres, (Integer) extra);
            }
        } catch (DataCaducitatException | NegatiuException | LimitCaractersException e) {
            System.out.println("Error en la creació del producte: " + e.getMessage());
        }
        return null;
    }

}
package Model.Objectes;
import java.util.Queue;

/**
 * Classe Tiquet que conté una cua de productes i el preu total dels productes del tiquet
 */
public class Tiquet {
    private Queue<Producte> producte;

    /**
     * Constructor de la classe Tiquet
     * @param producte Queue de productes que es volen afegir al tiquet de compra
     */
    public Tiquet(Queue<Producte> producte) {
        this.producte = producte;
        double total = calcularTotal();
    }

    /**
     * Mètode que calcula el preu total dels productes del tiquet
     * @return double amb el preu total dels productes del tiquet
     */
    private double calcularTotal() {
        return producte.stream().mapToDouble(Producte::calcularPreuFinal).sum();
    }

    /**
     * Mètode que retorna el tiquet de compra en format String
     * @return String amb el tiquet de compra
     */
    public String toString() {
        double total = 0;
        StringBuilder resultatBuilder = new StringBuilder("""
                -------------------
                SAPAMERCAT - Tiquet
                -------------------
                """);
        for (Producte p : producte) {
            resultatBuilder.append(String.format("%s - %.2f€\n", p.getNom(), p.calcularPreuFinal()));
            total += p.calcularPreuFinal();
        }
        String resultat = resultatBuilder.toString();
        resultat += "-------------------\n" + String.format("Total: %.2f€\n", total);
        return resultat;
    }
}

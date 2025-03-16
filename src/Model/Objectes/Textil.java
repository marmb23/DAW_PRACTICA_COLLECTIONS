package Model.Objectes;
import java.util.Comparator;
import Model.Excepcions.LimitCaractersException;

public class Textil extends Producte implements Comparator<Textil> {
    String composicio_textil;

    /**
     * Constructor de la classe Tèxtil
     * @param nom nom del producte extes de la classe Producte
     * @param preu preu del producte extes de la classe Producte
     * @param codi_barres codi de barres del producte extes de la classe Producte
     * @param composicio_textil composició tèxtil del producte propi de la classe Tèxtil
     * @throws LimitCaractersException llença una excepció si la composició tèxtil no té entre 3 i 50 caràcters
     */
    public Textil(String nom, double preu, String codi_barres, String composicio_textil) throws LimitCaractersException {
        super(nom, preu, codi_barres);

        if (composicio_textil.length() < 3) {
            throw new LimitCaractersException("La composició tèxtil ha de tenir com a mínim 3 caràcters.");
        } else if (composicio_textil.length() > 50) {
            throw new LimitCaractersException("La composició tèxtil ha de tenir com a màxim 50 caràcters.");
        }
        this.composicio_textil = composicio_textil;
    }

    // Getter
    public String getComposicio_textil() {
        return composicio_textil;
    }

    // Setter
    public void setComposicio_textil(String composicio_textil) {
        this.composicio_textil = composicio_textil;
    }

    /**
     * Mètode per calcular el preu final del producte
     * @return preu final del producte
     */
    public double calcularPreuFinal() {
        return preu;
    }

    /**
     * Mètode per mostrar les dades del producte
     * @return dades del producte
     */
    @Override
    public String toString() {
        return "Textil{" +
                "composicio_textil='" + composicio_textil + '\'' +
                ", nom='" + nom + '\'' +
                ", codi_barres='" + codi_barres + '\'' +
                ", preu=" + calcularPreuFinal() +
                '}';
    }

    /**
     * Mètode per comparar dos objectes de la classe Tèxtil
     * @param t1 primer objecte per ser comparat
     * @param t2 segon objecte per ser comparat
     * @return
     */
    @Override
    public int compare(Textil t1, Textil t2) {
        return 0;
    }
}

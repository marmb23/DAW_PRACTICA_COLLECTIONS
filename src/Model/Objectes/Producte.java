package Model.Objectes;
import Model.Excepcions.LimitCaractersException;
import Model.Excepcions.NegatiuException;

public abstract class Producte implements Comparable<Producte> {
    public String nom;
    public double preu;
    public String codi_barres;

    /**
     * Constructor de la classe abstracte Producte
     * @param nom nom del producte
     * @param preu preu del producte
     * @param codi_barres codi de barres del producte
     * @exception NegatiuException si el preu és negatiu
     * @exception LimitCaractersException si el nom té menys de 3 caràcters o més de 50 caràcters
     */
    public Producte(String nom, double preu, String codi_barres) throws NegatiuException, LimitCaractersException {
        if (nom.length() < 3) {
            throw new LimitCaractersException("El nom del producte ha de tenir com a mínim 3 caràcters.");
        } else if (nom.length() > 50) {
            throw new LimitCaractersException("El nom del producte ha de tenir com a màxim 50 caràcters.");
        }
        this.nom = nom;

        if (preu < 0) {
            throw new NegatiuException("El preu no pot ser negatiu.");
        }
        this.preu = preu;

        if (codi_barres.length() != 13) {
            throw new LimitCaractersException("El codi de barres ha de tenir 13 caràcters.");
        }
        this.codi_barres = codi_barres;
    }

    // Getters
    public double getPreu() {
        return preu;
    }

    public String getNom() {
        return nom;
    }

    public String getCodi_barres() {
        return codi_barres;
    }

    // Setters
    public void setCodi_barres(String codi_barres) {
        this.codi_barres = codi_barres;
    }

    public void setPreu(Float preu) {
        this.preu = preu;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Mètode abstracte per calcular el preu final del producte
     * @return preu final del producte
     */
    public abstract double calcularPreuFinal();

    /**
     * Mètode per comparar dos productes
     * @param altre l'objecte que volem comparar
     * @return 0 si són iguals, -1 si l'objecte és més petit, 1 si l'objecte és més gran
     */
    public int compareTo(Producte altre) {
        return this.nom.compareTo(altre.nom);
    }

    /**
     * Mètode per mostrar la informació del producte
     * @return informació del producte
     */
    @Override
    public String toString() {
        return "Producte{" +
                "nom='" + nom + '\'' +
                ", preu=" + preu +
                ", codi_barres='" + codi_barres + '\'' +
                '}';
    }
}
package Model;
import Model.Model.*;

public abstract class Producte implements Comparable<Producte> {
    public String nom;
    public double preu;
    public String codi_barres;

    /**
     * @param preu
     * @param nom
     * @param codi_barres
     */
    public Producte(String nom, double preu, String codi_barres) throws NegatiuException, LimitCaractersException {
        try {
            if (nom.length() < 3) {
                throw new LimitCaractersException("El nom del producte ha de tenir com a mínim 3 caràcters.");
            } else if (nom.length() > 50) {
                throw new LimitCaractersException("El nom del producte ha de tenir com a màxim 50 caràcters.");
            }
            this.nom = nom;
        } catch (LimitCaractersException e) {
            System.out.println(e.getMessage());
        }
        try {
            if (preu < 0) {
                throw new NegatiuException("El preu no pot ser negatiu.");
            }
            this.preu = preu;
        } catch (NegatiuException e) {
            System.out.println(e.getMessage());
        }
        try {
            if (codi_barres.length() != 13) {
                throw new LimitCaractersException("El codi de barres ha de tenir 13 caràcters.");
            }
            this.codi_barres = codi_barres;
        } catch (LimitCaractersException e) {
                System.out.println(e.getMessage());
            }
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

    public abstract double calcularPreuFinal();

    public int compareTo(Producte altre) {
        return this.nom.compareTo(altre.nom);
    }

}
package Model.objects;

public abstract class Productes implements Comparable<Productes> {
    public double preu;
    public String nom;
    public String codi_barres;

    /**
     * @param preu
     * @param nom
     * @param codi_barres
     */
    public Productes(double preu, String nom, String codi_barres) {
        this.preu = preu;
        this.nom = nom;
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

    public abstract double calcularPreuFinal();

    // toString
    @Override
    public String toString() {
        return "Productes{" +
                "preu=" + preu +
                ", nom='" + nom + '\'' +
                ", codi_barres='" + codi_barres + '\'' +
                '}';
    }


    public int compareTo(Productes altre) {
        return this.nom.compareTo(altre.nom);
    }

}
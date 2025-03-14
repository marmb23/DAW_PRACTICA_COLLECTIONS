package Model;

import java.time.LocalDate;
import java.time.Period;

public class Alimentacio extends Productes {

    LocalDate data_caducitat;

    /**
     * @param preu
     * @param nom
     * @param codi_barres
     */
    public Alimentacio(double preu, String nom, LocalDate data_caducitat, String codi_barres) {
        super(preu, nom, codi_barres);
        this.data_caducitat = data_caducitat;
    }

    // Getters
    public LocalDate getData_caducitat() {
        return data_caducitat;
    }

    // Setters
    public void setData_caducitat(LocalDate data_caducitat) {
        this.data_caducitat = data_caducitat;
    }

    // toString
    public String toString() {
        return "Alimentacio{" +
                "data_caducitat=" + data_caducitat +
                ", preu=" + preu +
                ", nom='" + nom + '\'' +
                ", codi_barres='" + codi_barres + '\'' +
                '}';
    }

    /**
     *
     * @return
     */
    public double calcularPreuFinal() {
        LocalDate dataActual = LocalDate.now();
        return (preu - preu*((double) 1 / (Period.between(data_caducitat, dataActual).getDays()+1)) + (preu * 0.1));
    }

}

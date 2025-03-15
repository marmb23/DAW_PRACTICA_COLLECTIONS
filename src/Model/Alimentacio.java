package Model;

import java.time.LocalDate;
import java.time.Period;
import Model.Model.*;

public class Alimentacio extends Producte {

    LocalDate data_caducitat;

    /**
     * @param preu
     * @param nom
     * @param codi_barres
     */
    public Alimentacio(double preu, String nom, LocalDate data_caducitat, String codi_barres) throws NegatiuException, LimitCaractersException, DataCaducitatException {
        super(preu, nom, codi_barres);
        if (data_caducitat.isBefore(LocalDate.now())) {
            throw new DataCaducitatException("La data de caducitat no pot ser anterior a la data actual.");
        }
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

    /**
     *
     * @return
     */
    public double calcularPreuFinal() {
        LocalDate dataActual = LocalDate.now();
        return (preu - preu*((double) 1 / (Period.between(data_caducitat, dataActual).getDays()+1)) + (preu * 0.1));
    }

}

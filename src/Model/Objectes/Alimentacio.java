package Model.Objectes;
import java.time.LocalDate;
import java.time.Period;
import Model.Excepcions.DataCaducitatException;

public class Alimentacio extends Producte {

    public LocalDate data_caducitat;

    /**
     * Constructor de la classe Alimentacio
     * @param nom nom del producte extes de la classe Producte
     * @param preu preu del producte extes de la classe Producte
     * @param codi_barres codi de barres del producte extes de la classe Producte
     * @param data_caducitat data de caducitat del producte propi de la classe Alimentacio
     * @throws DataCaducitatException excepció de la data de caducitat que no pot ser anterior a la data actual
     */
    public Alimentacio(String nom, double preu, String codi_barres, LocalDate data_caducitat) throws DataCaducitatException {
        super(nom, preu, codi_barres);
        if (data_caducitat.isBefore(LocalDate.now())) {
            throw new DataCaducitatException("La data de caducitat no pot ser anterior a la data actual.");
        }
        this.data_caducitat = data_caducitat;
    }

    // Getter
    public LocalDate getData_caducitat() {
        return data_caducitat;
    }

    // Setter
    public void setData_caducitat(LocalDate data_caducitat) {
        this.data_caducitat = data_caducitat;
    }

    /**
     * Mètode per calcular el preu final del producte
     * @return preu final del producte
     */
    public double calcularPreuFinal() {
        LocalDate dataActual = LocalDate.now();
        return (preu - preu * (1.0 / Period.between(dataActual, data_caducitat).getDays())) + (preu * 0.1);
    }

    /**
     * Mètode per mostrar la informació del producte
     * @return informació del producte
     */
    @Override
    public String toString() {
        return "Alimentacio{" +
                "nom='" + nom + '\'' +
                ", preu=" + calcularPreuFinal() +
                ", codi_barres='" + codi_barres + '\'' +
                ", data_caducitat=" + data_caducitat +
                '}';
    }
}

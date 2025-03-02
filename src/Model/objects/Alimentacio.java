package Model.objects;
import java.time.LocalDate;
import java.time.Period;

public abstract class Alimentacio extends Productes {
    LocalDate data_caducitat;
    /**
     * @param preu
     * @param nom
     * @param codi_barres
     */
    public Alimentacio(Float preu, String nom, LocalDate data_caducitat, String codi_barres) {
        super(preu, nom, codi_barres);
        this.data_caducitat = data_caducitat;
        this.preu = preuFinal(preu);
    }

    public LocalDate getData_caducitat() {
        return data_caducitat;
    }

    public void setData_caducitat(LocalDate data_caducitat) {
        this.data_caducitat = data_caducitat;
    }

    @Override
    public String toString() {
        return "Alimentacio{" +
                "data_caducitat=" + data_caducitat +
                ", preu=" + preu +
                ", nom='" + nom + '\'' +
                ", codi_barres='" + codi_barres + '\'' +
                '}';
    }

//    public static int getEdat(String dataNaixement) {
//        LocalDate _dataNaixement = LocalDate.parse(dataNaixement, formatter);
//        LocalDate avui = LocalDate.now();
//        formatter.format(avui);
//        return Period.between(_dataNaixement, avui).getYears();
//    }

    public Float preuFinal(Float preu) {
        LocalDate dataActual = LocalDate.now();

        return (float) (preu - preu*((float) 1 / (Period.between(data_caducitat, dataActual).getDays()+1)) + (preu * 0.1));
    }

}

package Model.objects;
import java.util.ArrayList;

public class Carro_compra {
    public ArrayList<Productes> llista_productes;

    public Carro_compra() {
        this.llista_productes = new ArrayList<>();
    }

    public void afegirProducte(Productes producte) {
        llista_productes.add(producte);
    }

    public void eliminarProducte(Productes producte) {
        llista_productes.remove(producte);
    }

    public ArrayList<Productes> obtenirProductes() {
        return llista_productes;
    }

    public void mostrarProductes() {
        if (llista_productes.isEmpty()) {
            System.out.println("No hi ha productes al carro");
        } else {
            for (Productes producte : llista_productes) {
                System.out.println(producte);
            }
        }
    }
}
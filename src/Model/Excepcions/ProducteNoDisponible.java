package Model.Excepcions;

public class ProducteNoDisponible extends RuntimeException {
    public ProducteNoDisponible(String message) {
        super(message);
    }
}
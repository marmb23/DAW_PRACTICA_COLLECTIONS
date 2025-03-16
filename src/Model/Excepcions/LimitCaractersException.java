package Model.Excepcions;

public class LimitCaractersException extends RuntimeException {
    public LimitCaractersException(String message) {
        super(message);
    }
}

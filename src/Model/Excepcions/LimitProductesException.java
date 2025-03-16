package Model.Excepcions;

public class LimitProductesException extends RuntimeException {
    public LimitProductesException(String message) {
        super(message);
    }
}

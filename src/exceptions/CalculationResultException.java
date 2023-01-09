package exceptions;

public class CalculationResultException extends RuntimeException {
    public CalculationResultException() {
    }

    public CalculationResultException(String message) {
        super(message);
    }

    public CalculationResultException(String message, Throwable cause) {
        super(message, cause);
    }
}

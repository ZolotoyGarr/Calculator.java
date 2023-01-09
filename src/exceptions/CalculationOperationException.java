package exceptions;

public class CalculationOperationException extends RuntimeException{
    public CalculationOperationException() {
    }

    public CalculationOperationException(String message) {
        super(message);
    }

    public CalculationOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}

package exceptions;

public class CalculationInputValueException extends RuntimeException {
    public CalculationInputValueException() {
    }

    public CalculationInputValueException(String message) {
        super(message);
    }

    public CalculationInputValueException(String message, Throwable cause) {
        super(message, cause);
    }
}

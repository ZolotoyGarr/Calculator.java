package exceptions;

public class CalculationInputFormatException extends RuntimeException {
    public CalculationInputFormatException() {
    }

    public CalculationInputFormatException(String message) {
        super(message);
    }


    public CalculationInputFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}

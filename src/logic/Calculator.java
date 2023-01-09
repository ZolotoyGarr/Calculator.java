package logic;

import enums.Messages;
import exceptions.CalculationInputValueException;
import exceptions.CalculationOperationException;

public class Calculator {
    public int calculate(int firstNumber, String operation, int secondNumber) throws CalculationOperationException {
        if ((firstNumber < 1 || firstNumber > 10) || (secondNumber < 1 || secondNumber > 10)) {
            throw new CalculationInputValueException(Messages.FROM_ONE_TO_TEN_MESSAGE.getFullMessage());
        }

        return switch (operation) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> firstNumber / secondNumber;
            default -> throw new CalculationOperationException(Messages.WRONG_OPERATION_MESSAGE.getFullMessage());
        };
    }
}

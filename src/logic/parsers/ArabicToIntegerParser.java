package logic.parsers;

import enums.Messages;
import exceptions.CalculationInputValueException;

public class ArabicToIntegerParser implements FormatToIntegerParser {
    @Override
    public int parseToInt(String input) {
        int number;

        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException NFE) {
            throw new CalculationInputValueException(Messages.FROM_ONE_TO_TEN_MESSAGE.getFullMessage());
        }

        return number;
    }
}

package logic.parsers;

import enums.Messages;
import exceptions.CalculationInputValueException;

public class RomanToIntegerParser implements FormatToIntegerParser {
    public static final String[] romanNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    @Override
    public int parseToInt(String input) {
        int number = 0;

        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException NFE) {
            boolean matchNotFounded = true;
            int i = 0;
            while (matchNotFounded) {
                if (input.equals(romanNumbers[i])) {
                    number = i + 1;
                    matchNotFounded = false;
                } else if (i < romanNumbers.length - 1){
                    i++;
                } else {
                    throw new CalculationInputValueException(Messages.FROM_ONE_TO_TEN_MESSAGE.getFullMessage());
                }
            }
        }

        return number;
    }
}

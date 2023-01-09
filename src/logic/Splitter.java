package logic;

import enums.Messages;
import exceptions.CalculationInputFormatException;

public class Splitter {
    public String[] split(String input) {
        String[] strArray = input.trim().split("\\s+");
        if (strArray.length != 3) {
            throw new CalculationInputFormatException(Messages.WRONG_FORMAT_MESSAGE.getFullMessage());
        }
        return strArray;
    }
}

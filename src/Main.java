import logic.*;
import enums.Messages;
import exceptions.CalculationInputValueException;
import exceptions.CalculationResultException;
import logic.parsers.ParserChooser;


import java.util.*;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        System.out.println(Messages.WELCOME_MESSAGE.getFullMessage());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Результат вычисления: " + calculation(scanner.nextLine()));
    }

    public static String calculation(String input) throws RuntimeException {
        String[] strArray = new Splitter().split(input);

        RomanChecker romanChecker = new RomanChecker();

        boolean firstNumberIsRoman = romanChecker.isRomanNumber(strArray[0]);
        boolean secondNumberIsRoman = romanChecker.isRomanNumber(strArray[2]);

        ParserChooser parserChooser = new ParserChooser();

        int firstNumber = parserChooser.chooseParser(firstNumberIsRoman).parseToInt(strArray[0]);
        int secondNumber = parserChooser.chooseParser(secondNumberIsRoman).parseToInt(strArray[2]);

        if ((!firstNumberIsRoman && secondNumberIsRoman) || (firstNumberIsRoman && !secondNumberIsRoman)) {
            throw new CalculationInputValueException(Messages.BOTH_NUMBERS_EXCEPTION_MESSAGE.getFullMessage());
        }

        int resultNumber = new Calculator().calculate(firstNumber, strArray[1], secondNumber);

        String resultString;

        if (firstNumberIsRoman) {
            if (resultNumber < 1) {
                throw new CalculationResultException(Messages.LARGER_THAN_ONE_MESSAGE.getFullMessage());
            }
            resultString = new IntToRomanConvertor().convertIntToRoman(resultNumber);
        } else {
            resultString = Integer.toString(resultNumber);
        }

        return resultString;
    }

}

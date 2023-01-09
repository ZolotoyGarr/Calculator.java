package logic;

public class RomanChecker {
    public static final String[] romanNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public boolean isRomanNumber(String input) {
        for (String romanNumber : romanNumbers) {
            if (input.equals(romanNumber)) {
                return true;
            }
        }
        return false;
    }
}

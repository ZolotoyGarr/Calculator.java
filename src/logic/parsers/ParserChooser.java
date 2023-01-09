package logic.parsers;

public class ParserChooser {
    public FormatToIntegerParser chooseParser(boolean checkedRoman) {
        if (checkedRoman) {
            return new RomanToIntegerParser();
        }

        return new ArabicToIntegerParser();
    }
}

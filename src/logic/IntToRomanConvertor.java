package logic;

public class IntToRomanConvertor {
    public String convertIntToRoman(int number) {
        String[] keys = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] ints = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder roman = new StringBuilder();
        int ind = 0;

        while (ind < keys.length) {
            while (number >= ints[ind]) {
                int buffer = number / ints[ind];
                number = number % ints[ind];
                for (int i = 0; i < buffer; i++) {
                    roman.append(keys[ind]);
                }
            }
            ind++;
        }

        return roman.toString();
    }
}

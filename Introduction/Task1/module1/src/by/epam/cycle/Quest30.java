package by.epam.cycle;

public class Quest30 {
    public static void main(String[] args) {
        Quest30 quest30 = new Quest30();

        String input = "XII";

        System.out.println(input + " = " + quest30.convertLetterToNum(input));

    }

    private int convertLetterToNum(String number) {
        if (number.isEmpty()) return 0;
        if (number.startsWith("M")) return 1000 + convertLetterToNum(number.substring(1));
        if (number.startsWith("CM")) return 900 + convertLetterToNum(number.substring(2));
        if (number.startsWith("D")) return 500 + convertLetterToNum(number.substring(1));
        if (number.startsWith("CD")) return 400 + convertLetterToNum(number.substring(2));
        if (number.startsWith("C")) return 100 + convertLetterToNum(number.substring(1));
        if (number.startsWith("XC")) return 90 + convertLetterToNum(number.substring(2));
        if (number.startsWith("L")) return 50 + convertLetterToNum(number.substring(1));
        if (number.startsWith("XL")) return 40 + convertLetterToNum(number.substring(2));
        if (number.startsWith("X")) return 10 + convertLetterToNum(number.substring(1));
        if (number.startsWith("IX")) return 9 + convertLetterToNum(number.substring(2));
        if (number.startsWith("V")) return 5 + convertLetterToNum(number.substring(1));
        if (number.startsWith("IV")) return 4 + convertLetterToNum(number.substring(2));
        if (number.startsWith("I")) return 1 + convertLetterToNum(number.substring(1));
        else return 0;
    }

}

import java.util.Scanner;

public class binaryAI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 5 bit mantissa");
        String mantissa = input.nextLine();
        System.out.println("Enter your 3 bit exponent");
        String exponent = input.nextLine();

        if (mantissa.length() != 5) {
            System.out.println("Invalid");
            return;
        }

        if (exponent.length() != 3) {
            System.out.println("Invalid");
            return;
        }

        double mantissaValue = convertMantissaToDecimal(mantissa);
        int exponentValue = convertToDecimal(exponent, 3);

        System.out.println("Your Exponent is equal to " + exponentValue);

        double binaryValue = mantissaValue * Math.pow(2, exponentValue);
        System.out.println("Your binary value is: " + binaryValue);
    }

    private static double convertMantissaToDecimal(String mantissa) {
        double value = 0.0;
        boolean isNegative = mantissa.charAt(0) == '1';

        for (int i = 0; i < mantissa.length(); i++) {
            if (mantissa.charAt(i) == '1') {
                value += Math.pow(2, -(i + 1));
            }
        }

        if (isNegative) {
            value = -value;
        }

        return value;
    }

    private static int convertToDecimal(String binary, int bits) {
        int value = 0;
        boolean isNegative = binary.charAt(0) == '1';

        for (int i = 0; i < bits; i++) {
            if (binary.charAt(i) == '1') {
                value += Math.pow(2, bits - 1 - i);
            }
        }

        if (isNegative) {
            value -= Math.pow(2, bits);
        }

        return value;
    }
}
import java.util.Scanner;
public class binaryConvertor {
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

        int[] mantissaArray = new int[5];
        for (int i = 0; i < 5; i++) {
            mantissaArray[i] = Integer.parseInt(String.valueOf(mantissa.charAt(i)));
        }

        int[] exponentArray = new int[3];
        for (int i = 0; i < 3; i++) {
            exponentArray[i] = Integer.parseInt(String.valueOf(exponent.charAt(i)));
        }

        boolean positiveExponent = true;
        if (exponentArray[0] == 1) {
            positiveExponent = false;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(exponentArray[i]);
        }

        int exponentVal = 0;
        if (positiveExponent) {
            if (exponentArray[0] == 1) {
                exponentVal += 4;
            }
            if (exponentArray[1] == 1) {
                exponentVal += 2;
            }
            if (exponentArray[2] == 1) {
                exponentVal += 1;
            }
        }

        System.out.println("Your Exponent is equal to " + exponentVal);
        int valsBeforeBP = exponentVal + 1;

        // Work out starting weight
        int startWeight = 1;
        for (int i = 0; i < valsBeforeBP - 1; i++) {
            startWeight = startWeight * 2;
        }
        int binaryValue = 0;
        for (int i = 0; i < mantissaArray.length; i++) {
            if (mantissaArray[i] == 1) {
                binaryValue += startWeight;
                startWeight /= 2;

            }
        }
        System.out.println("Your binary value is: " + binaryValue);
    }
}
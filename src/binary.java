import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 bit mantissa");
        String mantissaString = input.nextLine();
        int[] mantissaArray = binary.mantissaInArray(mantissaString);

        System.out.println("Enter 3 bit exponent");
        String exponentString = input.nextLine();
        int[] exponentArray = binary.exponentInArray(exponentString);
        int exponentVal;
        if (exponentArray[0] == 0){
            exponentVal = binary.POS_exponentToDeanery(exponentArray);
        }else{
            exponentVal = binary.NEG_exponentToDeanery(exponentArray);
        }
        System.out.println("Your exponent in deanery is: " + exponentVal);
        double converted = 0;
        if (mantissaArray[0] == 1){
            System.out.println("Negative num");
        }else{
            converted = binary.POS_mantissaToDeanery(mantissaArray, exponentVal);
        }
        System.out.println("Your binary value in deanery is: " + converted);

    }

    public static double POS_mantissaToDeanery(int[] mantissaArray, int exponentVal) {
        double weighting = 16;
        double val = 0;
        if (exponentVal < 0){
            for (int i = 0; i < exponentVal-1; i++) {
                weighting = weighting *2;
            }
        }else{
            for (int i = 0; i < exponentVal-1; i++) {
                weighting = weighting / 2;
            }
        }

        System.out.println("Start Weighting: " + weighting);

        for (int i = 0; i <= mantissaArray.length-1; i++) {
            if (mantissaArray[i] == 1) {
                val += weighting;
            }
            weighting = weighting / 2;
        }
        return val;
    }

    public static int NEG_exponentToDeanery(int[] exponentArray){
        int weighting = -4;
        int val = 0;
        if (exponentArray[0] == 1){
            val += weighting;
        }
        weighting = 2;
        for (int i=1; i< exponentArray.length-1;i++){
            if (exponentArray[i] ==1){
                val += weighting;
                weighting = weighting/2;
            }
        }
        return val;
    }

    public static int POS_exponentToDeanery(int[] exponentArray) {
        int weighting = 4;
        int val = 0;
        for (int i = 0; i < 3; i++) {
            if (exponentArray[i] == 1) {
                val += weighting;
            }
            weighting /= 2;
        }
        return val;
    }

    public static int[] exponentInArray(String exponentString) {
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = Character.getNumericValue(exponentString.charAt(i));
        }
        return nums;
    }

    public static int[] mantissaInArray(String string) {
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = Character.getNumericValue(string.charAt(i));
        }
        return nums;
    }}
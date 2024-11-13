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
        int exponentVal = binary.POS_exponentToDeanery(exponentArray);
        System.out.println("Your exponent in deanery is: " + exponentVal);




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

    public static int[] mantissaInArray(String string){
        int[] nums = new int [5];
        for (int i =0; i<4;i++){
            nums[i] = string.charAt(i);
        }
        return nums;
    }}

import java.util.Scanner;

/**
 * bianry calculator of a number with sum
 * @author Suyash Patel
 */
public class BinaryCalculator {

    /**
     * converts a given number from decimal form to binary
     * @param number number to be converted
     * @return string representation of the converted number
     */
    public static String binaryConverter(int number) {
        if (number == 0) {
            return "0";
        }
        String binary = "";
        while (number > 0) {
            int remainder = number % 2;
            binary = remainder + binary;
            number = number / 2;
        }
        return binary;
    }

    /**
     * main method
     * @param args arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers would you like to convert?");
        int count = scanner.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\n" + "Binary representation: ");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ": " + binaryConverter(numbers[i]));
        }

        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("\nSum in binary: " + binaryConverter(sum));

        scanner.close();
    }
}

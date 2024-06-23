import java.util.Scanner;

/**
 * calculator
 * @author Suyash Patel
 */
public class Calculator {

    /**
     * main method
     * @param args arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers (either separated by a space or new line): ");
        double first = input.nextDouble();
        double second = input.nextDouble();
        System.out.print("Enter an operator (+ (addition), - (subtraction), " 
            + "* (multiplication), / (division)): ");
        char operator = input.next().charAt(0);
        double result;
        input.close();

        switch(operator) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }

        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}

import java.util.Scanner;

public class BasicArithmetic {
    public static void main(String[] args) {
        /* Declare Variables */
        double firstNum, secondNum;
        double addition, subtraction, division, multiplication;

        /* Create an instance of the Scanner class for getting user input */
        Scanner inputs = new Scanner(System.in);

        /* Prompt user for inputs */
        System.out.print("Enter first number: ");
        firstNum = inputs.nextDouble();
        System.out.print("Enter second number: ");
        secondNum = inputs.nextDouble();

        /* Initialize operations-variables with appropriate operators */
        addition = firstNum + secondNum;
        subtraction = firstNum - secondNum;
        multiplication = firstNum * secondNum;
        division = firstNum / secondNum;

        /* Print results to the screen for users */
        System.out.printf("%.2f + %.2f = %.2f \n", firstNum, secondNum, addition);
        System.out.printf("%.2f - %.2f = %.2f \n", firstNum, secondNum, subtraction);
        System.out.printf("%.2f * %.2f = %.2f \n", firstNum, secondNum, multiplication);
        System.out.printf("%.2f / %.2f = %.2f", firstNum, secondNum, division);

    }
}



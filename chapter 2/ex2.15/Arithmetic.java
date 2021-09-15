/*(Arithmetic) Write an application that asks the user to enter two integers, obtains them
from the user and prints their sum, product, difference and quotient (division). Use the techniques
shown in Fig. 2.7 */

import java.util.Scanner;//program uses class Scanner


public class Arithmetic {
    
    public static void main(String[] args)
    {
        //create scanner to obtain input from the command line
        Scanner input = new Scanner(System.in);

        int number1; //first number for the arithmetic operations
        int number2; //second number for the arithmetic operarions
        int sum; // sum of the  number1 and number2
        int product; //product of number1 and number2
        int diff; //difference between number1 and number2
        int quotient; //quotient of number1 and number2

        System.out.print("Enter first integer: "); //prompt
        number1 = input.nextInt();//read first number from the command line

        System.out.print("Enter second integer: ");//prompt
        number2 = input.nextInt();//read second integer from the command line

        sum = number1 + number2; //add numbers then store the total in sum

        product = number1 * number2; //multipies the numbers and store it in product

        diff = number1 - number2; //evaluates the difference betwwen the numbers and store it in diff

        quotient = number1 / number2; //evaluates quotient and store in quotient

        System.out.printf("%d + %d = %d%n", number1, number2, sum);

        System.out.printf("%d * %d = %d%n", number1, number2, product);

        System.out.printf("%d - %d = %d%n", number1, number2, diff);

        System.out.printf("%d / %d = %d%n", number1, number2, quotient);




    }
}

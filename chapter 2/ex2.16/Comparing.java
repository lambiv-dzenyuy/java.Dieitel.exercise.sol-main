/*(Comparing Integers) Write an application that asks the user to enter two integers, obtains
them from the user and displays the larger number followed by the words "is larger" . If the num-
bers are equal, print the message "These numbers are equal"*/

import java.util.Scanner;//program uses class Scanner

public class Comparing {

    public static void main(String[] args)
    {
        //create scanner to read input from the command line
        Scanner input = new Scanner(System.in);

        int number1; //first number to compare
        int number2; // second number to compare
         
        System.out.print("Enter first integer: "); //prompt
        number1 = input.nextInt(); //read first number from command line

        System.out.print("Enter second integer: "); //prompt
        number2 = input.nextInt(); //read first number from command line

        if (number1 > number2)
            System.out.printf("%d is larger\n", number1);

        if (number1  < number2)
            System.out.printf("%d is larger\n", number2);
            
        if (number2 == number1)
            System.out.printf("These numbers are eqqual\n");
            
    }
    
}

// (Odd or Even) Write an application that reads an integer and determines and prints wheth-
// er it’s odd or even. 

import java.util.Scanner;//program uses Scanner class

public class Oddoreven {
    
    public static void main(String[] args)
    {

        //creating a scanner to read input from the command line
        Scanner input=new Scanner(System.in);

        int number;//number to verified if even or odd


        System.out.print("Enter an integer: ");//prompt
        number = input.nextInt();//reads input from the command line and store it in number

        //checking if numbr is even
        if(number % 2 == 0){
            System.out.printf("%d is an even number%n", number);
        }
        //checking if number is odd
        if(number % 2 != 0){
            System.out.printf("%d is an odd number%n", number);
        }

    }
}

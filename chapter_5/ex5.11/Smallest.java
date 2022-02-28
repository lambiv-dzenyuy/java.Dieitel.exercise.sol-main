//find the smallest value of all values entered by a user
import java.util.Scanner;//program uses Scanner class

public class Smallest 
{
    public static void main(String[] args) 
    {
        //create scanner to read input from command window
        Scanner input = new Scanner(System.in);

        //initialize variables
       
        int smallest;//initialize smallest to be 0 
        int number;//number being entered

        //get number of integers to be entered
        System.out.print("Enter number of integers to be entered: ");//prompt
        int total = input.nextInt();

        //get the first number and put in smallest
        System.out.print("Enter a number: ");//prompt
        smallest  = input.nextInt();

        for (int count = 1; count < total; count++)
        {
            System.out.print("Enter a number: ");//prompt
            number  = input.nextInt();
            if (number < smallest)
                smallest=number;
        }

        System.out.printf("%nThe smallesst of all %d numbers is %d.%n",
        total, smallest);
    }    
}

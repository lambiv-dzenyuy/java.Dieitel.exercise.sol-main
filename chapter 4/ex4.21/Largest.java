//Largest of ten numbers entered

import java.util.Scanner; //program use Scanner class

public class Largest 
{
    public static void main(String[] args)
    {
        //create Scanner to read input from command window
        Scanner input = new Scanner(System.in);

        //initialisation of variables
        int largest=0;
        int number;
        int count=1;

        //loop 10 times to get ten numbers from the command window
        while(count <= 10)
        {
            System.out.print("Enter an integer to compare: ");//prompt
            number= input.nextInt();
            if (number > largest)
                largest = number;
            count++;
        }

        //displaying the largest of all 10 numbers entered
        System.out.printf("%nThe largest of all ten numbers is %d%n%n", largest);
    }    
}

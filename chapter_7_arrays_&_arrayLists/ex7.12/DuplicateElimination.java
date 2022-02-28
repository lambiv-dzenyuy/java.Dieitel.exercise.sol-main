//eliminating duplicated values for a set of values entered by a user
import java.util.Scanner;
import java.util.Arrays;

public class DuplicateElimination 
{
    public static void main(String[] args) 
    {
    //create scanner to read input from the command window
    Scanner input = new Scanner(System.in);

        int[] unique = new int[5];
        int index=0; //last index of filled element in array

        //reading the different inputs from the command window
        for (int count =1; count <= 5; count ++)
        {
            System.out.print("Enter an integer between 10 and 100: ");//prompt
            int current = input. nextInt();
            int counter= 0; //keep track of  if entered element is in array
            
            if (current >= 10 && current <= 100)
            {
               
                for (int number : unique)
                {
                    if(current == number)
                        counter++;
                }
            
            
            //
                if (counter == 0)
                {    
                    System.out.printf("%d is unique%n", current);
                    unique[index]=current;
                    index++;
                }
            }
        }
        System.out.println();
        System.out.printf("The unique elements entered are:%n");
        for (int element : unique)
        {
            if(element != 0)
            System.out.printf("%d ", element);
        }
        System.out.println();
    }    
}

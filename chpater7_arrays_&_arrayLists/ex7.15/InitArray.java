// Initializing the elements of an array to default values of zero.
import java.util.Scanner;//program uses class Scanner

public class InitArray
{
    public static void main(String[] args)

    {
        //create scanerr to read input from the command line
        Scanner input = new Scanner(System.in);

        int[] array;//array to be initialized after setting its size

        int size; //size of the array

        //prompting for input of array size 
        System.out.print("Enter array size: ");//prompt
        try
        {
            size = input.nextInt();
        }
        catch(java.util.InputMismatchException e)
        {
            size =10;
        }
        
        array = new int[size];
        // // declare variable array and initialize it with an array object
        // if (size >= 0)
        // {
        //     array = new int[size];// create the array object
        // }
        // else
        // {
        
        // array = new int[10]; // create the array object
        // }
        System.out.printf("%s%8s%n", "Index", "Value"); // column headings
        // output each array element's value
        for (int counter = 0; counter < array.length; counter++)
        System.out.printf("%5d%8d%n", counter, array[counter]);
    }
} // end class InitArray
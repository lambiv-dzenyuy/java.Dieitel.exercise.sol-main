//rounding Numbers with math.floor
import java.util.Scanner;

public class RoundingNumbers 
{
    public static void main(String[] args) 
    {
        //create Scanner to read input from command window
        Scanner input = new Scanner(System.in);
        
        System.out.printf("%s%n%s%n%s%n%s%n",
            "Enter two double numbers seperated by spaces",
            "Type the end-of-file indicator to terminate input:",
            "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
            "On Windows type <Ctrl> z then press Enter");

        // loop until user enters the end-of-file indicator
        while ( input.hasNext() )
        {
            //reading the two doubles seperated by spaces
            double x = input.nextDouble();
            double y = input.nextDouble();
            double xRounded = Math.floor(x + 0.5);
            double yRounded = Math.floor(y + 0.5);

            //display the rounded numbers
            System.out.printf("%.2f gives %.1f %n%.2f gives %.1f%n%n", x, xRounded, y, yRounded);

        }
    }
}

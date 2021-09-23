//rounding numbers to nearest integers nearest hundreths and nearest thousandths

import java.util.Scanner;

public class RoundingNumbersExtended 
{

    public static void main(String[] args) 
    {
        //create scanner to take input from command window
        Scanner input = new Scanner(System.in);

        //taking number to be rounded
        System.out.print("Enter a double: "); //prompt
        double number = input.nextDouble();
        
        

        System.out.printf("%n%s : %.2f%n%s : %d,%n%s : %.1f,%n%s : %.2f,%n%s : %.3f%n",
            "The double ", number,
            "int", roundToInteger(number),
            "Tenths", roundToTenths(number),
            "Hundredths",roundToHundredths(number),
            "Thousandths", roundToThousandths(number)

        );
    }

    //rouund to integer
    public static int roundToInteger(double number)
    {
        int x = (int) Math.floor(number + 0.5);
        return x;
    } //end roundToInteger

    //round to tenth position
    public static double roundToTenths( double number)
    {
        double x = Math.floor( number * 10 + 0.5 ) / 10;
        return x;
    }//end RoundToTenths

     //
    public static double roundToHundredths(double number)
    {
        double x = Math.floor( number * 100 + 0.5 ) / 100;
        return x;   
    }//end roundToHundredths

    public static double roundToThousandths(double number)
    {
        double x = Math.floor( number * 1000 + 0.5 ) / 1000;
        return x; 
    }//end roundToThousandths
}

//Exponent of a number with any number
import java.util.Scanner;

public class Exponentiation 
{
    public static void main(String[] args) 
    {
        //create Scanner to read input from command window
        Scanner input = new Scanner(System.in);    

        //intialization of the base and the power
        int base; //base of the exponent term
        int power; //power of the exponential
        System.out.print("Enter base of exponent: ");//prompt
        base = input.nextInt(); //read base from command window
        System.out.print("Enter power of exponent: ");
        power = input.nextInt();//read power from command window 

        long result = integerPower(base, power);
        System.out.printf("%nThe exponential of %d and %d = %d%n",base,  power, result);


    }
    
    //calculating the exponential
    public static long integerPower(int a, int b)
    {
        long exp = 1L;
        if (b==0)
            return exp;
        else
            if(b>=1)
            {
                for (int counter=1; counter <=b; counter++ )
                {
                    exp *= a;
                }
            }
        return exp;
    }
}

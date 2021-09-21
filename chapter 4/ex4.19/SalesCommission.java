//sales Commission Calculator
import java.util.Scanner;

public class SalesCommission 
{
    public static void main(String[] args)
    {
        //create Scanner to read input from command window
        Scanner input = new Scanner(System.in);

        //decalaration and initialisation of variables
        int weekPay = 200; //normal weekly pay
        double com = 9/100;//percantage to receive of weekly sales
        double totalSales=0.0;

        double lastItem = 0;//control for loop since the number of items is not known

        while (lastItem != -1)
        {
            System.out.print("\nEnter value of next item or -1 if items are finished: ");//prompt
            double value= input.nextDouble();
            if(value == -1)
            {
                lastItem = -1;   
            }
            else
                totalSales += value;
        }

        double Commission = com*totalSales;

        double total = Commission + weekPay;
        System.out.printf("The Salesperson has earned %.2f this week%n", total);
    }    
}

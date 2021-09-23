//charges paid by customers for car parking
import java.util.Scanner;

public class ParkCharges 
{
    public static void main(String[] args) 
    {
        //create Scanner to read input from command window
        Scanner input = new Scanner(System.in);

        //variables 
        double total = 0.0; //assume total for yesterday for yesterday is 0 at start
        double current=0.0; //assume current customer charges is 0


        //prompt for and get yesterdays customers
        System.out.print("Enter the number of customers who came in yesterday: ");//prompt
        int customers = input.nextInt(); 

        //loop for and get all customer charges
        for (int counter = 1; counter <= customers; counter++)
        {
            System.out.print("Enter number of hours of current customer: ");//prompt
            double hours = input.nextDouble(); //hours of current customer

            //calculating current customers charges
            double customercharge =calculateCharges(hours);
           total += customercharge;
           System.out.printf("%nCurrent customer charge: %.2f%n", customercharge);
           System.out.printf("Total runnng charges of yesterday: %.2f%n%n", total);

            
        }
    }
    
    public static double calculateCharges(double hours)
    {
        double normalCharge = 2.00; //minimum charge paid for up to 3hrs
        double excessChrgePerHour = 0.50; //charge per hour for over 3 hours
        double customerTotalCharge = 0.0;

        if (hours <= 3)
        {
            customerTotalCharge = normalCharge;
        }
        if (hours <24)
        {
            double excessPaid = (hours - 3) * excessChrgePerHour; //total paid on top of the normal 2.00$
            customerTotalCharge =excessPaid + normalCharge;
        }
        else
            customerTotalCharge = 10.00; //maximum pay for 24 hours


        return customerTotalCharge;
    }
}

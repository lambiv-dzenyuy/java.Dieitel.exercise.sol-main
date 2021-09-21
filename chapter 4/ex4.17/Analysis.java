
import java.util.Scanner;



public class Analysis 
{
    public static void main(String[] args)
    {
        //create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        //initializing vairable in declarations
        int litres = 0;
        int miles = 0;
        int tripCount = 1;

        //take number of trips to be entered
        System.out.print("Enter the number of trips which you have covered so far: ");
        int trips= input.nextInt();


        //process 10 students using counter-controlled loop
        while (tripCount <= trips)
        {
            //prompt user for input and obtain value from user
            System.out.print("Enter result number of litters :");
            int l = input.nextInt();
            litres += l;//increements total litres consumed so far
            System.out.print("Enter result number of miles :");
            int r = input.nextInt();
            miles += r; //increment total miles covered so far

            double milesPergallon = (double) r/l;
            //printing number of miles per gallon for each trip
            System.out.printf("%n%.2f miles were covered during this trip %n%n", milesPergallon);

            tripCount++;

            
        }

        //calculating overal miles covered for all trips
        double total = (double) miles/litres;

        //displaying total miles covered per galloon for all trips
        System.out.printf("%n%.2f litres covered per galloon for all trips so far.%n", total);



       
    }    
}

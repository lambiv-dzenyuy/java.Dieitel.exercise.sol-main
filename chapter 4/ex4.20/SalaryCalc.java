import java.util.Scanner;//program uses class Scanner

public class SalaryCalc 
{
    public static void main(String[] args)
    {
        //create scanner to take input from the command window
        Scanner input = new Scanner(System.in);

        //variable declaration and initialisation
        String name;
        int totalHours;
        int ratePerHour;

        String last = "no";//keep track if its the last employee
        
        //taking input from the user
        while (last == "no")
        {
            System.out.print("Are you entering the last employee?  yes/no :");//prompt
            last = input.nextLine();

            System.out.print("%nEnter employee name: ");//prompt
            name = input.nextLine();

            System.out.print("Enter total hours covered in the last week: ");//prompt
            totalHours = input.nextInt();

            System.out.print("Enter employee's rate per hour: ");//prompt
            ratePerHour = input.nextInt();//read input from command window and store in ratePerHour

            //
           
            int excessHours=0;
            int totalPay=0;
            if (totalHours > 40){
                //calculate pay for the normal hours in this case 40
                totalPay = 40*ratePerHour;

                //calculating excess and excess pay
                excessHours = totalHours - 40;
                //calculate pay for excess
                int excessPay = excessHours *(ratePerHour / 2);

                totalPay += excessPay;
            }
            else
            {
                totalPay = totalHours*ratePerHour;

            }
            System.out.printf("%nThe employee %s has a gross pay of %d %n", name, totalPay);

        }
    }    
}

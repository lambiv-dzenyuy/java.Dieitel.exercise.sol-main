import java.util.Scanner;//program uses class Scanner

public class CreditLimit 
{
    public static void main(String[] args)
    {
        //create scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        //initialize variable in declaration
        int accountNumber=0;
        int previousBalance;
        int totalCharges;
        int totalCredit;
        int allowedCredit;

        int res = 0; //keep track if customers left
        

        while (res != -1 )
        {
        System.out.print("Enter Acccount Number or -1 if it is the last customer: ");//prompt
        int takeIn = input.nextInt(); //read value from command window and assign to takeIn
        if (takeIn != -1)
        {
            accountNumber = takeIn;
        }
        else if (takeIn == -1)
        {
            res = -1;
            System.out.print("Enter Acccount Number: ");
            accountNumber = input.nextInt();
        }
        //take input for previous balance
        System.out.printf("%nEnter previous month balance for account: ");//prompt
        previousBalance = input.nextInt();
         //take input for items charged
         System.out.printf("%nEnter total  charges by the customer this month :");//prompt
         totalCharges = input.nextInt();
         //take input for total credit
         System.out.printf("Enter total credit of customer: ");//prompt
         totalCredit = input.nextInt();
        //take input for allowd credit
        System.out.printf("%nEnter allowed credit of customer: ");//prompt
        allowedCredit = input.nextInt();

        //calculate new balance
        int balance = (previousBalance + totalCharges -totalCredit);
        
        //display account balance
        System.out.printf("%nAccount number %d this month has ablance of %d%n%n", accountNumber, balance);

        if(balance > allowedCredit)
        {
            System.out.println("Credit limit exceeded \n");
        }
        }
    }
    
}

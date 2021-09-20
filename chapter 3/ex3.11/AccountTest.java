import java.util.Scanner;



public class AccountTest {
    
    public static void main(String[] args)
    {
        //create two Acoount objects
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        //display initial balance of each object
        System.out.printf("%s balance : $%.2f%n%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance : $%.2f%n%n", account2.getName(), account2.getBalance());

        //create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");//prompt
        double depositAmount=input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);//add to account1's balance 
        

        //display balances
        System.out.printf("%s balance: $%.2f%n%n",account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");//prompt
        depositAmount=input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);//add to account1's balance5

        //display balances
        System.out.printf("%s balance: $%.2f%n%n",account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",account2.getName(), account2.getBalance());


        System.out.print("Enter Withdraw amount for account1: ");//prompt
        double withdrawAmount=input.nextDouble();
        System.out.printf("%nsubtracting %.2f from account1 balance%n%n", withdrawAmount);
        account1.withdraw(withdrawAmount);//subtract from account1's balance 
        

        //display balances
        System.out.printf("%s balance: $%.2f%n%n",account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",account2.getName(), account2.getBalance());

        System.out.print("Enter withdraw amount for account2: ");//prompt
        withdrawAmount=input.nextDouble();
        System.out.printf("%nsubtracting %.2f to account2 balance%n%n", withdrawAmount);
        account2.withdraw(withdrawAmount);//subtract from account3's balance

        //display balances
        System.out.printf("%s balance: $%.2f%n%n",account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",account2.getName(), account2.getBalance());


        

    }
}

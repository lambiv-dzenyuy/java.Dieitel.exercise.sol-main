

// Account class with a constructor that initializes the name


public class Account 
{

    private String name;//instance of a variable
    private double balance;//instance variable

    //constructor initializes name with parameter name
    public Account(String name, double balance)// constructor name is class name
    {
        this.name=name;//assign name to instance variable name

        //validate that the balance is greater than 0.0; if its not
        //instance variable keeps default initial value of 0.0
        if (balance > 0.0)//if balance is valid
            this.balance=balance; // assign it to instance variable 
    }

    //method that deposits (adds) only a valid amount of the balance
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0) //if depositAmount is valid
            balance=balance + depositAmount; //add  it to the balance
    }

    //method returns the account balance
    public double getBalance()
    {
        return balance;
    }

    //method to withdraw (subtract) only a valid amount of withdraw 
    public void withdraw(double withdrawAmount)
    {
        if (withdrawAmount >=0.0 && withdrawAmount <balance)//if withdraw amount isvalid
            balance = balance - withdrawAmount; //subtract it from the balance
        
        if(withdrawAmount > balance)
            System.out.println("Withdrawal amount exceeded account balance");
    }


    //method to set the name in an object
    public void setName(String name)
    {
        this.name = name;//store the name
    }

    //method to retrive the name from the object
    public String getName()
    {
        return name;//return value of name to the caller
    }
}//end of class Account
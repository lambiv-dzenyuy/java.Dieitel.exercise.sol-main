package ex8.six;

public class SavingsAccount {
	private static float annualInterestRate; // annual interest rate for all accounts
	private float savingsBalance; //amount currently in deposit
	
	public SavingsAccount(float amount)
	{
		savingsBalance = amount;
	}
	
	//method to calculate monthly interest rate
	public float calculateMonthlyInterest()
	{
		return (((annualInterestRate/100)*savingsBalance)/12)+savingsBalance ;
	}
	
	//static method to modify annual interest rate
	public static void modifyInterestRAte(float l)
	{
		annualInterestRate = l;
	}
	

}

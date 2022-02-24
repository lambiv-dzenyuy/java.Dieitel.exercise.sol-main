package ex8.six;

public class SavingsAccountTest {
	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		SavingsAccount.modifyInterestRAte(4);
		System.out.println("monthly interest for each saver at 4% annualInterestRate");
		String header = String.format("%-8s%-6s", "Account","Annual interest");
		System.out.println(header);
		System.out.printf("%-8s%6.3f", "saver1", saver1.calculateMonthlyInterest());
		System.out.println();
		System.out.printf("%-8s%6.3f", "saver2", saver2.calculateMonthlyInterest());
		System.out.println();
		System.out.println();
		
		//modifying the interest rate 
		SavingsAccount.modifyInterestRAte(5);
		System.out.println("monthly interest for each saver at 5% annualInterestRate");
		
		System.out.println(header);
		System.out.printf("%-8s%6.3f", "saver1", saver1.calculateMonthlyInterest());
		System.out.println();
		System.out.printf("%-8s%6.3f", "saver2", saver2.calculateMonthlyInterest());
	}
	

}

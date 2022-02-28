//calculating th compound interest using a for 

public class Interest 
{
    
    public static void main(String[] args)
    {
       
        for (int count =5; count <= 10; count++)
        {
            double amount;// amount on deposite at the end of each year 
            double principal=1000.0;//initial amount before interest
            
            double rate= (double) count/100; //interest rate
            //display current interest rate
            System.out.printf("With an interest rate of %d%%%n",count );
             //dissplay headerss 
            System.out.printf("%s%20s%n", "Year", "Amount on deposit");
      
            //calculate amount on deposit for ten years
            for (int year = 1; year <=10; year++)
            {
                //calculate new amount for specified year
                amount = principal * Math.pow(1.0+rate, year);
            
                //display the year and the amount
                System.out.printf("%4d%20.2f%n", year, amount);

            }
        }
    }
}

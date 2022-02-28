package chapter9.ex9.three;

class CommissionEmployee
{
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;
   private double grossSales; // gross weekly sales
   private double commissionRate; // commission percentage

   // five-argument constructor
   public CommissionEmployee(String firstName, String lastName,
                             String socialSecurityNumber, double grossSales,
                             double commissionRate)
   {
      // implicit call to Object constructor occurs here

      // if grossSales is invalid throw exception
      if (grossSales < 0.0)
         throw new IllegalArgumentException(
                 "Gross sales must be >= 0.0");

      // if commissionRate is invalid throw exception
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
                 "Commission rate must be > 0.0 and < 1.0");

      this.firstName = firstName;
      this.lastName = lastName;
      this.socialSecurityNumber = socialSecurityNumber;
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } // end constructor

   // return first name
   public String getFirstName()
   {
      return firstName;
   }

   // return last name
   public String getLastName()
   {
      return lastName;
   }

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   }

   // set gross sales amount
   public void setGrossSales(double grossSales)
   {
      if (grossSales < 0.0)
         throw new IllegalArgumentException(
                 "Gross sales must be >= 0.0");

      this.grossSales = grossSales;
   }

   // return gross sales amount
   public double getGrossSales()
   {
      return grossSales;
   }

   // set commission rate
   public void setCommissionRate(double commissionRate)
   {
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
                 "Commission rate must be > 0.0 and < 1.0");

      this.commissionRate = commissionRate;
   }

   // return commission rate
   public double getCommissionRate()
   {
      return commissionRate;
   }

   // calculate earnings
   public double earnings()
   {
      return getCommissionRate() * getGrossSales();
   }

   // return String representation of CommissionEmployee object
   @Override
   public String toString()
   {
      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
              "commission employee", getFirstName(), getLastName(),
              "social security number", getSocialSecurityNumber(),
              "gross sales", getGrossSales(),
              "commission rate", getCommissionRate());
   }
}

class BasePlusCommissionEmployee
{
   private double baseSalary; // base salary per week

   private  CommissionEmployee employee;

   // six-argument constructor
   public BasePlusCommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate, double baseSalary)
   {
      this.employee = new CommissionEmployee(firstName, lastName, socialSecurityNumber,
         grossSales, commissionRate);                      

      // if baseSalary is invalid throw exception
      if (baseSalary < 0.0)                   
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");  

      this.baseSalary = baseSalary;
   }

   //two argument constructor
   public BasePlusCommissionEmployee(float baseSalary, CommissionEmployee e)
   {
      employee = e;

      // if baseSalary is invalid throw exception
      if (baseSalary < 0.0)
         throw new IllegalArgumentException(
                 "Base salary must be >= 0.0");

      this.baseSalary = baseSalary;
   }
   
   // set base salary
   public void setBaseSalary(double baseSalary)
   {
      if (baseSalary < 0.0)                   
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");  

      this.baseSalary = baseSalary;                
   } 

   // return base salary
   public double getBaseSalary()
   {
      return baseSalary;
   } 

   // calculate earnings

   public double earnings()
   {
      return getBaseSalary() + employee.earnings();
   }

   // return String representation of BasePlusCommissionEmployee
   @Override
   public String toString()
   {
      return String.format("%s %s%n%s: %.2f", "base-salaried",
         super.toString(), "base salary", getBaseSalary());   
   } 
} // end class BasePlusCommissionEmployee



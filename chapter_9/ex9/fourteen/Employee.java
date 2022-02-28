package chapter9.ex9.fourteen;

public class Employee {
    protected final String firstName;
    protected final String lastName;
    protected final String socialSecurityNumber;
    protected double grossSales; // gross weekly sales

    // four-argument constructor
    public Employee(String firstName, String lastName,
                              String socialSecurityNumber, double grossSales)
    {
        // implicit call to Object constructor occurs here

        // if grossSales is invalid throw exception
        if (grossSales < 0.0)
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0");

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
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

}

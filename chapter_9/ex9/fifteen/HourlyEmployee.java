package chapter9.ex9.fifteen;

public class HourlyEmployee extends Employee
{
    private double hoursWorked; //number of hours worked;
    private double wage; // wage paid per hour

    // constructor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double hoursWorked, double wage) {
        super(firstName, lastName, socialSecurityNumber, grossSales);
        this.hoursWorked = hoursWorked;
        this.wage = wage;
    }

    public void setHoursWorked(double hoursWorked)
    {
        if(hoursWorked>0 && hoursWorked<=168)
            this.hoursWorked = hoursWorked;
    }

    public void  setWage(double wage)
    {
        if(wage<0)
            throw new IllegalArgumentException("Wage must be >= 0.0");
        else
            this.wage = wage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getWage() {
        return wage;
    }

    // return String representation of CommissionEmployee object
    @Override
    public String toString()
    {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "commission employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber(),
                "gross sales", getGrossSales(),
                "hours worked per week", getHoursWorked(),
                "Wage per hour", getWage()
                );
    }
}

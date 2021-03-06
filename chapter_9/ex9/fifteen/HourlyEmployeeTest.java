package chapter9.ex9.fifteen;

public class HourlyEmployeeTest {
    public static void main(String[] args)
    {
        // instantiate CommissionEmployee object
        HourlyEmployee employee = new HourlyEmployee(
                "Sue", "Jones", "222-22-2222", 10000, 100,45);

        // get commission employee data
        System.out.println(
                "Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is",
                employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is",
                employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is",
                employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is",
                employee.getGrossSales());
        System.out.printf("%s %.2f%n", "No of hours of worked in a week is",
                employee.getHoursWorked());
        System.out.printf("%s %.2f%n", "wage rate per hour is",
                employee.getWage());

        employee.setGrossSales(5000);
        employee.setWage(100);

        System.out.printf("%n%s:%n%n%s%n",
                "Updated employee information obtained by toString", employee);
    } // end main
}

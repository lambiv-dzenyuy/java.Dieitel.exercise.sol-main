public class Employee {
    
    private String firstName; //instance variable
    private String lastName; //instance variable
    private double salary;//instance variable of monthly salary

    public Employee(String firstName, String lastName, double salary)
    {
        this.firstName = firstName; //assign firstName to firstName
        this.lastName = lastName; //assign lastName to lastName
        if (salary > 0)
            this.salary = salary; //assign salary to salary
    }

    //method to set firstName
    public void setFirstName(String firstName)
    {
        this.firstName = firstName; //store firstName
    }

    //method to get firtName
    public String getFirstName()
    {
        return firstName; //return value firstName to caller
    }

    //method to set lastName
    public void setLastName(String lastName)
    {
        this.lastName = lastName; //store lastName
    }

    //method to get lastName
    public String getLastName()
    {
        return lastName;//return value lastName to the caller
    }

    //method to set the salary
    public void setSalary(double salary)
    {
        if(salary > 0)
            this.salary = salary; //store salary
    }

    //method to get salary
    public double getSalary()
    {
        return salary; //return value salary to the caller
    }
}

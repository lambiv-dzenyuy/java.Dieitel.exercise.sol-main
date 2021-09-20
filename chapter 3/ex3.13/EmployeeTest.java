public class EmployeeTest
{

    public static void main(String[] args)
    {
        //create two employee object 
        Employee employee1 = new Employee("Chris", "Trus", 250000);
        Employee employee2 = new Employee("Max", "Bright", 500000);

        //Display employee yearly salary
        System.out.printf("employee1:%n %s %s has a yearly salary of %.2f%n%n%n",
        employee1.getFirstName(),employee1.getLastName(), 12*employee1.getSalary());
        System.out.printf("employee2:%n %s %s has a yearly salary of %.2f%n%n%n",
        employee2.getFirstName(),employee2.getLastName(), 12*employee2.getSalary());

        //augmenting salary by 10%
        double salary1 = employee1.getSalary() + (employee1.getSalary()*0.1);//add  employee1 salary by 10%
        //setting employee salary to augmented salary
        employee1.setSalary(salary1);
        System.out.printf("%nadding $.2f to employee1 salary%n%n", (employee1.getSalary()*0.1));

        double salary2= employee2.getSalary() + (employee2.getSalary()*0.1);
         //setting employee salary to augmented salary
         employee2.setSalary(salary2);
        
        System.out.printf("%nadding $.2f to employee1 salary%n%n", (employee2.getSalary()*0.1));
        System.out.println("\n\ndone!! adding\n\n");

       

        //Display employee new yearly salary
        System.out.printf("employee1:%n %s %s has augmented yearly salary of %.2f%n%n%n",
        employee1.getFirstName(),employee1.getLastName(), 12*employee1.getSalary());
        System.out.printf("employee2:%n %s %s has augmented yearly salary of %.2f%n%n%n",
        employee2.getFirstName(),employee2.getLastName(), 12*employee2.getSalary());


        

    }
    
}

package Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRefrances {
    public String name;
    public String salary;



    public void showeEmployeeAndSalaryMsg(){

        Scanner read = new Scanner(System.in);
        System.out.println("Enter Employee name: ");
        name = read.next();

        System.out.println("Enter Employee Salary: ");
        salary = read.next();

        System.out.println("the Employy Name is : " + name);
        System.out.println("his salaty is : " + salary +" OMR");
        System.out.println("You have add one Employee successfully \n");

    }

    public void showAllEmployeeWithSalary(){

    }
}

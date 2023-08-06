import Employee.EmployeeRefrances;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<EmployeeRefrances> empArray = new ArrayList<>();
        System.out.println("** Salary Management System **\n");
        System.out.println("Choose one option: ");
        System.out.println("1. Create new Employee with salary");
        System.out.println("2. Show All Employees");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();

        switch (choice){
            case 1:
                EmployeeRefrances employee1 = new EmployeeRefrances();
                employee1.showeEmployeeAndSalaryMsg();

                EmployeeRefrances employee2 = new EmployeeRefrances();
                employee2.showeEmployeeAndSalaryMsg();

                EmployeeRefrances employee3 = new EmployeeRefrances();
                employee3.showeEmployeeAndSalaryMsg();


                empArray.add(employee1);
                empArray.add(employee2);
                empArray.add(employee3);

                break;

            case 2:
                System.out.print("Employee Name" + "\t" + "Salary" + "\n");

                for (int i = 0; i < empArray.size(); i++) {

                    String employeeName = empArray.get(i).name;
                    System.out.print(employeeName + "\t");

                    String employeeSalary = empArray.get(i).salary;
                    System.out.println("\t\t" +employeeSalary + " OMR\t");
                    break;

                }
                System.out.println("\nthese all information about employee...\n Thank You for your Request");
        }


    }
}
package UsingASwitchStatementInJava;

// EmployeeBonus2.java - This program calculates an employee's yearly bonus. 
 
import java.util.Scanner;
 
public class EmployeeBonus2 
{
  public static void main(String args[])
  {
    // Declare and initialize variables.
    String employeeName; 
    String salaryString; 
    double employeeSalary;  
    String ratingString;
    int employeeRating; 
    double employeeBonus;
    final double BONUS_1 = .25;
    final double BONUS_2 = .15;
    final double BONUS_3 = .10; 
    final double NO_BONUS = 0.00;
    final int RATING_1 = 1;
    final int RATING_2 = 2;
    final int RATING_3 = 3; 
    
    // This is the work done in the housekeeping() method
    // Get user input.    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter employee's name: ");
    employeeName = input.nextLine();
    System.out.print("Enter employee's yearly salary: ");
    salaryString = input.nextLine();
    System.out.print("Enter employee's performance rating: ");
    ratingString = input.nextLine();
 
    // Convert Strings to int or double.
    employeeSalary = Double.parseDouble(salaryString);
    employeeRating = Integer.parseInt(ratingString);
    
    // This is the work done in the detailLoop() method
    // Use switch statement here to calculate bonus based on rating.
 
    switch (employeeRating) {
        case 1: employeeBonus = BONUS_1 * employeeSalary;
                break;
        case 2: employeeBonus = BONUS_2 * employeeSalary;
                break;
        case 3: employeeBonus = BONUS_3 * employeeSalary;
                break;
        default: employeeBonus = NO_BONUS * employeeSalary;
                break;
    }
    
    // This is the work done in the endOfJob() method     
    // Output.  
    System.out.println("Employee Name " + employeeName);
    System.out.println("Employee Salary $" + employeeSalary);
    System.out.println("Employee Rating " + employeeRating);
    System.out.println("Employee Bonus $" + employeeBonus);
    input.close();
    System.exit(0);
  }
}   
 


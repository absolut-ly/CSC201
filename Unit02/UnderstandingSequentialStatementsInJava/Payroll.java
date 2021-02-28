package UnderstandingSequentialStatementsInJava;

// This program calculates an employee's take home pay. 
import java.util.Scanner;

public class Payroll
{
	public static void main(String args[])
	{
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your salary:");
		double salary = userInput.nextDouble();
		double stateTax = salary * .065;
		double federalTax = salary * .28;
        System.out.println("Enter number of dependents");
		double numDependents = userInput.nextDouble();
		double dependentDeduction = numDependents * (salary * .025);
		double totalWithholding = stateTax + federalTax + dependentDeduction;
		double takeHomePay = salary - totalWithholding;

		// Calculate state tax here.

		System.out.println("State Tax: $" + stateTax);
		// Calculate federal tax here. 

		System.out.println("Federal Tax: $" + federalTax);
		// Calculate dependant deduction here.

		System.out.println("Dependents: $" + dependentDeduction);
		// Calculate total withholding here.

		// Calculate take home pay here.

		System.out.println("Salary: $" + salary);
		System.out.println("Take-Home Pay: $" + takeHomePay);
		userInput.close();
		System.exit(0);
	}
}

package UnderstandingNestedIfStatementsInJava;

// EmployeeBonus.java - This program calculates an employee's productivity bonus. 
 
import java.util.Scanner;
 
public class EmployeeBonus 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        // Declare and initialize variables here.
        String employeeName; 
        double numTransactions; 
        String transactString;
        double numShifts; 
        String shiftString;
        double dollarValue;
        String dollarString;
            double score;
        double bonus = 0;
        final double BONUS_1 = 50.00;
        final double BONUS_2 = 75.00;
        final double BONUS_3 = 100.00; 
        final double BONUS_4 = 200.00;
        
                
        // This is the work done in the housekeeping() method
        System.out.println("Enter employee's name: ");
        employeeName  = s.nextLine();
        System.out.println("Enter number of shifts: ");
        shiftString  = s.nextLine();
        System.out.println("Enter number of transactions: ");
        transactString  = s.nextLine();
        System.out.println("Enter transactions dollar value: ");
        dollarString  = s.nextLine();
 
        numShifts = Double.parseDouble(shiftString);
        numTransactions = Double.parseDouble(transactString);
        dollarValue = Double.parseDouble(dollarString);
        // This is the work done in the detailLoop() method
        // Write your code here
 
        score = (dollarValue / numTransactions) / numShifts;
        System.out.println("Score value: " + score);
 
        if (score >= 0) {
            bonus = BONUS_1;
            if (score > 30) {
                bonus = BONUS_2;
                if (score > 69) {
                    bonus = BONUS_3;
                    if (score > 199) {
                        bonus = BONUS_4;
                        } //end greater than 200
                    } //end 70-199
                } //end 31-69
            } //end less than 30
        
        // This is the work done in the endOfJob() method   
        // Output.  
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Bonus: $" + bonus);
        s.close();
        System.exit(0);
    }
} 
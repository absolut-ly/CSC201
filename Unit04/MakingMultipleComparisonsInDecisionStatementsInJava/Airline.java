package MakingMultipleComparisonsInDecisionStatementsInJava;

// Airline.java - This program determines if an airline passenger is 
// eligible for a 25% discount. 
 
import java.util.Scanner;
 
public class Airline 
{
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        String passengerName = "";  // Passenger's name.
        String ageString = "";          // String version of passenger's age.
        int passengerAge = 0;   // Passenger's age.
 
        // This is the work done in the housekeeping() method
        System.out.println("Enter passenger's name: ");
        passengerName  = s.nextLine();
        System.out.println("Enter passenger's age: ");
        ageString  = s.nextLine();
        s.close();
        
        passengerAge = Integer.parseInt(ageString);
        
        // This is the work done in the detailLoop() method 
        // Test to see if this customer is eligible for a 25% discount. 
        if (passengerAge < 7 || passengerAge >= 65)
            System.out.println("Passenger is eligible for a discount.");
        else
            System.out.println("Passenger is not eligible for a discount.");
 
        
 
        // This is the work done in the endOfJob() method
        System.exit(0);
    }
 
} 
package CircleOperation;

/**
* @author: Sam Castle
* Course/Section: CSC201-DL003
* Project: CircleOperations.java
* @param This program is intended to calculate the area, diameter, or 
*		circumference of a circle based on a user-defined radius. 
*/

import java.util.Scanner; 
import java.lang.Math;

public class circleOperations {

    public static void main(String[] args){

        // printHeading() simulated method
        System.out.println("        --- +++ Circle Operations +++ ---        ");
        
        Scanner userInput = new Scanner(System.in);
        double radius = 0;

        // simulated method for in take of user radius value.
        do {
        System.out.println("Please enter your desired radius in numeric form:");
        String strRadius = userInput.nextLine();
        try {
            radius = Double.parseDouble(strRadius);
            if (radius <= 0)
            	System.out.println("Radius must be greater than zero.");
        }
        catch (Exception e) {
            System.out.println("'" + strRadius + "' is an invalid input.");
        }
        System.out.println();
        } while (radius <= 0);
        
        // simulated method for in take of user operation.
    	double calculation = radius; // variable for storing the final value of the calculation
        String operation; // variable for the printed statement at the end
        do {
        System.out.println("Please enter a selection for desired operation:");
        System.out.println("|  A: Area  |  C: Circumference  |  D: Diameter  |");
        String strUserOperation = userInput.next().toUpperCase(); 
        
        if (strUserOperation.equals("AREA"))
        	strUserOperation = "A";
        if (strUserOperation.equals("CIRCUMFERENCE"))
        	strUserOperation = "C";
        if (strUserOperation.equals("DIAMETER"))
        	strUserOperation = "D";
        
        switch (strUserOperation) {
        case "D":   operation = "the circle's diameter is equal to ";
        			calculation = radius * 2;
        			break;
        case "C":   operation = "the circle's circumference is approximately equal to ";
        			calculation = 2 * Math.PI * radius;
        			break;
        case "A":	operation = "the circle's area is approximately equal to ";
        			calculation = Math.PI * (radius * radius);
        			break;
        default:	operation = "'" + strUserOperation + "' is an invalid input.";
        			break;
        }
        if (calculation == radius)
        	System.out.println(operation);
        } while (calculation == radius);

        System.out.println("For a radius of " + radius + ", " + operation + calculation);
        userInput.close();
    } //end main
}
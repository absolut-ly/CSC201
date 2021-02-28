package ArrayBasicsInJava;

import java.util.Scanner;
public class BattingAverage
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		// Declare a named constant for array size here.
		int arraySize = 8;

		// Declare array here.
		double[] averages = new double[arraySize];

		// Use this integer variable as your loop index.
		int loopIndex; 

		// Use this variable to store the batting average input by user.
		double battingAverage;

		// String version of batting average input by user.
		String averageString; 

		// Use these variables to store the minimum and maximum batting averages.
		double min, max;

		// Use these variables to store the total and the average.
		double total, average; 

		// Write a loop to get batting averages from user and assign to array.
		for (int i = 0; i < averages.length; i++){
		   System.out.println("Enter a batting average: ");
		
		   averageString  = s.nextLine();
		   battingAverage = Double.parseDouble(averageString);
		   // Assign value to array.
		   averages[i] = battingAverage;
        }
		// Assign the first element in the array to be the minimum and the maximum.
		min = averages[0];
		max = averages[0];
		// Start out your total with the value of the first element in the array.
		total = averages[0]; 
		// Write a loop here to access array values starting with averages[1]
		for (int i = 1; i < averages.length; i++) {
		   // Within the loop test for minimum and maximum batting averages.
		   if (averages[i] < min){
               min = averages[i];
           }
           else if (averages[i] > max){
               max = averages[i];
           }

		   // Also accumulate a total of all batting averages.
		   total = total + averages[i];
    }
		   
		// Calculate the average of the 8 averages.
		average = total / averages.length;

		// Print the averages stored in the averages array. 
		for (int i = 0; i < averages.length; i++){
            System.out.println(averages[i]);
        }
		// Print the maximum batting average, minimum batting average, and average batting average. 
		System.out.println("Minimum batting average is " + min);
        System.out.println("Maximum batting average is " + max);
		System.out.println("Average batting average is " + average);
		s.close();
		System.exit(0);

	}
}


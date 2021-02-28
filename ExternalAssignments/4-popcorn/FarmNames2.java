package popcorn;

import java.io.*;
import java.util.*;

/**
 * <h1>CSC201 Assignment 4: Popcorn</h1>
 * This app takes a list, formatted as 
 * <li>(Farm Name)(comma) (#Acres Planted) (space) (#Pints of Popcorn)</li>
 * and produces a chart in console that displays the data in specific format. 
 * @author Sam Castle
 * @version 2.0
 */
public class FarmNames2 {

	public static void main(String[] args){
		System.out.println("CSC201 Assignment #4: Popcorn Co-op ver.2"); // printHeading()
		Scanner input = new Scanner(System.in);
		BufferedReader workingFile = null;
		ArrayList<String> farmNames = new ArrayList<String>();
		ArrayList<Integer> pValue = new ArrayList<Integer>();

		while (true) {
			try {
				System.out.println("Please enter a filename");
				workingFile = new BufferedReader(new FileReader(input.nextLine()));
				String line;
				while ((line = workingFile.readLine()) != null) {     //for each line in the list,
					String[] strArray = line.split(",");			  //split by comma delimiter, 
					String[] numArray = strArray[1].trim().split(" ");//trim leading whitespace
					double acre = Double.parseDouble(numArray[0]);	  //and split again by space  
					double pint = Double.parseDouble(numArray[1]);    //delimiter. Parse to double
					farmNames.add(strArray[0]);						  //and assign appropriately
					pValue.add((int) (pint/acre));
				}
				input.close();
				break;
			} catch (IOException e) {
				System.out.println("There was a problem with your file name");
			}			
		} //end while

		outputHeading("%-30s %-30s\n");
		for (int i = 0; i < farmNames.size(); i++) {
			output(farmNames.get(i), pValue.get(i)/25);
		}
		System.exit(0);
	}// end main()

	/**
	 * Preset output header for chart
	 * @param f Format to use for chart formatting. Must have 2 String arguments and line break.
	 */
	public static void outputHeading(String f) {
		System.out.println(" ".repeat(20) + "Popcorn Co-op");
		System.out.printf(f, "", "Production in Hundreds");
		System.out.printf(f, "", "of Pint Jars per Acre");
		System.out.printf(f, "Farm Name", "   1   2   3   4   5   6");
		System.out.printf(f, "", "---|".repeat(6));
	}

	/**
	 * Takes as input the name of a farm and that farm's quantity of pints per acre. Based on the 
	 * criteria, it outputs a star for each 25 pints, identifies the line for 400 pints per acre 
	 * with a pipe ("|"), and replaces the pipe with a hash ("#") if the value is greater than 
	 * or equal to 400 p/a. Inputs greater than [24] will display as off the chart.
	 * @param farm Name of farm associated with the quantity data.
	 * @param pints Number to represent quarters of 100 pints per acre: [(Pints/Acre) / 25]. 
	 */
	public static void output(String farm, int pints) {
		String stars = "";
		if (pints < 16) {
			stars = "*".repeat(pints) + " ".repeat(15-pints) + "|";
		}
		else {
			stars = "*".repeat(15) + "#" + "*".repeat(pints-16);
		}
		System.out.printf("%-30s %-30s\n", farm, stars);
	}
}// end FarmNames class
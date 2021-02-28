package SearchingAnArrayForAnExactMatchInJava;

// MichiganCities.java - This program prints a message for invalid cities in Michigan.  
// Input:  Interactive.
// Output:  Error message or nothing.


import java.util.Scanner;

public class MichiganCities
{
   public static void main(String args[]) throws Exception
   {
      // Declare variables.
      String inCity; // name of city to look up in array.
      // Initialized array of cities in Michigan.
      String citiesInMichigan[] = {"Acme", "Albion", "Detroit", "Watervliet", "Coloma", "Saginaw", "Richland", "Glenn", "Midland", "Brooklyn"}; 
      boolean foundIt = false;  // Flag variable.
      int x; // Loop control variable.

      // Get user input.
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the name of the city: ");
     inCity = input.nextLine();
     input.close();
      // Write your loop here.   
      for (x = 0; x < citiesInMichigan.length; x++){
         // Write your test statement here to see if there is 
         // a match.  Set the flag to true if city is found. 
         if (inCity.equals(citiesInMichigan[x])){
             foundIt = true;
         }
      }
      
      // Test to see if city was not found to determine if 
      // "Not a city in Michigan" message should be printed.

      if (foundIt == true){
          System.out.println("City found");
      }
      else {
          System.out.println("Not a city in Michigan.");
      }
      
      
      System.exit(0);

   } // End of main() method.
} // End of MichiganCities class.

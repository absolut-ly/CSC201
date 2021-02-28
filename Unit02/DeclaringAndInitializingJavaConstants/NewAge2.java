package DeclaringAndInitializingJavaConstants;

// This program calculates your age in the year 2050.
// Input:  None.
// Output: Your current age followed by your age in 2050.

public class NewAge2
{
   public static void main(String args[])
   {
      int currentAge = 25;
      int newAge;
      int currentYear = 2014;
      // Declare a constant named YEAR and initialize it to 2050
      final int YEAR = 2050;

      // Edit this statement so that it uses the constant named YEAR.
      newAge = currentAge + (2050 - YEAR);

      System.out.println("My Current Age is " + currentAge);
      // Edit this output statement so that is uses the constant named YEAR. 
      System.out.println("I will be " + newAge + " in " + YEAR);

      System.exit(0);
   }
}

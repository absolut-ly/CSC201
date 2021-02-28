package DeclaringAndInitializingJavaVariables;

// This program calculates your age in the year 2050.
// Input:  None.
// Output: Your current age followed by your age in 2050.

public class NewAge
{
   public static void main(String args[])
   {
      // Declare and initialize your variables here.
        int newAge;
        int currentAge = 29;
        int currentYear = 2020;
      
      newAge = currentAge + (2050 - currentYear);

      System.out.println("My Current Age is " + currentAge);
      System.out.println("I will be " + newAge + " in 2050.");

      System.exit(0);
   }
}

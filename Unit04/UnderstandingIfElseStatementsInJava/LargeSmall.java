package UnderstandingIfElseStatementsInJava;

// LargeSmall.java - This program calculates the largest and smallest of three integer values. 
 
 
public class LargeSmall 
{
   public static void main(String args[])
   {
      // This is the work done in the housekeeping() method
      // Declare and initialize variables here.
      int largest;      // Largest of the three values.
      int smallest;     // Smallest of the three values.
      int num1 = -50;
      int num2 = 53;
      int num3 = 78;
      
      // This is the work done in the detailLoop() method
      //Write assignment, if, or if else statements here as appropriate.      
        if (num1 > num2){
            largest = num1;
        } //end if
            else {
                largest = num2;
            } // end else
        if (num3 > largest) {
            largest = num3;
        } //end largest
 
        if (num1 < num2) {
            smallest = num1;
        } //end if
            else {
                smallest = num2;
            } //end else
        if (num3 < smallest) {
            smallest = num3;
        } //end smallest
 
      // This is the work done in the endOfJob() method  
      // Output largest and smallest number. 
      System.out.println("The largest value is " + largest);
      System.out.println("The smallest value is " + smallest);
   }
}  
 


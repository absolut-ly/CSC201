package UsingFlowchartsAndPseudocodeToWriteAJavaProgram;

/* Program Name: CollegeAdmission.java 
   Function: This program determines if a student will be admitted or rejected. 
   Input:  Interactive
   Output: Accept or Reject
*/  

import java.util.Scanner;
public class CollegeAdmission
{
   public static void main(String args[])
   {
    Scanner s = new Scanner(System.in);
    // Declare variables
     String testScoreString;
     String classRankString;

     // Get input and convert to correct data type
     System.out.println("Enter Test Score:");
     testScoreString = s.next();
     int testScore = Integer.parseInt(testScoreString);
     System.out.println("Enter Class Rank");
     classRankString = s.next();
     int classRank = Integer.parseInt(classRankString);

     // Test using admission requirements and print Accept or Reject 
     if( testScore >= 90 )
     {
	if( classRank >= 25)
        {
     	   System.out.println("Accept");
        }
	else
	   System.out.println("Reject"); 
     }
     else 
     {
	if( testScore >= 80 )
	{
	   if( classRank >= 50 )
	      System.out.println("Accept");
	   else
	      System.out.println("Reject");
	}
	else
	{
           if( testScore >= 70 )
	   {
		if( classRank >=75 ) 
		   System.out.println("Accept");
		else
		   System.out.println("Reject");
	   }
	   else
		System.out.println("Reject");
        }
      }
      s.close();
   } // End of main() method
   
} // End of CollegeAdmission class

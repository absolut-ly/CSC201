package UnderstandingIfStatementsInJava;

// HouseSign.java - This program calculates prices for custom house signs.
 
 
public class HouseSign 
{
    public static void main(String args[])
    {
        // This is the work done in the housekeeping() method
        // Declare and initialize variables here.
        double charge = 0.00;    // Charge for this sign.
        int numChars = 8;    // Number of characters.
        String color = "gold";   // Color of characters.
        String woodType = "oak";     // Type of wood.
             
        // This is the work done in the detailLoop() method
        // Write assignment and if statements here as appropriate.
        if (charge == 0.00)
            charge += 35;
        if (numChars > 4)
            charge += (numChars - 5) * 4;
        if (color.equals("gold"))
            charge += 15;
        if (woodType.equals("oak"))
            charge += 20;
        
        // This is the work done in the endOfJob() method   
        // Output Charge for this sign.
        System.out.println("The charge for this sign is $" + charge);
 
        System.exit(0); 
    }
}   

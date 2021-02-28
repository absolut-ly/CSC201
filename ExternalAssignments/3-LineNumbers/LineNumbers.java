package LineNumbers;
/**
 * @Author Sam Castle
 * Course: CSC 201 DL03
 * Project Name: Project 3, LineNumbers.java
 * Program Purpose: This assignment requires the program to read from an external file containing 
 * 					text, and output each line to console with its line number.
 */

import java.io.*;
import java.util.Scanner;

public class LineNumbers {

	public static void main(String[] args) {
		houseKeeping(); //welcome message
		poem(); //core application method, not limited to a poem
	}//end main()
	
	public static void houseKeeping() {
		System.out.println("LineNumbers.java");
		System.out.println("Where all your dreams come true, line by line");
	}//end houseKeeping()
	
	public static void poem() {
		Scanner usrIn = new Scanner(System.in);
		int lineCounter = 1; //counter for prepending line numbers

		for (int i = 0; i < 3; i++) {
			System.out.println();
			System.out.println("Please enter the full path to the text file you want to read from: ");
			String usrFile = usrIn.nextLine(); 
			//can't qualify that it isn't an image without a lot of overhead with a mime class
			//so it will absolutely take non-plain-text files and spit out garbage

			try {
				FileReader txtFile = new FileReader(usrFile);
				BufferedReader fileBuffer = new BufferedReader(txtFile);
				String fileLine;
				while (fileBuffer.ready() == true) {
					fileLine = fileBuffer.readLine();
					if (fileLine.isBlank()) { //accounting for blank lines
						System.out.println();
					}
					else {
						System.out.println(lineCounter + ". " + fileLine);
						lineCounter++;
					}
				}//end while
				fileBuffer.close();
				break;
			} catch (IOException e) { //catches both FileNotFound and IO from the readers
				System.out.println(e);
			}
		}

		usrIn.close();
	}//end poem()

}//end LineNumbers
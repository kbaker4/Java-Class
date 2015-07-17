/*
 * Kevin Baker
 * Java Programming
 * Summer 2015
 * 16 July 2015
 * 
 * The purpose of this program is to take a text file with some text in it,
 * remove any extra whitespace, and fill each line with a user designated
 * column width.
 */
package Homework8;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.Scanner;
/**
 *
 * @author Kevin Baker
 */
public class TextFormatter {
	public static void main(String[] args)
	throws FileNotFoundException, IOException {
				Scanner sc = new Scanner(System.in);
		
		// Prompt for the desired width of the output file, check to make sure between 30 and 100
		int width;
		do {
		System.out.println("Enter the maximum formatted output width (30-100 characters)");
		width = sc.nextInt();
		} while(width < 30 || width > 100);
		
		// Prompt for the input text file name, check to make sure it exists
		int validFileName;
		BufferedReader inputFileReader = null;
		do {
			System.out.println("Enter the file name of the input text file: ");
			String inputFile = sc.next();
				try {
					inputFileReader = new BufferedReader(new FileReader(inputFile));
					validFileName = 1;
			} catch(FileNotFoundException e) {
					System.out.println("File not found, try again: " + e.toString());
					validFileName = 0;
			}
		} while(validFileName == 0);
		
		
		// Use a File object to test that the file doesn't already exist, and if it 
		// does, prompt to check for overwriting the file.  Open the file for writing 
		// using a PrintWriter.  Use a do-while loop to repeat these steps until a valid output file is entered.
		validFileName = 0;
		PrintWriter outFileWriter = null;
		do {
			System.out.println("Enter the file name of the output file to write to: ");
			String outputFileName = sc.next();
			File f = new File(outputFileName);
			if(f.exists() && !f.isDirectory()){
				//make sure the user is ok with overwriting the output file
				System.out.println("File exists, overwrite? (Y or N)");
				String choice = sc.next();
				if ("Y".equals(choice) || "y".equals(choice)){
					try {
					outFileWriter = new PrintWriter(new BufferedWriter(
									new FileWriter(outputFileName)));
					validFileName = 1;
				} catch(IOException e) {
					validFileName = 0;
					System.out.println(e.toString());
					}	// end catch
				} // end if
			} // end if
			else {
				try {
					outFileWriter = new PrintWriter(new BufferedWriter(
									new FileWriter(outputFileName)));
					validFileName = 1;
				} catch(IOException e) {
					validFileName = 0;
					System.out.println(e.toString());
				}	// end catch
			} // end else
		} while(validFileName == 0);
		
		outFileWriter.println("Formatted output text follows...");
		outFileWriter.println();
		for(int i = 0; i < width; i++)
			outFileWriter.print("*");
		outFileWriter.println();
		outFileWriter.println();
		
		// use a scanner for the input file, scan each item in the input text file
		// that's seperated by a space. print out lines according to the max
		// width that was provided by the user
		Scanner sc2 = new Scanner(inputFileReader);
		String tmp, line = "";
		StringReader sr = null;
		while(sc2.hasNext()){
			tmp = sc2.next();
			if(line.length() + tmp.length() > width){
				outFileWriter.println(line);
				line = tmp + " ";
			} 
			else{
				line = line + tmp + " ";
			}
		} // end while
		outFileWriter.println(line); // print whatever is leftover
		outFileWriter.close();
	} // end main
} // end class

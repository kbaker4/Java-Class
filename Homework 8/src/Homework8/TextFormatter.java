/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework8;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;
/**
 *
 * @author Kevin
 */
public class TextFormatter {
	public static void main(String[] args)
	throws FileNotFoundException {
				Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the maximum formatted output width (30-100 characters)");
		int width = sc.nextInt();
		
		System.out.println("Enter the file name of the input text file: ");
		String inputFile = sc.next();
		
		Reader inputFileReader = null;
		while(true){
			try {
				inputFileReader = new FileReader(inputFile);
			} catch(FileNotFoundException e) {
				System.out.println("File not found, try again: " + e.toString());
			}
		}
		// TODO use file object to test that the file exists, and can be read. if so, 
		// open the file for reading using the Scanner class. Use a do-while loop to 
		// repeat these steps until a valid input file is entered.
		
		System.out.println("Enter the file name of the output file to write to: ");
		String outputFile = sc.next();
		// Use a File object to test that the file doesn't already exist, and if it 
		// does, prompt to check for overwriting the file.  Open the file for writing 
		// using a PrintWriter.  Use a do-while loop to repeat these steps until a valid output file is entered.
		
	}
}

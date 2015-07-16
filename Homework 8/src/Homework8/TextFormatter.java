/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework8;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.Scanner;
/**
 *
 * @author Kevin
 */
public class TextFormatter {
	public static void main(String[] args)
	throws FileNotFoundException, IOException {
				Scanner sc = new Scanner(System.in);
		
		int width;
		do {
		System.out.println("Enter the maximum formatted output width (30-100 characters)");
		width = sc.nextInt();
		} while(width < 30 || width > 100);
		
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
		
		outFileWriter.println("Formatted output text follows...\n");
		for(int i = 0; i < width; i++){
			outFileWriter.print("*");
		}
		outFileWriter.println();
		
		//String line = null;
		//while((line = inputFileReader.readLine()) != null){
		//	outFileWriter.println(line);
		//}
	//	String tst = "test";
	//	outFileWriter.println(tst);
		
		Scanner scan = new Scanner(inputFileReader);
		String line = "";
		StringReader sr = null;
		while(scan.hasNext()){
			if(line.length() + (scan.next()).length() > width){
				sr = new StringReader(line);
				BufferedReader br = new BufferedReader(sr);
				outFileWriter.println(br);
				line = "";
			} 
			else
				line = line + scan.next() + " ";
		}
		outFileWriter.close();
	} // end main
} // end class

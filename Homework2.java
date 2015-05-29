/*
 * Kevin Baker
 * Intro to Java Programming
 * Summer 2015
 * 5/28/15
 */
package homework2;
import java.util.Scanner; 

public class Homework2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    String encOutput = "";
    
    // Get a line of text from the user and store it.
    System.out.println("Enter a line of text: "); 
    String line = sc.nextLine();  
    System.out.println("The string read as: " + line);
    
    int lengthOfLine = line.length();
    System.out.println("The length in chars is: " + lengthOfLine);
    
    // Loop through each character in the line and handle it appropriately
    for(int i = 0; i < lengthOfLine; i++)
    {
      char lineChar = line.charAt(i);

      if(lineChar == ' ')
        encOutput += '+'; 
      else if(Character.isLetterOrDigit(lineChar) || lineChar == '_' 
              || lineChar == '-' || lineChar == '.' || lineChar == '*')
        encOutput += lineChar;
      else{
        encOutput += '%' + Integer.toHexString(lineChar);
      }
    }
    
    // Print out the newly encoded line and its length
    System.out.println("The encoded string: " + encOutput);
    System.out.println("The length in chars is: " + encOutput.length());
  }
  
}

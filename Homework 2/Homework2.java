/*
 * Kevin Baker
 * Intro to Java Programming
 * Summer 2015
 * 5/28/15
 *
 * The purpose of this program is to perform URL encoding of a line of text
 * The ASCII characters 'a' through 'z', 'A' through 'Z',  '0' through '9', 
 * '_' (underscore), '-' (dash), '.' (dot), and '*' (asterisk) remain the same.
 * The space (blank) character ' ' is converted into a plus sign '+'.
 * All other characters are converted into the 3-character string "%xy", 
 * where xy is the two-digit hexadecimal representation of the lower 8-bits of 
 * the character.
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

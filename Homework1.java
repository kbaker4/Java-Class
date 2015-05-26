package homework1;
import java.util.Scanner;

/**
 * Kevin Baker
 * Java Programming, UML Summer 2015
 * 25 May, 2015
 */
public class Homework1 {
  public static void main(String[] args) {
    
    // Create a scanner to read from keyboard
    Scanner sc = new Scanner (System.in); 

    // Prompt the user for a line of text containing the word Java,
    //assign to variable line
    System.out.println("Enter a line of text that contains the word \"java\"");
    String line = sc.nextLine();  
    
    // Read the line, display its length, convert to upper and lowercase
    System.out.println("The string read is: " + line);
    System.out.println("Length in chars is: " + line.length());
    System.out.println("All lowercase is: " + line.toLowerCase());
    System.out.println("All uppercase is: " + line.toUpperCase());
    
    // Find the index of the word java in the line of text
    int findJava;
    findJava = line.indexOf("java");
    System.out.println("Found \'java\' at pos: " + findJava);

    // Use index from before to create substrings of before and after the word java
    String firstSubString = line.substring(0, findJava);
    String secondSubString = line.substring(findJava+4);
    
    // Print the before and after and change the format of the word java
    System.out.println("Changing to \'Java\': "
            + firstSubString + "Java" + secondSubString);
    System.out.println("Changing to \'JAVA\': "
            + firstSubString + "JAVA" + secondSubString);
  }
}
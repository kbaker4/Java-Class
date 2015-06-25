/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework5;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Kevin
 */
public class ArraySort {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("How big will the array be? Limit between 3 and 10.");
		int arrayLength = sc.nextInt();
		
		if(arrayLength > 2 && arrayLength < 11)
				System.out.println("You've chosen: " + arrayLength);
		else{
			while(arrayLength < 3 || arrayLength > 10){
				System.out.println("Invalid selection, please choose a number between 3 and 10.");
				arrayLength = sc.nextInt();
			}
		}
		
		int [] myArray = new int [arrayLength];
	
	//Calls the fillArray method to read values into the array (passing its local array as the parameter).
//Calls the printArray method to print the unsorted values  (passing its local array as the parameter)..
//Calls the sortArray method to sort the array values into ascending order  (passing its local array as the parameter)..
//Calls the printArray method to print the sorted values  (passing its local array as the parameter).
		fillArray(myArray);
		System.out.print("Your unsorted array is as follows: ");
		printArray(myArray);
		sortArray(myArray);
		System.out.print("Your sorted array is as follows: ");
		printArray(myArray);
	}
	
	public static void fillArray(int[] array){
		//creates a local Scanner object, loops once for each array element, prompts for a value, 
		//reads an integer value using the Scanner, and assigns it to the array element.
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < array.length; i++){
			System.out.println("Enter number to be entered into array: ");
			array[i] = sc.nextInt();
		}
	}
	
	public static void printArray(int[] array){
		System.out.println(Arrays.toString(array));
	}
	
	public static void sortArray(int[] array){		
		int swapped;
		do {	
			swapped = 0;
			for(int i = 0; i < array.length - 1; ++i) {
				if(array[i] > array[i+1]){
					int tmp = array[i];
					array[i] = array[i+1];
					array[i+1] = tmp;
					swapped = 1;
				}
			}
		} while(swapped == 1);
						
	}
}

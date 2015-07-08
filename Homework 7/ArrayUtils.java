/*
 * ArratUtils Class provides the methods for ArrayUtilsDemo.java
 * Kevin Baker
 * 8 July, 2015
 * Professor Smith
 * Intro to Java at UMass Lowell
 */
package Homework7;

public class ArrayUtils {
	
	// minValue method find the lowest value in an array of integers
	// takes an array of integers
	// returns the lowest value in the array
	public static int minValue(int[] list)
	throws BadArrayException
	{
		int min;
		if(list == null)
			throw new BadArrayException("Array is null");
		else if(list.length == 0)
			throw new BadArrayException("Array is empty");
		else{
			min = list[0];
			for(int i=1; i < list.length; ++i){
				if(list[i] < min)
					min = list[i];
			}
		}
		return min;
	} // minValue
	
	// copyRange method copies an array starting at a specified start point
	// takes an array of integers, and the start point to copy from
	// returns an array of integers
	public static int[] copyRange(int[] list, int startIndex)
	throws BadArrayException
	{
		if(list == null)
			throw new BadArrayException("Array is null");
		else if(startIndex < 0 || startIndex > list.length)
			throw new ArrayIndexOutOfBoundsException(startIndex);
		else{
			int range = list.length - startIndex;
			int[] theArray = new int[range];
			int n = 0;
			for(int i = 0; i < range; i++){
				theArray[n] = list[i + startIndex];
				n++;
			}
			return theArray;
		}
	} // copyRange
	
	// indexOf method finds the first time a value is found in an array
	// takes an array of integers and a number to search for
	// returns an int, the first spot in the array that the searched value is found
	public static int indexOf(int[] list, int searchValue)
	throws BadArrayException
	{
		if(list == null)
			throw new BadArrayException("Array is null");
		else if(list.length == 0)
			return -1;
		else{
			for(int i=0; i < list.length; ++i){
				if(list[i] == searchValue){
					int pos = i;
					return pos;
				}
			}
		}
		return -1;
	} // indexOf
	
	// lastIndexOf method finds the last index of a specified value
	// takes an array of integers and a number to search for
	// returns an int which is the last index of the value specified
	public static int lastIndexOf(int[] list, int searchValue)
	throws BadArrayException
	{
		int pos = -1;
		if(list == null)
			throw new BadArrayException("Array is null");
		else if(list.length == 0)
			return -1;
		else{
			for(int i=0; i < list.length; ++i){
				if(list[i] == searchValue)
					pos = i;
			}
		}
		return pos;
	}	 // lastIndexOf
} // class ArrayUtils

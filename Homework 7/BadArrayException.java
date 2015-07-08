/*
 * BadArrayException is a subclass of exception used in ArrayUtils class
 * Kevin Baker
 * 8 July, 2015
 * Professor Smith
 * Intro to Java at UMass Lowell
 */
package Homework7;

/**
 *
 * @author Kevin
 */
public class BadArrayException extends Exception {

	/**
	 * Creates a new instance of <code>BadArrayException</code> without detail
	 * message.
	 */
	public BadArrayException() {
	}

	/**
	 * Constructs an instance of <code>BadArrayException</code> with the specified
	 * detail message.
	 *
	 * @param msg the detail message.
	 */
	public BadArrayException(String msg) {
		super(msg);
	}
}

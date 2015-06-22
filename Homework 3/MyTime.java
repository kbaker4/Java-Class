
package Homework3;

/*
MyTime class, represents a 24 hour clock.
Functions:
	setTime: checks for out of range values and adjusts accordingly
	getHour, getMinute, getSecond: returns respective values
	equals: checks to see if this objects parameters are the same as others
  toString: formats the time in a 12 hour format
	toUniversalString: formats the time in a 24 hour format
	twoDigits: formats each item to ensure it has 2 digits ie 9 am is 09
*/
public class MyTime
{
    // Instance variables holding the time (in 24 hour universal form).
    private int mHour;      // 0 - 23
    private int mMinute;    // 0 - 59
    private int mSecond;    // 0 - 59

    /**
     * Sets the time value for this MyTime object. If *any* of the parameter
     * values are out of range, the time is set to 00:00:00.
     *
     * @param hour      the hour (0 to 23).
     * @param minute    the minute (0 to 59).
     * @param second    the second (0 to 59).
     */
    public void setTime(int hour, int minute, int second)
    {
			  // parameter checking code, and set the instance variables.
        // If any of the parameters are out of range, set all the instance variables to zero.
				int outOfRange = 0; //flag to check if any params are out of range
				if (hour < 0 || hour > 23){ 
				  mHour	= 0;
					outOfRange = 1;
				}
				else
					mHour = hour;
				
				if (minute < 0 || minute > 59){ 
					mMinute = 0;
					outOfRange = 1;
				}
				else
					mMinute = minute;
				
				if (second < 0 || second > 59){
					mSecond = 0;
					outOfRange = 1;
				} 
				else
					mSecond = second;
				
				if (outOfRange == 1){
					mHour = 0;
					mMinute = 0;
					mSecond = 0;
				}
    }

    /**
     * Returns the hour value represented by this MyTime.
     *
     * @return the hour value of this object as an int.
     */
    public int getHour()
    {
        return mHour;  
    }

    /**
     * Returns the minute value represented by this MyTime.
     *
     * @return the minute value of this object as an int.
     */
    public int getMinute()
    {
        return mMinute;  
    }

    /**
     * Returns the second value represented by this MyTime.
     *
     * @return  the second value of this object as an int.
     */
    public int getSecond()
    {
        return mSecond;  
    }

    /**
     * Compares this MyTime object against another MyTime object.
     * The result is true if and only if the argument is not null
     * and represents a time that is the same time as represented
     * by this object
     *
     * @param  other    the object to be compared.
     * @returns  true if both objects represent the same time value,
     *           false otherwise.
     */
    public boolean equals(MyTime other)
    {
			// return 'true' if 'this' MyTime matches
      // the time values in the 'other' MyTime object, else return false.
			return (mHour == other.mHour 
					&& mMinute == other.mMinute 
					&& mSecond == other.mSecond);
		}
    /**
     * Returns the time of this MyTime object in HH:MM:SS AM/PM form.
     *
     * @return the time value represented by this object as a String
     *         formatted as HH:MM:SS AM/PM .
     */
    public String toString()
    {
			  // code to format the time in the instance variables
        // into HH:MM:SS AM/PM time (hour ranges from 1 to 12, AM or PM)
        // as a string and return it. Call the twoDigits() method to
        // convert each int value to String.
				int shortHour = 12;
				String amOrPm = "AM";
				if(mHour > 12){
					shortHour = mHour - 12;
					amOrPm = "PM";							
				}
				else if (mHour == 12)
					amOrPm = "PM";
				else if (mHour == 0)
					shortHour = 12;
				else
					shortHour = mHour;
				
        String result = twoDigits(shortHour) + ":" +
											twoDigits(mMinute) + ":" +
											twoDigits(mSecond) + " " +
											amOrPm;
        return result;
    }

    /**
     * Returns the time of this MyTime object in 24 hour universal form.
     *
     * @return the time value represented by this object as a String
     *         formatted as HH:MM:SS universal time.
     */
    public String toUniversalString()
    {
        String result = twoDigits(mHour) + ":" +
											twoDigits(mMinute) + ":" +
											twoDigits(mSecond) + " ";

        // code to format the time in the instance variables
        // into HH:MM:SS universal time (hour ranges from 0 to 23)
        // as a string and return it. Call the twoDigits() method to
        // convert each int value to String.

        return result;
    }

    /**
     * Returns the parameter value as a two digit String (with leading 0 if needed)
     *
     * @return the parameter 'value' formatted as a two digit String
     *         (with leading zero if needed).
     */
    private String twoDigits(int value)
    {
			  // Use the Integer.toString(int) method to convert
        // 'value' to String format, and add a leading "0" if
        // value is less than 10 in order to return a string with
        // two digits.
			String result;
			if(value < 10)
        result = "0" + Integer.toString(value);
			else
				result = Integer.toString(value);
			return result;
    }

}

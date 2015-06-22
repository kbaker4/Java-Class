/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework4;

/**
 *
 * @author Kevin
 */
public class MyUrl {
	private String mUrl;
	private int counter;
	
	public MyUrl(String url){
	//initialize base URL to url parameter
		// add the protocol prefix if not present http://
		if(url.startsWith("http") != true){
			mUrl = "http://" + url;
		}
		else
			mUrl = url;
	}
	public void addArgument(String name, String value){
	// add a string argument ot the URL of the form name = value
		// url encode both the name and the value params by calling urlEncode() on each
		++counter;
		
		if(counter == 1)
			mUrl = mUrl + "?";
		else
			mUrl = mUrl + "&";
		
		String encName, encValue;
		encName = urlEncode(name);
		encValue = urlEncode(value);
		mUrl = mUrl + encName + "=" + encValue;
	}
	public void addArgument(String name, int ivalue){
	// add an int argument to the URL of the form name = value
		// URL encode the name param by calling urlEncode()
		// the value is the string representation of the ivalue param
		// use Integer.toString(ivalue) to convert the int to a string representation
		++counter;
		
		if(counter == 1)
			mUrl = mUrl + "?";
		else
			mUrl = mUrl + "&";
		
		String encName, encIvalue;
		encName = urlEncode(name);
		encIvalue = Integer.toString(ivalue);
		mUrl = mUrl + encName + "=" + encIvalue;
	}
	
	public void addArgument(String name, double dvalue){
		// add a double argument to the URL of the form name = value
		// URL encode the name param by calling urlEncode()
		// the value is the string representation of the dvalue param
		// use Double.toString(ivalue) to convert the double to a string representation
		++counter;
		
		if(counter == 1)
			mUrl = mUrl + "?";
		else
			mUrl = mUrl + "&";
		
		String encName, encDvalue;
		encName = urlEncode(name);
		encDvalue = Double.toString(dvalue);
		mUrl = mUrl + encName + "=" + encDvalue;
	}
	
	public String toString(){
	// returns the object's URL value (base URL plus all arguments)
		return mUrl;
	}
	public static String urlEncode(String text){
	// static method URL encodes its parameter String and returns the URL encoded value as result
		// called by the addArgument methods to encode their name and value params before
		// appending them to the URL
		String encOutput = "";
		int lengthOfLine = text.length();
		
		for(int i = 0; i < lengthOfLine; i++)
    {
      char lineChar = text.charAt(i);

      if(lineChar == ' ')
        encOutput += '+'; 
      else if(Character.isLetterOrDigit(lineChar) || lineChar == '_' 
              || lineChar == '-' || lineChar == '.' || lineChar == '*')
        encOutput += lineChar;
      else{
        encOutput += '%' + Integer.toHexString(lineChar);
      }
    }
		return encOutput;
	}
	
}

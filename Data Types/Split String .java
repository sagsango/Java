/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main/Classname" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String str = "geekss@for@geekss"; 
        String[] arrOfStr = str.split("@", 2); 
  
        for (String a : arrOfStr) 
            System.out.println(a); 
	}
}

/**
 *  Public String [ ] split ( String regex, int limit )

Input String: 016-78967
Regular Expression: - 
Output : {"016", "78967"}

Parameters:
regex - a delimiting regular expression
Limit - the result threshold

Returns:
An array of strings computed by splitting the given string.

Throws:
PatternSyntaxException - if the provided regular expression’s 
                         syntax is invalid.  
                         
                         
Limit:
limit > 0 : If this is the case then the pattern will be
            applied at most limit-1 times, the resulting 
            array’s length will not be more than n, and 
            the resulting array’s last entry will contain
            all input beyond the last matched pattern.
limit < 0 : In this case, the pattern will be applied as
            many times as possible, and the resulting 
            array can be of any size.
limit = 0 : In this case, the pattern will be applied as 
            many times as possible, the resulting array can 
            be of any size, and trailing empty strings will
            be discarded.
**/

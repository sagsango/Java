import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
        //creating file object
		File file = new File("input.txt");
		//creating scaner object
	    Scanner in = new Scanner(file);
        
       while (in.hasNextLine())
       {
           String line = in.nextLine();
           // Use that line to do any calculations, processing, etc ..
           System.out.println(line);
       }
	}
}

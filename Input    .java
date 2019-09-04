//https://classroom.udacity.com/courses/ud282
//https://www.geeksforgeeks.org/ways-to-read-input-from-console-in-java/



//1. Java program to demonstrate BufferedReader 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
public class Test  
{ 
    public static void main(String[] args) throws IOException  
    { 
        //Enter data using BufferReader 
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String name = reader.readLine(); 
  
        // Printing the read line 
        System.out.println(name);         
    } 
} 



//2. Java program to demonstrate working of Scanner in Java 
import java.util.Scanner; 

class GetInputFromUser 
{ 
	public static void main(String args[]) 
	{ 
		//Using Scanner for Getting Input from User 
		Scanner in = new Scanner(System.in); 

		String s = in.nextLine(); 
		System.out.println("You entered string "+s); 
/**
nextBoolean()		Reads a boolean value from the user
nextByte()   		Reads a byte value from the user
nextDouble()		Reads a double value from the user
nextFloat()	 	Reads a float value from the user
nextInt()		Reads a int value from the user
nextLine()		Reads a String value from the user
nextLong()		Reads a long value from the user
nextShort()		Reads a short value from the user
**/
		int a = in.nextInt(); 
		System.out.println("You entered integer "+a); 

		float b = in.nextFloat(); 
		System.out.println("You entered float "+b);
	} 
} 



//3. Java program to demonstrate working of System.console() 
// Note that this program does not work on IDEs as  
// System.console() may require console 
public class Sample  
{ 
    public static void main(String[] args)  
    {         
        // Using Console to input data from user 
        String name = System.console().readLine(); 
          
        System.out.println(name); 
    } 
}

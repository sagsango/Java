import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class ForFunctionCalls{
	/**
	 * What static and non statc function mean?
	 * What static ans non static function mean here?
	 * Static function can be called without their object.
	 **/
	int callfunc1()
	{
		return 5;
	}
	static int callfunc2()
	{
		return 10;
	}
}

//all the function inside this [ calss containg main ] will be static
//because there will no object of this call for calling those function
class JavaPractice
{
	
	/**
	 * This will always be
	 * public static void main (String[] args)
	 **/
	public static void main (String[] args) 
	{
		System.out.println(myfunc());
		ForFunctionCalls obj=new ForFunctionCalls();
		System.out.println(obj.callfunc1());
		System.out.println(obj.callfunc2());
		System.out.println("This one have no object:"+ForFunctionCalls.callfunc2());
		/**
		 * Will give error becouse have no object
	         * System.out.println("This one have no object:"+ForFunctionCalls.callfunc1());
	         **/
	}
	
	
	/**
	 * why this must be static?
	 * Should be because inside the class of main
	 **/
	static int myfunc()
	{
		return 10;
	}
	
	
}

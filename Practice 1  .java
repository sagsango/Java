import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class ForFunctionCalls{
	/**
	 * What static and non statc function mean?
	 * What static ans non static function mean here?
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
	}
	
	
	/**
	 * why this must be static?
	 **/
	static int myfunc()
	{
		return 10;
	}
}

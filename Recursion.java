/**
 * @author Sagar Singh
 **/
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
/** 
 * Program start from here
 **/

class C{
    public void func(int n)
    {
	if(n==0)return;
	System.out.println("Hello");
	func(n-1);
    }
};
	
public class Main
{ 
    public static void main(String[] args)  
    { 
	C o= new C();
        o.func(10);
    } 
   
} 

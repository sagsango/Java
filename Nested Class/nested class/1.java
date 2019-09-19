// Java program to demonstrate Static Subclass

/**
*Only nested class can be static
*If nested Class is static then it need not require outher class ob
**/

import java.util.ArrayList; 
import java.io.*;

class newClass{

    static class Sub{
	public void print(ArrayList<Integer> arrayList)
	{	
		arrayList.add(50);
		//System.out.println("jadu"+a); 
		System.out.println(arrayList.get(1)); 
	}
    }

}
			
class Main 
{ 
	public static void main(String[] args) 
	{ 
		ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
		arrayList.add(25); 
	
                 newClass.Sub ob  = new newClass.Sub();
	         ob.print(arrayList);
		 System.out.println(arrayList.get(1));
	} 
} 

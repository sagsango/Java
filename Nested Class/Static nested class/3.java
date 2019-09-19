/**
*static Nested Class can have static member method
*Non Static Nested Class can not have static member method
**/

import java.util.ArrayList; 
import java.io.*;

class newClass{


    class Sub{
	public static void print(ArrayList<Integer> arrayList)
	{	
		arrayList.add(50);
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
	
                 
		  System.out.println(arrayList.get(1));
	} 
} 

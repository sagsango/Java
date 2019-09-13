import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.util.Scanner;
 
/* Name of the class has to be "Main" only if the class is public. */
class Person{
	protected String name;
    protected String dep;
	protected String cont;
}
class Student extends Person{
	private String grade;
	private int yr;
	
	Student(String name,String dep,String cont,String grade,int yr){
		this.name=name;
		this.dep=dep;
		this.cont=cont;
		this.grade=grade;
		this.yr=yr;
	}
	public void detail()
	{
		System.out.println(this.name + "\n" + this.dep + "\n" + this.cont + "\n" + this.grade + "\n" + this.yr );
	}
}
/*
public class Student extends Person{
	private :String post;
	private :int exp;
}*/
class Ideone
{
	public static void main (String[] args) throws Exception
	{
		 Person s=new Student("a","b","c","d",10);
		 s.detail();
	}
}

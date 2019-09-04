/**
*Input file : https://www.gutenberg.org/files/98/98-0.txt
*Title: A Tale of Two Cities
*       A Story of the French Revolution
*
*Author: Charles Dickens
**/


/**
*File Handling
*I/O
*Split string
**/


import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class Wordcount
{
	public static void main (String[] args) throws Exception
	{
		  File file = new File("taleoftwocities.txt");//pathname:
		  Scanner scanner=new Scanner(file);

		  int words=0;
		  while(scanner.hasNextLine())
		  {
		  	String line=scanner.nextLine();
		  	words+=line.split(" ").length;//regex:
		  }
		  System.out.println("Words Count in Tale of Two Cities:"+words+".");
	}
}

import java.lang.*;
import java.util.*;
import java.io.*;


interface vehicleone{
	int  speed=90;
	  public void distance();
          public void speed();
          public void speed1();
}

class Vehicle  implements vehicleone{

/**
*All the method declaration present in the interface 
*should have its definition in subclass
*otherwise gives compiletime error
**/
        public void distance(){}; //should be present
        public void speed(){};    //should be present
	public void speed1(){
		System.out.println("jhgj ");
	}
}

class Main{
	public static void main(String args[]){
		System.out.println("Vehicle");
		Vehicle obj=new Vehicle();
		obj.speed1();
	}
}

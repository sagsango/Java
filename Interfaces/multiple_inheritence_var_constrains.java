import java.lang.*;
import java.util.*;
import java.io.*;


interface vehicleone{
	int  speed=90;
	public void distance();
}

interface vehicletwo{
	int distance=100;
        //int  speed=902;
	public void speed();
}

class Vehicle  implements vehicleone,vehicletwo{
	public void distance(){
  /**
  * Here distance is data member of another interface
  * Compilation ERROR
  **/
		distance=speed*100; 
		System.out.println("distance travelled is "+distance);
	}
	public void speed(){
		int speed=distance/100;
	}
}

class Main{
	public static void main(String args[]){
		System.out.println("Vehicle");
		Vehicle obj=new Vehicle();
                obj.distance();
		obj.speed();
	}
}

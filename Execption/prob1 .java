
https://classroom.udacity.com/courses/ud283/lessons/297a7f29-2c0d-4e79-863b-d7c83b4026c1/concepts/fa25042c-6622-4a88-a8ec-3618fb04d178
import java.lang.*;
import java.io.*;
import java.math.*;
import java.util.Scanner;
 
/* Name of the class has to be "Main" only if the class is public. */
public class ExceptionHandling{
   public static void main(String[] args) throws Exception{
    String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                       "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    Scanner scanner = new Scanner(System.in);
    try {
        int month = scanner.nextInt();
        System.out.print(months[month]);
    } catch (IndexOutOfBoundsException exception) {
        System.out.print("Index is out of bounds");
    } catch (InputMismatchException exception) {
        System.out.print("Input mismatch");
    }
  }

}

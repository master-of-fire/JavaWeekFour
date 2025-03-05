/************************************
*Project: Time Conversion
*Programmer: Zaid Ahmad
*Date: March 5, 2025
*Program Name: TimeConversion.java 
*************************************/
import java.util.*;
public class TimeConversion {
public static void main(String[]args) {
    int mins;
    int hours;
    int min;
    Scanner input = new Scanner(System.in); 
    System.out.println("Enter the time in minutes: ");
    mins = input.nextInt();
    hours = (mins/60);
    min = (mins%60);
    System.out.println("The time is: "+(hours)+":"+(min));
}
}

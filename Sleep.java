/************************************
*Project: Sleep
*Programmer: Zaid Ahmad
*Date: March 5, 2025
*Program Name: Sleep.java 
*************************************/
import java.util.*;
public class Sleep {
    public static void main(String[]args) {
    int byear;
    int bmonth;
    int bday;
    int tyear;
    int tmonth;
    int tday;
    int totalDays;
    int totalHours;
    int sleepYears;
    int sleepMonths;
    int sleepDays;
    int total1;
    int total2;
    int total3;
    int total4;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your birthdate: ");
    System.out.println("Year: ");
    byear = input.nextInt();
    System.out.println("Month: ");
    bmonth = input.nextInt();
    System.out.println("Day: ");
    bday = input.nextInt();
    System.out.println("Enter today's date: ");
    System.out.println("Year: ");
    tyear = input.nextInt();
    System.out.println("Month: ");
    tmonth = input.nextInt();
    System.out.println("Day: ");
    tday = input.nextInt();
    sleepYears = tyear - byear;
    sleepMonths = tmonth - bmonth;
    sleepDays = tday - bday
    total1 = sleepYears*365;
    total2 = sleepMonths*30;
    total3 = sleepDays+
    total4 = total1+total2+total3;
    System.out.println("You have been alive for "+total3+" days.");
     


}
}
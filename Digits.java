/************************************
*Project: Digits
*Programmer: Zaid Ahmad
*Date: Feb 25, 2025
*Program Name: Digits.java
*************************************/
import java.util.*;
public class Digits {
    public static void main(String[]args) {
    int number;
    int ones;
    int tens;
    int hundreds;
    int thousanths;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a 4 digit number");
    number= input.nextInt();
    //number= 2589;
    ones= number%10;
    tens= (number/10)%10;
    hundreds= ((number/10)/10)%10;
    thousanths= (((number/10)/10)/10)%10;
    System.out.println("the digit in the ones place is "+ones+". the digit in the tens place is "+tens+". the digit in the hundreds place is "+hundreds+". and the digit in the thousanths place is "+thousanths);
    
    
    

}
}


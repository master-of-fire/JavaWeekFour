/************************************
*Project: Temperature Converter
*Programmer: Zaid Ahmad
*Date: Feb 27, 2025
*Program Name: TempConverter.java
*************************************/
import java.util.*;
public class TempConverter {
    public static void main(String[]args) {
    double celsius;
    double fahrenheit;
    Scanner input = new Scanner(System.in); 
    System.out.println("Enter the temperature in Fahrenheit ");
    fahrenheit = input.nextInt();
    celsius = 5/9*(fahrenheit-32);
    System.out.println("The grade temperature in Celsius is "+celsius);
    }

}

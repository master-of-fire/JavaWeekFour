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
    fahrenheit = input.nextDouble();
    celsius = (fahrenheit-32)*5/9;
    System.out.println("The grade temperature in Celsius is "+celsius);

    
    }

}

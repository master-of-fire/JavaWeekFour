/************************************
*Project: Div and mod
*Programmer: Zaid Ahmad
*Date: March 4, 2025
*Program Name: ex1_div_and_mod.java 
*************************************/
import java.util.*;
public class ex1_div_and_mod {
    public static void main(String[]args) {
    int int1;
    int int2;
    Scanner input = new Scanner(System.in); 
    System.out.println("Enter an integer: ");
    int1 = input.nextInt();
    System.out.println("Enter a second integer: ");
    int2 = input.nextInt();
    System.out.println(int1 +" / "+int2 +" = "+(int1/int2) );
    System.out.println(int1 +" % "+int2 +" = "+(int1%int2) );
    System.out.println(int2 +" / "+int1 +" = "+(int2/int1) );
    System.out.println(int2 +" % "+int1 +" = "+(int2%int1) );
}
}
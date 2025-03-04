/************************************
*Project: Account Setup
*Programmer: Zaid Ahmad
*Date: March 4, 2025
*Program Name: AccountSetup.java
*************************************/
import java.util.*;
public class AccountSetup {
public static void main (String[]args) {
    String username;
    String password;
    Scanner input = new Scanner(System.in); 
    System.out.println("Enter your full name: ");
    username = input.nextLine();
    System.out.println("Enter your password: ");
    password = input.nextLine();
    System.out.println("Your name is "+username);
    System.out.println("Your password is "+password);
}
}

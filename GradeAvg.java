/************************************
*Project: Grade Average
*Programmer: Zaid Ahmad
*Date: Feb 27, 2025
*Program Name: GradeAvg.java
*************************************/
import java.util.*;
public class GradeAvg {
public static void main (String[]args) {
    int grade1;
    int grade2;
    int grade3;
    int grade4;
    int grade5;
    double Average;
    Scanner input = new Scanner(System.in); 
    System.out.println("Enter a grade ");
    grade1 = input.nextInt();
    Scanner input1 = new Scanner(System.in); 
    System.out.println("Enter a second grade ");
    grade2 = input1.nextInt();
    Scanner input2 = new Scanner(System.in); 
    System.out.println("Enter a third grade ");
    grade3 = input2.nextInt();
    Scanner input3 = new Scanner(System.in); 
    System.out.println("Enter a fourth grade ");
    grade4 = input3.nextInt();
    Scanner input4 = new Scanner(System.in); 
    System.out.println("Enter a fifth grade ");
    grade5 = input4.nextInt();
    Average = (grade1+grade2+grade3+grade4+grade5)/5.0;
    System.out.println("The grade average is "+Average);
    }
}

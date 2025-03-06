/************************************
*Project: Election
*Programmer: Zaid Ahmad
*Date: March 5, 2025
*Program Name: Election.java 
*************************************/
import java.text.NumberFormat;
public class Election {
    public static void main(String[]args) {
    int NYAwbrey;
    int NJAwbrey;
    int ConAwbrey;
    int NYMartinez;
    int NJMartinez;
    int ConMartinez;
    double AwbreyTotal;
    double MartinezTotal;
    double total;
    double MartinezPercent;
    double AwbreyPercent;
    NYAwbrey = 314159;
    NJAwbrey = 89008;
    ConAwbrey = 213451;
    NYMartinez = 271869;
    NJMartinez = 121032;
    ConMartinez = 231034;
    AwbreyTotal = NYAwbrey+NJAwbrey+ConAwbrey;
    MartinezTotal = NYMartinez+NJMartinez+ConMartinez;
    total = AwbreyTotal+MartinezTotal;
    MartinezPercent = MartinezTotal/total;
    AwbreyPercent = AwbreyTotal/total;

    NumberFormat percent= NumberFormat.getPercentInstance();
    System.out.println(percent.format(AwbreyPercent));
    System.out.println(percent.format(MartinezPercent));
    System.out.println();
    


}
}
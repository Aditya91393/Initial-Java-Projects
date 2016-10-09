import java.util.*;
public class KilometersMilesConverter
{
public static void main (String[] args)  // end of line comment
{
 
String Kilometers;
String Miles;

Scanner stdin = new Scanner(System.in);

double intKilometers;
double intMiles;

System.out.println ("How many Kilometers would you like to convert into Miles? \n" + "Please input a value");
Kilometers = stdin.nextLine();
intKilometers = Double.parseDouble (Kilometers);

System.out.println ("How many Miles would you like to convert into Kilometers \n" + "Please input a value");
Miles = stdin.nextLine();
intMiles = Double.parseDouble (Miles);

double convertKilometers = intKilometers * 1.6;
double convertMiles = intMiles / 1.6;

System.out.println (intKilometers + " kilometers is actually " + convertKilometers + " Miles.");
System.out.println (intMiles + " Miles is actually " + convertMiles + " Kilometers.");

}
}

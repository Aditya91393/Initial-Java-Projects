import java.util.*;
public class CircumferenceAreaCalculator
{
public static void main (String[] args)  // end of line comment
{
  
String Radius;
double intRadius;
  
Scanner stdin = new Scanner(System.in);
 
System.out.println ("What value would you like your Radius to have?");
Radius = stdin.nextLine();
intRadius = Double.parseDouble (Radius);
  
double circumference = 2*3.14*intRadius;
double area = 3.14*intRadius*intRadius;
  
System.out.println ("Your circumference is " + circumference);
System.out.println ("Your area is " + area);
  

  
}
}
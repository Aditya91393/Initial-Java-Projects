import java.util.*;
public class ScannerInput
{
public static void main (String[] args)  // end of line comment
{
    
String NumberA;
String NumberB;
String Name;
double intNumberA;
double intNumberB;
Scanner stdin = new Scanner(System.in);
   
System.out.println("Enter your name");
Name = stdin.nextLine();
    
System.out.println("Enter a value");
NumberA = stdin.nextLine();
intNumberA = Double.parseDouble (NumberA);
    
System.out.println("Enter a second value");
NumberB = stdin.nextLine();
intNumberB = Double.parseDouble(NumberB);
    
double sum = intNumberA + intNumberB;
double difference = intNumberA - intNumberB;
double product = intNumberA * intNumberB;
double quotient = intNumberA / intNumberB;
double modulus = intNumberA % intNumberB;
    
    
    
System.out.println ("Your name is " + Name + "\n");
System.out.println ("The first value you entered was " + intNumberA);
System.out.println ("The second value you entered was " + intNumberB + "\n");
System.out.println ("The Sum of your values are " + sum);
System.out.println ("The difference between your values are " + difference);
System.out.println ("The product of your values are " + product);
System.out.println ("The quotient of your values are " + quotient);
System.out.println ("The modulus of your values are " + modulus);
    
    

} // end main method
} // end class
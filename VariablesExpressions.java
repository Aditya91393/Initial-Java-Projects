public class VariablesExpressions
{
public static void main (String[] args)
{
    
int numberA;
int numberB;
int sum;
int difference;
int product;
int quotient;
int modulus;
   
numberA = 18;
numberB = 9;
   
sum = numberA + numberB;
difference = numberA - numberB;   // this is an expression
product = numberA * numberB;
quotient = numberA / numberB;
modulus = numberA % numberB;
      
System.out.println ("the sum of " + numberA + " plus " + numberB + " is " + sum);
System.out.println ("The difference of " + numberA + " minus " + numberB + " is " + difference);
System.out.println ("The product of " + numberA + " times " + numberB + " is " + product);
System.out.println ("The quotient of " + numberA + " divided by " + numberB + " is " + quotient);
System.out.println ("The remainder of " + numberA + " modulus " + numberB + " is " + modulus);
    
/* When dividing, the system doesn't register decimal places. The whole number before the decimals
kick in is the final answer... ALWAYS */
   
} // end main method
} // end class

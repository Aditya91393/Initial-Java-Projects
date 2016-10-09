import javax.swing.JOptionPane;
public class JOptionPaneInputOutput
{
public static void main (String[] args)  // end of line comment
{
    
  
String strNumberA, strName;
int intNumberA;
int intNumberB;
 

strName = JOptionPane.showInputDialog ("Enter your name");
strNumberA = JOptionPane.showInputDialog ("Enter number A");

    

intNumberA = Integer.parseInt (strNumberA); // turns the string into an integer number
intNumberB = Integer.parseInt (JOptionPane.showInputDialog ("Enter number B")); // compose to reduce steps and need for variables


JOptionPane.showMessageDialog (null, "Your name is " + strName);
JOptionPane.showMessageDialog (null, "strNumberA is " + strNumberA +"\nbut think of it as \""+strNumberA+"\""); // the string looks like a number but is not
JOptionPane.showMessageDialog (null, "intNumberA is " + intNumberA+"\nand you can do math with this "+intNumberA); // the integer number is a number you can do math with
JOptionPane.showMessageDialog (null, "for example, 2 times intNumberA is " + (2 * intNumberA));
JOptionPane.showMessageDialog (null, "intNumberB is " + intNumberB+"\nand you can do math with this "+intNumberB); // the integer number is a number you can do math with
JOptionPane.showMessageDialog (null, "for example, 2 times intNumberB is " + (2 * intNumberB));
JOptionPane.showMessageDialog (null, strName + "is the best");
    

} // end main method
} // end class

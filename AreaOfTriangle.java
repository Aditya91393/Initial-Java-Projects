//**********************************************************
// Assignment: (Create a program that can calculate the area of an triangle given any values)
//
// Description: (Enter a brief description of what the program does here)
//
// Author: (Aditya Sharma)
//
// Date Start: (10/3/2016)
// Date Completed: (10/3/2016) // date program was created/started and finished/ended
//
// Completion time: (1 hour) 
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from (enter the names of
//   others that helped with the assignment; write no one if
//   you received no help) in designing and debugging my program.
//*********************************************************
 import javax.swing.*;
 public class AreaOfTriangle  // title of program
 {
 public static void main (String[] args)
 {
 // Step 1 - Declaring variables
 
 String strBase, strHeight;
 double dblBase, dblHeight, dblArea;

 // Step 2 - Assigning values to variables
 strBase = JOptionPane.showInputDialog ("Enter the triangle's base: "); // These functions assign a value to the string for later calculation
 strHeight = JOptionPane.showInputDialog ("Enter the triangle's height: ");
 
 // Step 3 - Processing
 dblHeight = Double.parseDouble (strHeight);
 dblBase = Double.parseDouble (strBase); // These functions turn the value in the string into accurate integers
 dblArea = dblBase * dblHeight /2;
 
 // Step 4 - Output
 JOptionPane.showMessageDialog (null, "A triangle with base " + dblBase + " units\nand height " + dblHeight + " units\nhas an area of " + dblArea + " square units" );

// This is a program to calculate the area of an triangle with any values you input
 }
 }
 

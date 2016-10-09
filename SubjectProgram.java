import java.util.*;
public class SubjectProgram
{
public static void main (String[] args)
{

Scanner stdin = new Scanner(System.in);
String Name;
String Subject1;
String Subject2;
String Subject3;
String SubjectMark1;
String SubjectMark2;
String SubjectMark3;

double intSubjectMark1;
double intSubjectMark2;
double intSubjectMark3;


System.out.println ("What is your name? ");
Name = stdin.nextLine();

System.out.println ("What was your first subject?");
Subject1 = stdin.nextLine();

System.out.println ("What was your mark in your first subject");
SubjectMark1 = stdin.nextLine();
intSubjectMark1 = Double.parseDouble (SubjectMark1);

System.out.println ("What was your second subject?");
Subject2 = stdin.nextLine();

System.out.println ("What was your mark in the second subject?");
SubjectMark2 = stdin.nextLine();
intSubjectMark2 = Double.parseDouble (SubjectMark2);

System.out.println ("What was your third subject?");
Subject3 = stdin.nextLine();

System.out.println ("What was your mark in the third subject?");
SubjectMark3 = stdin.nextLine();
intSubjectMark3 = Double.parseDouble(SubjectMark3);

double average = (intSubjectMark1 + intSubjectMark2 + intSubjectMark3)/3;

System.out.println (" Your overall average of the 3 subjects are " + average + "\n");
System.out.println ("Name: " + Name + "\n" + Subject1 + ": " + intSubjectMark1 + "\n" + Subject2 + ": " + intSubjectMark2 + "\n" + Subject3 + ": "  + intSubjectMark3 + "\n" + "Average: " + average);
System.out.println ("GG WP NO RE RIP EZ");


}
}
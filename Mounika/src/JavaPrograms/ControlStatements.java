package JavaPrograms;
import javax.lang.model.util.ElementScanner14;

public class ControlStatements 
{
    
  static int o = 98;
  static final int h = 56;
public static void main(String[] args) {
 if(o > h)

 System.out.println(" o id greater than h");
 System.out.println("h is lesss than o");
 System.out.println("if block");

}

//if statement not able to do with instatnce variables

//if statement

public static void ifState(long i, long j) 
{
  i = 98;
  j = 56;

  if(i > j)
System.out.println("i is greater than j"); // no need of blck

/* { 
  System.out.println("i is greater than j");//we can also write like this

}*/
System.out.println("j is lesss than i");
  
   System.out.println("if block");

}


//if else statement

public static void ifElse(String[] args) 
{
  byte i = 100;
 if (i<100)
 // we can use only boolean values, comparision, bitwise,logical, we can write xpression
System.out.println("print values above 100");
else
System.out.println("Print values below 100");
System.out.println("print 1,2,3,........99");

int number = 54;
String output=((number%2==0)?"even number":"odd number");
System.out.println(output);
}


//if else if 
public static void ifElseIf(int marks, int a)
{
marks = 20;
a = 74;
if(marks>++a && marks<=100)
System.out.println("A+");
else if (marks>a++ && marks==82)
System.out.println("A");
else if(marks>49 && marks<=75)
System.out.println("Average");
else
System.out.println("Fail");
}

// nested if

  public void nestedIf(byte age, byte weight){

age = 20;
weight=60;
if(age<=50)
 if(weight<=45)
{
System.out.println("your age is eligible for this game");
}
else
{
System.out.println("Base on weight u are not eligible for this game");
}
else
{
System.out.println("You are " + "eligible");

}
}
}


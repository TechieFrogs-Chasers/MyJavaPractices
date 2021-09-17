package JavaPrograms;
//Switch case

public class ControlStatements1
{
public static void main(String[] args) {
    String s="May";
    int month  = 4;

switch(month)
{
    case 1: s = "1 - Jan";
    System.out.println("Monday"); 
    System.out.println("Tue");
    System.out.println("Wed");
    System.out.println("Thu");
    break;
    case 2: s = "2 - Feb";
    System.out.println("Monday");
    System.out.println("Tue");
    break;
    case 3: s = "3nd - March";
    System.out.println("Monday");
    System.out.println("Tue");
    break;
    case 4: s = "4th - April";
    System.out.println("May");
    System.out.println("Monday");
    System.out.println("Tue");
    break;
    case 5: s = "5th - May";
    System.out.println("Monday");
    System.out.println("Tue");
    System.out.println("Wed");
    System.out.println("Thur");
    break ;
default:System.out.println("Invalid");
System.out.println(s);
}

}

public static void main(short i, short j) {
    i = 10;
    j = 20;
    switch(i+j)
    {
case 1:
System.out.println(30);

case 2:
System.out.println(10);
case 3:
System.out.println(20);
default: System.out.println("None");

    }
}

public static void main(char f, char j) {
    f = 'A';
    j = 'N';
    switch(j++)
    {
case 'a': 
System.out.println(30);

case 'b':
System.out.println(110);
break;
case 'c':
System.out.println(111);//ASCI of O
break;

default: System.out.println("None");
// no brk, syntax wise it allows, for excution we nee brk command
}

}
}



public class Logic {
    

public static void main(String[] args) {
    int a=10, b=20, c=30;
  /*  if (b>a && c>a) 
    {System.out.println("true");}
      else
      {System.out.println("false");}

if (a>b && c>b) 
{System.out.println("true");
    
}
else
{System.out.println("false");}

if (a>b || c>b) {
    System.out.println("true");}
    else
    {System.out.println("false");}*/

System.out.println(a<b || b<c);
int min=(a<b)? a:b;
System.out.println(min);
int i =13;
String output=(i %2 == 0)?"even":"odd";
System.out.println(output);



    }

}
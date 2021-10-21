

public class Test {
    
    
    public static void main(String[] args) {
        //adding two integers
        int a=10;
        int b =5;
        System.out.println((a+b));

        //quotient and remainder
        int c=(a%b);
        int d=(a/b);
        System.out.println(c);// remainder
        System.out.println(d);//quotient

       //swapping numbers
       int a1=10;
       int b1 =5;
       a1=a1+b1;a1=15;
       b1=a1-b1;b1=10;
       
       System.out.println(b1);

       //check odd or even
    a1=11;
    if (a1%2==0)
        {System.out.println("number is even");}
    
    else
      { System.out.println("number is odd") ;}

      //check vowel or consonants

      char ch='k';
      switch (ch ){
          case 'a':
          case 'e':
          case 'i':
          case 'o':
          case 'u':
          {System.out.println("vowel");} 
            break;
          default:
         {System.out.println("consonant");}
              
      }
    //largest among three numbers
    
    a=1000;
    b=1450;
    c=1790;
    if
    (a>b&& a>c)
    {System.out.println("a is gteater among three numbers");}
    else if (b>a&&b>c) 
    {System.out.println("b is greater");}
    else
    {System.out.println("c is greater");}


    // alphabet is character or not

 char e='8';
 if (e>='a'&& e<='z')

 {System.out.println( e+"  is  an alphabet");}
 else
 {System.out.println(e+"   is not  an alphabet");}

 //factorial of a number
 int number = 10;
 long fact = 1;
 for(int i = 1; i <= number; i++)
 {
     fact = fact * i;
 }
 System.out.println("Factorial of "+number+" is: "+fact);


//sum of natural numbers

int i=5;
int j=1;
int total=0;
while(j<=i)
{total=total+j;j++;}
System.out.println("sum of first 5 natural numbers is    "+total);


//generate multiplication tables


 

}

}

   
  
    

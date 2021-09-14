import java.util.Scanner;

public class Practices {
float f = 67.86f;
double d = 68.098d;
String n = ("Hii Hello" ); 
  boolean b = true ;
    static int i,  h, k ;
    static
    {
      i = 10 ;
      h = 23 ;
      k = 34 ;
    }
    final static double PIE = 3.14;
     public static void main(String args[]) {
       //  Byte c = 123 ;
      // System.out.println(d);
     /* short s = 123 ;
      //System.out.println(d);
      float n = 65.8f ;
      long z = 10000 ;
      double d = 54778.8 ; 
      char age ='a';
      System.out.println(d + z);
      // *unary operators*
      int a = 32;
      int b =12;
           //System.out.println(a++);
      //System.out.println(a);
      //System.out.println(--b);
     // System.out.println(a++ + ++b );// 32 +(1+12)
      //System.out.println(--a + b--);// 31+12
      //System.out.println(b);
      //System.out.println(--a + --b);
      // *Arthematic operations *
     // System.out.println(a + b);
     // System.out.println(a-b);
      //System.out.println(a / b);
      //System.out.println(a % b);
      // * left shift operators*
     // System.out.println(a<<2);// a*2^2
      // System.out.println(b>>3);// b/2^3
      //System.out.println(a<<b);// a*2^b
      // *Logical And(&&)*
     // System.out.println(a <b && a >b );
      //System.out.println(b < a && a>b); 
      // A B A&B A||B
     //  0 0  0   0
     //  0 1  1   0
     //  1 0  1   0
     //  1 1  1   1
     // *Bitwise And(&)
    //System.out.println(a< b & a>b);
     //Logical or (||)

    //System.out.print(a<b || a>b);
    //bitwise or(|)
    //System.out.print(a<b | a>b);
    //*Java Ternary Operators*
    //System.out.println(a<b ? () a:b);
    // *Java assignment operators*
    int h = 2;
    int n = 4;
    h+=5;
     System.out.println(h);*/
     // **If switch condition **
    /* int numbur = 23;
     switch (numbur) {
       case 5: System.out.println("5");
         
         break;
         case 6: System.out.println("6");
         break;
         case 20: System.out.println("20");
         break;
         case 23: System.out.println("23");
         break;
       default: System.out.println("22");
         break;
     }*/
     // ** for loop**//
     /*int pirmid = 5;
     for(int i =1; i <= pirmid; i++){
        // System.out.println(i);
         for(int j = pirmid ; j >= i ; j--){
System.out.print(" * ");
         }
         System.out.println();
     }*/
     // ** lablel for loop **//
    /* aa:
     for(int i = 1 ; i <= 3; i++){
       
bb:
for(int j = 1; j <=3; j++){
  if(i == 2 && j == 2){
    break aa;
  }
System.out.println(i+ " "+j);
}
     }*/
     // ** while loop ** //
    /* int i = 1;
     while(i <=10 ){
       System.out.println(i);
       i++;
     }*/
     // ** do-while loop **//
     /*int i = 1;
     do{
       System.out.println(i);
       i++;
     }
       while(i <= 10);*/
       
       System.out.println(i + k);
       Practices myvaribles = new Practices();
       System.out.println(myvaribles.f + " "+ myvaribles.d + " "+ myvaribles.n);
{
  int z = 10;
  int l = 5;
  
  System.out.println(z | l ); // 1010 | 0101 = 1111
  System.out.println(z == l);
 // System.out.println(z .equals(l));
}
     //control Statements//
     Scanner car = new Scanner (System.in);
     System.out.println("Enter PassWord:");
     String password = car.nextLine();
     String password1 = "NavyaChowdary";
     System.out.println(password);
      if (password == password1){ //checks if password is correct
        System.out.println("Welcome to page"); // prints if password is correct
      }
     else if (password != "NavyaChowdary"){ //checks if password is incorrect
        System.out.println("Access Denied"); // prints if password is incorrect
      }
      //nested if statments//
      int s = 19;
      int m = 6;
if (s < 10)
{
if (s%2==0)
System.out.println("s is an even number and greater than 10!");
else
System.out.println("s is a odd number and greater than 10!");
}
else
{
System.out.println("s is less than 10");
}
int n = 5;
for (int i=1; i<=n; ++i) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
  { 
      System.out.print(" " ); //print space
  
  for (int j=1; j<=i; ++j ) //inner loop for number of columns
  { 
      System.out.print(" * "); //print star
  } 
System.out.println();
  }
//System.out.println("Hello World!");
// Switch Case//
//int val = 8;
 //switch (8) {
  //case 7, 8 -> System.out.println(" the value is  matched");
  //case  9 -> System.out.println( " the value is not matched");
//}
/*String name = "009";
switch ("009") {
  case "008":
    System.out.println("not a valid string");
    case " 00":{
    System.out.println("inavalid");
    System.out.println("null");
    }
    case "009":
    System.out.println("it's a valid string");
    break;
  default: System.out.println("default");
    break;
}*/
// Switch using yelid//
/*char v = 'N';
int k = switch (v){
  case 'K' :
  System.out.println("print value");
  //System.out.println(g);
  yield 'k';
  
  case 'N':{
    int g = 78;
    System.out.println(g);
  System.out.println("its same value");
  yield 'n';
}
  default:  
  yield 89;
};
System.out.println("value: " +k);
int h = 99;
switch (h) {
  case 88 -> System.out.println("it's not a number 99");
  case 99, 76, 567 -> 
  System.out.println("it's a number 99");
  }*/
  int a = 10;
  switch (a) {
    case 1: {
    if(a > 1)
    System.out.println("a is greater than 1");
      else 
      System.out.println("a is lesser than 1");
    }
      break;
  case 4:{
    if(a > 4)
System.out.println("a is greater than 4");
System.out.println("a is lesser than 4");
  }
  break;
  case 10:{
    if(a >= 10)
    System.out.println(" a is greater than or equal to 10");
    else 
    System.out.println("a is lesser than 10");
  }
  break;
    default:System.out.println("invalid");
      break; 
    }
      int l = 'd';
     switch (l) {
        case 'D'| 'd' | 'e' |'r':{
          int f = 5 ;
          int d = 3;
          int sum = (f + d);
        System.out.println('d'+" " + sum);
        }
          break;
      
        default : System.out.println("invalid");
          break;
      }
//System.out.println();
Scanner myObj = new Scanner(System.in);
System.out.println("enter age");
int age = myObj.nextInt();
System.out.println("enter place:");
char c = myObj.next().charAt(5);
System.out.println(c);
System.out.println("print boolean:");
boolean b = myObj.hasNextBoolean();
System.out.println(b);
myObj.useDelimiter("/");
String City = myObj.next();
//System.out.println("Enter city:" City);


}
}
  

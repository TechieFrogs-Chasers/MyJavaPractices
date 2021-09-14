public class Whileloops{
public static void main(String[] args) {
//while loop

int a=1;
while(a<=10){
 // a++;//gives from loop2 to loop 11 because it increments first and enters the loop
    System.out.println("a loop"+"  "+a);
    a++;// loop 1 to 10 since it increments after printing out
}
 
//while and if and break ********************
  a=1;
  while (a<=10){
    System.out.println(a);
   // a++;// prints "a"and "come out of the loop" 3 times
    if(a==4)
    //a++; ///unreachable code for "come out of the loop"
    break;
    a++;//breaks at 4 th loop
       // System.out.println(a);
      // else
       System.out.println("come out of the loop");     
     //a++; //prints a and come out of the loop at the 4th loop
}

// for   and continue ******************

a=1;

 for(a=1;a<=5;a++){
   if(a==3){
       continue;//skips the third iteration
   }  
System.out.println(a);}

//  while and continue ****************

a=1;
while(a<=5){
    a++;
    if(a==3){
        continue;}
        System.out.println(a);//prints 2 4 5 6
    }
    //next scenario *******************
   /* a=1;
   while(a<=5){
    
    if(a==3){
        a++;continue;}
        System.out.println(a);// infinite loop
    }*/
    //next scenario ******************************
    
    a=1; 
   while(a<=5){
    a++;
   // System.out.println(a);
      if(a==2){
          continue;//skips the second iteration
          //a++; //unreachable
      }  
     // a++;// infinite loop
   System.out.println(a);// prints 3 4 5 6
   //a++; //infinite loop
}

//do - while

a=1;
do{
    System.out.println(a);a++;}
    while(a<=5);

//do - while and if
 
a=1;
do 
{System.out.println(a);
    a++;}
//a++;// insert while expression
while(a<=5);
//a++;//infinite loop
if(a==3)
a++;//infinite loop
{
    System.out.println("come out");
}







}
}


     
    




    


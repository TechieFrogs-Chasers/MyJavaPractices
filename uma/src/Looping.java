public class Looping {
  public static void main(String[] args) {
//simple for loop
int i=0;
for (i=1;i<=10;i++){
System.out.println(i);}

//nested for loop

int a=10;
for (a=1;a<=5;a++)
  System.out.println(a);
  int b=5;
  for (b=1;b<=3;b++){
    System.out.println(a+"  "+b);
  }



 /* //labeled for loop

  i=10;
  int j=5;
  outer:
  for(i=1;i<=5;i++){
    //System.out.println(i);
   inner:
    for(j=1;j<=3;j++){
    //System.out.println(j);}
    break outer;
  
      System.out.println(i+"  "+j);}
  }*/
//  pyramid

int c=1;
int d=10;
for (c=1;c<=5;c++){
for(d=1;d<=c;d++){
  System.out.print("*");
}
System.out.println();
//System.out.println(c);
}

 //  down pyramid
  c=0;
   int j=0;
 for (c=5;c<=5;c++){
 for(j=c;j>=c;j--)
   System.out.print("*");
 
 System.out.println();}

  
}
  }
  





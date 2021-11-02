public class Loops {

    // simple for loop
    public static void main(String[] args) {
        int i= 5;
        int j = 10;
       /* Scanner scObj = new Scanner(System.in);
        i = scObj.nextInt();
        char j = scObj.next().charAt(0);
        // we don't have a nextChar method in java to read char values we need to write like above
        //next is string method to read string data of single token only
        for(i=0;i<=5;i++)
        System.out.println(i);
        System.out.println(scObj);
        scObj.close();*/
        for(i=0;i<=5;i++){
            System.out.println(i);
        }
        // nested for loop 
        for(i=0;i<=5;i++){
           // System.out.print(" +");
            for(j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.print(" *");
            System.out.println();// for new line
        }

        // Labeled for loop
        aa:
         for(i=1;i<=5;i++){
        //} if we close the blck we cant brk this statement because the label(aa) scope is inside the blck
          cc:
           for(j=1;j<=10;j++){
            //System.out.println(j);
       /*break bb; no need of brk for label
        bb here because if we close the inner for loop it automatically scope of label closed*/
        //if(j==3&&i==3)
        if(i==5&&j==4)
             break aa;
    /*in inner loop we can brk the outer loop execution, 
        but we can't brk inner loop label in outer loop*/
        }

        System.out.println(i+" "+j);
    }

    // Infinite loop
    /*for(;;){
        System.out.println("Infinite looop");
    }*/
    System.out.println(i);//i=5
    //while(i<=j) // not accepting
while(i<=10){
   // i++;
System.out.println("Value of i "+ i);
i++;
}// if we didn't give this in loop it goes to infinite loop

int k = 10;
do{
    if(k==13){
    k++;
    // break; brk  from 13 and after nxt execution also
 continue;// only skip the if condition i.e it doesn't print 13 and prints next ones 14 and 15
}
System.out.println(k);
k++;

}while(k<=15);
/*{
   //System.out.println(k);
   // if(k==13)
  //  break; // the condition doesn't execute here brk or continue not accepts here
}*/

   //if(k==13)
   // continue;

    //throwing error as continue should not be outside of loop, it should be in loop og do

}
    
}

package JavaPrograms;

/*import java.lang.*;
import java.util.*;*/
public class ForLoop1 
{

   
 /*   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

System.out.println("Enter the value of n");
int n =s.nextInt();
int count = 0;


       for(int i=0;i<=n;i++) {

           if(i%2==0)
           {
System.out.println(i+" ");
count++;

 }
       }
       System.out.println(count);

    }
}*/
// Few Xamples
/*public static void main(String[] args) {
 for(int i=0;i<=5;i++){
System.out.println(i);
 }

 }*/
   /* public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){

                System.out.println(i+" "+j);
            
            }
                System.out.println(" ");//for next line

        }
    }*/
public static void main(String[] args) {
    
int term = 6;

    for(int i=1;i<=term;i++)
    {
        for(int j=term;j>=i;j--)
        {
            System.out.println("* ");
            }
               System.out.println();//for new  line
        }//loop j
}
    //Labeled for Loop
}


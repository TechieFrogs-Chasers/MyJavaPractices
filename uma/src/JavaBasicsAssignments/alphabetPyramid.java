package JavaBasicsAssignments;

import java.util.Scanner;

public class alphabetPyramid {
    
public static void main(String[] args) {
    
Scanner scannerobj =new Scanner(System.in);


char ch;   
        
do{
    System.out.println("Enter a character : ");

   while(scannerobj.hasNextInt() ){

      // int num=scannerobj.nextInt();
       System.out.println("Please enter valid character");
   }
   ch = scannerobj.next().charAt(0);

}while(!(ch>='a' && ch<='z') || ch>='A' && ch<='Z');

  char ch1='A';
    int i;

for(ch1='A';ch1<=(ch-1);ch1++){
    for(i=1;i<=ch1;i++){
        System.out.println(ch1+" ");
    }
}





scannerobj.close();

}
}
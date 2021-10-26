package JavaBasicsAssignments;

import java.util.Scanner;

public class sandGlass {
    public static void main(String[] args) {
        
Scanner scannerobj =new Scanner(System.in);

int i,j,k,rows;

do{
    System.out.println("Enter no of rows");

   while (!scannerobj.hasNextInt() ){
      scannerobj.next();
       System.out.println("  is not a valid type");
     }
     rows = scannerobj.nextInt();
   } while (rows<=0);

for(i=0 ;i<=(rows-1);i++){
    for(j=0;j<i;j++){
        System.out.println("");
    }
    for(k=i;k<=(rows-1);k++){
        System.out.println("*" +" ");
        System.out.println(" ");
    }
    for(i=(rows-1) ;i>=0;i--)
        for(j=0;j<i;j++){
            System.out.println("");
}

     for(k=i;k<=(rows-1);k++){
         System.out.println("*"+ " ");
     }

System.out.println(" ");
    }
scannerobj.close();

    
}  
}

import java.util.Scanner;
public class ArrayDemo2 {
    public static void main(String...args){
        int num;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the no of elements you want to store");
        num=obj.nextInt();
        int arr[]=new int[num];//here we give array size
        System.out.println("enter the elements of array");
        
        for (int i=0;i<num;i++){ //we use for loop to print  the array
          arr[i]=obj.nextInt();
        }
        System.out.println("array elements are :");
         for (int m:arr){   //here we use for each loop to print the array elements
             System.out.println(m);
         }


    }
    
}

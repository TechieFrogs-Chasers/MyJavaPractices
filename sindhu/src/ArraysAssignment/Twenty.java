package sindhu.src.ArraysAssignment;

import java.util.Scanner;

public class Twenty {
    /*public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int n;    //Declare size of an array
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();    //Intialize the array size
        
        int arr[]=new int[n];   //Declare an array
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();    //Initialize the array elements
        }
        //Print the even elements
        System.out.println("The Even Elements are...");
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)   //Check whether even or not
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println(" ");
        
        //Print the odd elements
        System.out.println("The Odd Elements are...");
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)   //check whether odd or not
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}*/


    public static void main(String[] args) 
    { 
        //Take input from the user
        Scanner sc=new Scanner(System.in);
        
        int n;    //Declare size of an array
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();    //Intialize the array size
        
        int arr[]=new int[n];   //Declare an array
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();    //Initialize the array elements
        }
        System.out.println("The Even Elements are...");
        printEven(arr,n);    //Method to print even elements
        System.out.println(" ");
        System.out.println("The Odd Elements are...");
        printOdd(arr,n);    //Method to print odd elements
           
    } 
    
    //Method to print the even elements
    static void printEven(int arr[], int n)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    
    //Method to print the odd elements 
    static void printOdd(int arr[], int n)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}


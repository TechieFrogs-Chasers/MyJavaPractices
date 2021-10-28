package Assignment6;

public class Duplicatearray {
    public static void main(String[] args) {
        int arr[]={1,5,6,8,7,4,2};
        boolean flag=false;
        for (int i=0;i<arr.length;i++){
         for (int j =i+1;j<arr.length;j++){
             if (arr[i]==arr[j]){
                 System.out.println("duplicate element found : "+arr[i]);
                 flag=true;
             }
             
             }
           }
           if (flag==false){
               System.out.println("no duplicate element is found");
           }
// we also can do this using Hashset from collections 
 //Hashset <string> langs= new Hashset();
 //read the values from the string using for each loop


        }
    }
    


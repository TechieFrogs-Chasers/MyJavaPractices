public class ArrayDemo {
    public static void main(String...args){

        int arr[]={0,5,6,8,9}; //simple way of creating array and storing values in them


       /* int arr[]=new int[5]; //array syntax :datatype arrayname =new datatype[size]
        arr[0]=1;
        arr[1]=5;
        arr[2]=8;           //storing the values in the array
        arr[3]=7;
        arr[4]=9;
        // to print array  we use for loop or for each loop

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }*/
        
       //now we use for each loop 

       for(int m:arr){ //storing all the array values in the variable m
           System.out.println(m);
       } 
    }
    
}

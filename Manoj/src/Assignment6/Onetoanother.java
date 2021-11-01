package Assignment6;

import java.util.Arrays;

public class Onetoanother {
    public static void main(String...args){
        int a[]={1,2,3,4,5};
        int b[]=new int[a.length];//giving a lenth in b array
        for(int i=0;i<a.length;i++){ //corying a array into another  arrray 
            System.out.println("values in a are: "+ a[i]);
            b[i]=a[i];  //placing a array value in b array 
        } 
        for (int i =0;i<b.length;i++){
            System.out.println("now the values in b from a are :"+b[i]);
                }
         
       //now using  copyOf method arrays.copyOf()
       //arrays.copyOf (int[] orginal ,int newlength )
       b=Arrays.copyOf(a,a.length); //we have to import the arrays by util package 
       for(int i=0;i<b.length;i++){
           System.out.println("values in b are using copyofmethod: "+b[i]);
       }

       //now using system.arraycopy()
       //system.arraycopy(obj src,intsrcposi,objdest,intdest,intlength) syntax 
       System.arraycopy(a, 0, b,0,a.length);
       for (int i=0;i<=b.length;i++){
           System.out.println("valuesin b are using system.array: "+b[i]);
       }

       //object.clone()
       b=a.clone();
       for(int i=0;i<b.length;i++){
           System.out.println("values in b are cloned by a :"+ b[i]);
       }
    }
    
}

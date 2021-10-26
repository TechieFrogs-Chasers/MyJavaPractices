public class ArrayLoops {
    
    public static void main(String[] args) {
        
         // for loop


       int[] age = new int[]{17,21,65,45,32};

       for(int j= age.length-1; j>=0; j--){
           System.out.println(age[j]);  // prints 32,45,65,21,17
       }

       //for loop with condition

       for(int i=0; i<age.length; i++){
           if(age[i]<16)
           System.out.println("minor");
         else  if(age[i]>=16 && age[i]<=60)

            System.out.println("adult");
           
         else  if(age[i]>=61)
               System.out.println("senior");
           
           else
           {System.out.println("dont know");}

       
        System.out.println(age[i]);

        }


        //finding max value in a given array

        int max=age[0];
        for(int i=1; i<age.length; i++){
            if(age[i]>max)
            max= age[i];
        }
            System.out.println("maximum is "+max);

        
        //for each loop ---------------------------------------------------------------------

        int[] money = new int[]{90,150,500,700};

        int total=0;
        for (int k : money) {
            System.out.println(k);  // prints 90,150,500,700
           total += k;
           System.out.println(total);
            
        }

        for (int i : money) { //loop with condition

            if(i<=100)   // no need to use age[i] like we use in the for loop
            System.out.println("little");
            else if(i>=100 && i<=200)
            System.out.println("moderate");
            else if(i>200)
            System.out.println("high");
            System.out.println(i);
        }

        int max1=0;     // finding max number in a given array
        for (int j : money) {
            if(j>max1)
            max1=j;
            
        }
        System.out.println("maximum in array is  "+max1);

    }
}

public class Arraymeth {
    static void metharr(){
        char ch[]={65,66,67};
        for(char j:ch){
        System.out.println("values in method array: "+j);
        }

    }
    static void metharr2(Double arr2[]){ //passing a paramter method 
         for (int k=0;k<arr2.length;k++){
             System.out.println(arr2[k]);
         }

      /*  for(Double k:arr2){
        System.out.println("valuues in method parameter  are : "+ k);
        }*/
    }
    static void metharr3(int arr3[] ){  //calling a annonymous array which does't have any name for that array
        for(int l=0;l<arr3.length;l++){
            System.out.println(arr3[l]);

        }
    }

     public static void main(String... args) {
       /*  int [] arr=new int[3]; //intialize  declaring 
         arr[0]=5;
         arr[1]=6;
         arr[2]=9;*/
         int []arr={1,2,3,4};
         for (int i=0;i<arr.length;i++){
             System.out.println("values of array:  "+ arr[i]);
         }
         metharr();

         Double d[]={1.2,2.3,3.6,5.5}; //calling  param
         metharr2(d);

        metharr3(new int[]{5,6,8,9} );//calling annonymous method 
    }
    
}
